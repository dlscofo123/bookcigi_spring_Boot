package com.sau.bookcigi.domain.entity.entitiyclass;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class}) //JPA 객체변화 감지
@Getter
public abstract class PostTimeEntity {

    @CreatedDate  //글 생성시간
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regdate;

    @LastModifiedDate //글 수정시간
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
