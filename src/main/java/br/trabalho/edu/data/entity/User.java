package br.trabalho.edu.data.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Integer user_id;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String password;

    @Column(name = "nome")
    private String user_name;

    @OneToMany(mappedBy = "user")
    private List<UserRole> roles;

}
