/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.iranianmatch.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hamid
 */
// or import javax.faces.bean.SessionScoped;
@ManagedBean(name = "member") // @Named("user")
@SessionScoped
public class Member extends AbstractUser implements Serializable {

    public static int anzahl = 0;
    private String aboutMe;


    public Member() {
        super();
        anzahl++;
    }
    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getGreeting() {

        if (getLoginname().length() == 0) {
            return "";
        } else {
            return "Welcome to JSF2  " + getLoginname() + " Your password:" + getPassword()
                    + "anzahl memberobjekte" + anzahl;
        }
    }
}