package com.sau.bookcigi.repository;

import com.sau.bookcigi.domain.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,String> {
}
