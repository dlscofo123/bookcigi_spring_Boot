package com.sau.bookcigi.domain.entity;


import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User {

    @Id
    private int studentnum;
    private int token;
    private String name;
    private int major;
    private String profileimage;
    private String userid;

}
