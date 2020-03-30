package org.kuzminski.fp8sb.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Objects;


@Entity
@Table(name = "fp_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_surname")
    private String user_surname;

    @Email
    @Column(name = "user_email")
    private String user_email;

    @Column(name = "user_password")
    private String user_password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id.equals(user.Id) &&
                user_name.equals(user.user_name) &&
                user_surname.equals(user.user_surname) &&
                user_email.equals(user.user_email) &&
                user_password.equals(user.user_password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, user_name, user_surname, user_email, user_password);
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
