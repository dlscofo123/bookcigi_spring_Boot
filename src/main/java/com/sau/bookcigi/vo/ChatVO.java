package com.sau.bookcigi.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.sql.Timestamp;


@Getter
@Setter
public class ChatVO {

    @Id
    private String token;
    private int post_token;
    private int user_studentnum;
    private Timestamp timestamp;
    private String contents;
}
