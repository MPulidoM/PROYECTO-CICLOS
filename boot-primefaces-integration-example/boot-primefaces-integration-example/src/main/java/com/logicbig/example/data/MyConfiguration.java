package com.logicbig.example.data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MyConfiguration {

    @Id
    private String username;

    private String password;

    public MyConfiguration(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public MyConfiguration() {
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

    @Override
    public String toString() {
        return "Configuration{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyConfiguration that = (MyConfiguration) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
