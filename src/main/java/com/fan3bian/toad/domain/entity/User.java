package com.fan3bian.toad.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
}