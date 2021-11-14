package com.sau.bookcigi.domain.entity;
import com.sau.bookcigi.domain.entity.entitiyclass.PostTimeEntity;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book extends PostTimeEntity {
    @Id
    private int token;
    private String isbn;
    private String title;
    private String price;
    private String imageUri;


}
