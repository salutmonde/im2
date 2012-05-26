/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.iranianmatch.beans;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hamid
 */
@ManagedBean(name = "AbstractUser") // @Named("user")
@SessionScoped
public class AbstractUser implements Serializable {

    private Integer Id;
    private String loginname;
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;
    private String location;
    private Date birthday;
    private String sex;
    private Education educaton;
    private String origin;
    private String passwd;
    private Familystatus familyStatus;
    private Memberstatus memberStatus;
    private String email;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Education getEducaton() {
        return educaton;
    }

    public void setEducaton(Education educaton) {
        this.educaton = educaton;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Familystatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(Familystatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Memberstatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Memberstatus memberStatus) {
        this.memberStatus = memberStatus;
    }
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
