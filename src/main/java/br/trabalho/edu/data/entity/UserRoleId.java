package br.trabalho.edu.data.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserRoleId implements Serializable {

    private String role;

    private User user;
}
