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

    public void addUser() {
       if (true){
           userService.addUser(new Users(username,password));
       } else {
           message = "Usuario no valido";
       }

    }
}