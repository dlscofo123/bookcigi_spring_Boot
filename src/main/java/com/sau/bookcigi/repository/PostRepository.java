package com.sau.bookcigi.repository;

import com.sau.bookcigi.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends JpaRepository<Post, Integer>{ //보통 long을 사용
}
