package com.sau.bookcigi.vo;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
public class PostVo {

    private int post_token;
    private String post_name;
    private int user_token;
    private int book_token;
    private int is_sell;
    private String  description;
    private int major;
    private BigDecimal price;
    private String image_uri;
    private Timestamp indate;

}
