package gan.cloud.co.id.models.security;


import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arganabdullah
 * Date: 12/9/13
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "TN_SEC_ROLE", uniqueConstraints = {@UniqueConstraint(columnNames = {"CV_ROLE_NAME"},name = "SEC_ROLE_UX1")})
public class Role implements Serializable {

    private static final long serialVersionUID = -3232324357657628L;


    @Id
    @Column(name = "CV_ROLE_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "groupSequence")
    @SequenceGenerator(name = "groupSequence", sequenceName = "GROUP_SEQ")
    private Long id;
    @Column(name = "CV_ROLE_NAME", unique = true)
    private String name;

    @Column(name = "CV_DESCRIPTION")
    private String description;

    @Transient
    private List<String> accessString;

    public Role() {
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TN_SEC_ROLE_ACCESS", joinColumns = @JoinColumn(name = "CV_ROLE_ID", unique = false), inverseJoinColumns = @JoinColumn(name = "CV_AUTHORITY", unique = false))
    @ForeignKey(name = "FK_ROLE_ACCESS1",inverseName = "FK_ROLE_ACCESS2" )
    private List<Access> accessList = new ArrayList<Access>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
    }

    public List<String> getAccessString() {
        accessString = new ArrayList<String>();

        for (Access a : accessList) {
            accessString.add(a.getAuthority());
        }

        return accessString;
    }

    public void setAccessString(List<String> accessString) {
        this.accessString = accessString;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", accessString=" + accessString +
                '}';
    }

}
