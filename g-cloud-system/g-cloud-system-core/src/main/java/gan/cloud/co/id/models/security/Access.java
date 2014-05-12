package gan.cloud.co.id.models.security;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Deny Prasetyo,S.T
 * Java(Script) and Rails Developer
 * Software Engineer | PT. NetXcel Systems Indonesia
 * jasoet87@gmail.com
 * dprasetyo@netxcel.com.sg | www.netxcel.com.sg
 * <p/>
 * http://github.com/jasoet
 * http://bitbucket.com/jasoet
 *
 * @jasoet
 */

@Entity
@Table(name = "TN_SEC_ACCESS", uniqueConstraints = @UniqueConstraint(columnNames = {"CV_AUTHORITY"}, name = "SEC_ACCESS_UX1"))
public class Access implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = -3433899042356843128L;
    @Id
    @Column(name = "CV_AUTHORITY", length = 50, unique = true)
    private String authority;
    @Column(name = "CV_DESCRIPTION")
    private String description;
    @Column(name = "CV_CREATOR")
    private String creator;
    @Column(name = "CN_CREATETIME")
    private Long createTime;


    public Access() {
    }

    public Access(String authority) {
        this.authority = authority;
    }

    public Access(String authority, String description, String creator, Long createTime) {
        this.authority = authority;
        this.description = description;
        this.creator = creator;
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

   /* public Date getCreateTime() {
        return DateUtil.unitTimestampToDate(createTime);
    }*/

   /* public void setCreateTime(Date createTime) {
        this.createTime = DateUtil.dateToUnixTimestamp(createTime);
    }*/

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
