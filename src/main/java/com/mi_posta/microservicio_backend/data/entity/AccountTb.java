package com.mi_posta.microservicio_backend.data.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "account")
public class AccountTb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "account_type")
    private Integer accountType;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;


}
