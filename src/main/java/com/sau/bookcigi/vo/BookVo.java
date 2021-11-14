package com.sau.bookcigi.vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BookVo {

    private int token;
    private String isbn;
    private String title;
    private String price;
    private String imageUri;
}
