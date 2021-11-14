package com.sau.bookcigi.service;

import com.sau.bookcigi.domain.entity.Post;
import com.sau.bookcigi.domain.entity.User;
import com.sau.bookcigi.repository.PostRepository;
import com.sau.bookcigi.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public class UserService {

    @Autowired
    PostRepository postRepository;

//    public static List<User> findAllByMyPost() {
//        return postRepository.findAll();
//    }

//    public  List<Post> findAllByMyPost(PostVo postVo){
//
//
//    }


}
