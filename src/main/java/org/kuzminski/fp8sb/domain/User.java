package org.kuzminski.fp8sb.domain;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Email;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "fp_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_surname")
    private String user_surname;

    @Email
    @Column(name = "user_email")
    private String user_email;

    @Column(name = "user_password")
    private String user_password;


//    public User(String user_name, String user_surname, String user_email, String user_password) {
//        this.user_name = user_name;
//        this.user_surname = user_surname;
//        this.user_email = user_email;
//        this.user_password = user_password;
//    }
}
