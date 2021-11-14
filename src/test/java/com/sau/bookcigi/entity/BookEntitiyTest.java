package com.sau.bookcigi.entity;


import com.sau.bookcigi.domain.entity.Book;
import com.sau.bookcigi.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;

import java.util.stream.IntStream;

@SpringBootTest
public class BookEntitiyTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void insertTest(){
        IntStream.range(1,300).forEach( i ->{

            Book book = Book.builder()
                    .token(i)
                    .isbn("Isbn"+i)
                    .title("안녕"+i)
                    .price("price"+i)
                    .imageUri("String"+i)
                    .build();
          System.out.println(bookRepository.save(book));
        });
    }
}
