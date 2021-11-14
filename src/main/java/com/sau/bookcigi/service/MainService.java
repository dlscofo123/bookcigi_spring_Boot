package com.sau.bookcigi.service;

import com.sau.bookcigi.domain.entity.Post;
import com.sau.bookcigi.domain.entity.User;
import com.sau.bookcigi.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

//public class MainService {
//
//
//
//    private List<User> findMyPost(Long UserId, User user) {
//        List<User> UserPost = UserService.findAllByMyPost(); //자기자신의 포스트를 보여주는 내용
//        UserPost.add(user);
//
//        return UserPost;
//    }
//    public List<mainResponse> fetchPagesBy(int size, int book_token) {
//        List<mainResponse> mainResponses = mainResponse.findfetchPost();
//        return mainResponses;
//    }
//
//
//    private Page<Post> fetchPages(int size, List<Post> Post) {
//        PageRequest pageRequest = PageRequest.of(0, size); // 페이지네이션을 위한 PageRequest, 페이지는 0으로 고정한다.
//        return PostRepository.findById(); // JPA 쿼리 메소드
//
//    }
//}
