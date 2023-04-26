package com.logicbig.example.bean;

import com.logicbig.example.data.UserService;
import com.logicbig.example.data.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@Component
@ManagedBean(name = "userBean")
public class UserBean  {
    @Autowired
    private UserService userService;
    private String username;
    private String password;

    private String personalName;

    private String profile;

    private String rol;

    private int age;

    private String phone;

    private String email;
    private String message;

    public UserBean() {
        this.username = " ";
        this.password = " ";
        this.message = " ";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addUser() {

       if (userService.userExist(username)){
           message = "Este usuario ya existe";
           System.out.println(userService.getUser(username));
           System.out.println(message);
       } else {
           userService.addUser(new Users(username, password, personalName, profile,rol, age,phone, email));
           message = " ";
       }

    }
    public String loginUser(){
        String bandera = "#{facesContext.getExternalContext().redirect(request.getRequestURI())}" ;
        if (userService.userExist(username)) {
            if(userService.getUser(username).equals(new Users(username,password))){
                bandera = "idea.xhtml";
                message = " ";
            }else {
                message = "Usuario no valido";
            }
        } else {
            message = "Usuario no valido";
        }

        return bandera;
    }
}