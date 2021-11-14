package com.sau.bookcigi.domain.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Banner {

    @Id
    private String name;
    private String imageUri;
}
