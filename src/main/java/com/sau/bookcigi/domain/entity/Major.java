package com.sau.bookcigi.domain.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Major {

    @Id
    private int code;
    private String name;

}
