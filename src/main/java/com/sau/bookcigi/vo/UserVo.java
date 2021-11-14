package com.sau.bookcigi.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;


@Getter
@Setter
public class UserVo {

    @Id
    private int studentnum;
    private int token;
    private String name;
    private int major;
    private String profileimage;
    private String userid;
}
