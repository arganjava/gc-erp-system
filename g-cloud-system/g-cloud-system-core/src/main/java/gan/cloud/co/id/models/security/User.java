package gan.cloud.co.id.models.security;

import org.hibernate.annotations.ForeignKey;
import org.joda.time.LocalDateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Argan Megariansyah
 **/

@Entity
@Table(name = "TN_SEC_USER", uniqueConstraints = @UniqueConstraint(columnNames = "CV_USERNAME",name = "SEC_USER_UX1"))
public class User implements UserDetails, Serializable {

    private static final long serialVersionUID = -23243332357657628L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "userSequence")
    @SequenceGenerator(name = "userSequence", sequenceName = "SEC_USER_SEQ")
    @Column(name = "CN_USER_ID", unique = true, nullable = false, length = 15)
    private Long id;

    @Column(length = 50, name = "CV_USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "CV_PASSWORD", nullable = false)
    private String password;

    @Column(name = "CB_ENABLED", nullable = false)
    private boolean enabled;
    @Transient
    private boolean accountNonExpired = true;
    @Transient
    private boolean accountNonLocked = true;
    @Transient
    private boolean credentialsNonExpired = true;
    @Column(name = "CV_FULLNAME")
    private String fullname;
    @Column(name = "CV_EMAIL")
    private String email;
    @Column(name = "CV_MOBILENUMBER")
    private String mobileNumber;
    @Column(name = "CV_NOTIFICATION")
    private boolean notification;
    @Column(name = "CV_CREATOR")
    private String creator;
    @Column(name = "CN_CREATETIME")
    private Long createTime;

    @Transient
    private String createTimeStr;

    @Column(name = "CV_MODIFYTIME")
    private Long modifyTime;

    @Transient
    String modifyTimeStr;

    @Column(name = "CV_MODIFIER")
    private String modifier;
    @Column(name = "CN_OTP_VERIFIED", columnDefinition = "int(2) default '0'")
    private Integer otpVerified;
    @Column(name = "CN_LOGIN_ATTEMPT")
    private int loginAttempt;

    @Column(name = "CV_RESET_PWD_ID")
    private String resetPwdId;

    @Column(name = "CN_RESET_PWD_VALID_TIME")
    private Long resetPwdValidTime;

    @ManyToOne
    @JoinColumn(name = "CV_ROLE_ID")
    @ForeignKey(name = "FK_USER_ROLE")
    private Role role;

    @Transient
    private Date dateCreateTime;
    @Transient
    private Date dateModifyTime;


    public User(String username, boolean enabled, String fullname, String email, String mobileNumber, String creator, Date createTime, Date modifyTime, String modifier, Role role) {
        this.username = username;
        this.enabled = enabled;
        this.fullname = fullname;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.creator = creator;
        this.dateCreateTime = createTime;
        this.dateModifyTime = modifyTime;
        this.modifier = modifier;
        this.role = role;
    }

    public User() {
    }

    public Date getDateCreateTime() {
        return dateCreateTime;
    }

    public void setDateCreateTime(Date dateCreateTime) {
        this.dateCreateTime = dateCreateTime;
    }

    public Date getDateModifyTime() {
        return dateModifyTime;
    }

    public void setDateModifyTime(Date dateModifyTime) {
        this.dateModifyTime = dateModifyTime;
    }

    public int getLoginAttempt() {
        return loginAttempt;
    }

    public void setLoginAttempt(int loginAttempt) {
        this.loginAttempt = loginAttempt;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getAccessList();
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return new Date(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime.getTime() / 1000L;
    }

    public Date getModifyTime() {
        return  new Date(modifyTime);
    }

    public long getModifyTimeAsLong() {
        if(modifyTime != null){
            return modifyTime;
        }else{
            return 0l;
        }
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime.getTime() /1000L;
    }


    public Integer getOtpVerified() {
        return otpVerified;
    }

    public void setOtpVerified(Integer otpVerified) {
        this.otpVerified = otpVerified;
    }

    public String getResetPwdId() {
        return resetPwdId;
    }

    public void setResetPwdId(String resetPwdId) {
        this.resetPwdId = resetPwdId;
    }


    public void setResetPwdValidTime(Long resetPwdValidTime) {
        this.resetPwdValidTime = resetPwdValidTime;
    }


    public String getCreateTimeStr() {
        return new LocalDateTime(createTimeStr).toString("dd/MM/yyyy HH:mm:ss") ;
    }

    public String getModifyTimeStr() {
        return new LocalDateTime(modifyTimeStr).toString("dd/MM/yyyy HH:mm:ss");
    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                ", enabled=" + enabled +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", notification=" + notification +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", modifier='" + modifier + '\'' +
                ", role=" + role +
              /*  ", corporate=" + corporate +*/ /*This is error if there is a user login or logout*/

                '}';
    }
}