package br.trabalho.edu.data.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_role")
@IdClass(UserRoleId.class)
public class UserRole {

    @Id
    @Column(name = "role")
    private String role;

    @Id
    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;
}
