package com.sau.bookcigi.repository;

import com.sau.bookcigi.domain.entity.Banner;
import com.sau.bookcigi.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BannerRepository extends JpaRepository<Banner, String>, QuerydslPredicateExecutor<Book> {
}
