package com.sau.bookcigi.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Chat {

    @Id
    private String token;
    private int post_token;
    private int user_studentnum;
    private Timestamp timestamp;
    private String contents;


}
