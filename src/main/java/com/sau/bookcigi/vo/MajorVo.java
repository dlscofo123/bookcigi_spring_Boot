package com.sau.bookcigi.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter

public class MajorVo {

    @Id
    private int code;
    private String name;
}
