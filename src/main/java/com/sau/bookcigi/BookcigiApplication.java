package com.sau.bookcigi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.reactive.HiddenHttpMethodFilter;

@EnableJpaAuditing //PostTimeentity에 사용되는 어노테이션 https://velog.io/@aidenshin/%EC%97%94%ED%8B%B0%ED%8B%B0-%EC%9E%91%EC%84%B1-JPA-Auddit-%EC%A0%81%EC%9A%A9
@SpringBootApplication
public class BookcigiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookcigiApplication.class, args);
    }

//    @Bean
//    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//        return new HiddenHttpMethodFilter();
//    }

}
