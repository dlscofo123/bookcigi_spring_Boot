package com.sau.bookcigi.domain.entity;

import com.sau.bookcigi.domain.entity.entitiyclass.PostTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity // (name = "Post") 다른 블로그에 이렇게 사용했다 한번보자
// 엔티티클래스는 JPA에서는 반드시 이 어노테이션을 추가해야한다.@Entitiy는 해당클래스가 엔티티를 위한 클래스이며 해당클래스의 인스턴스들이
// JPA로 관리되는 엔티티 객체라는것을 의미한다. 또한 옵션에따라 테이블을 자동으로 생성가능하다.멤버변수에 따라 칼럼도 생성가능
public class Post extends PostTimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //키생성전략으로 primary key에 자동으로 생성되는값을 넣을때 사용한다.
    private int post_token;                            //DB에 대문자가 들어간다면 오류가 일어난다! 무조건 소문자처리
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
