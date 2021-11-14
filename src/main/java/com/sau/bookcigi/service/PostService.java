package com.sau.bookcigi.service;


import com.sau.bookcigi.domain.entity.Post;
import com.sau.bookcigi.repository.PostRepository;
import com.sau.bookcigi.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PostService {

    @Autowired
    EntityManager em;

    @Autowired
    PostRepository postRepository;


    public void insertPost(PostVo postVo){  //return Post형식 save파악가능

        postRepository.save(Post.builder()
                        .post_token(postVo.getPost_token())
                        .post_name(postVo.getPost_name())
                        .user_token(postVo.getUser_token())
                        .book_token(postVo.getBook_token())
                        .is_sell(postVo.getIs_sell())
                        .description(postVo.getDescription())
                        .major(postVo.getMajor())
                        .price(postVo.getPrice())
                        .image_uri(postVo.getImage_uri())
                        .indate(postVo.getIndate()).build());
    }

    public List<Post> selectPost(){
        //이런방식으로도 구현가능 List<Post> postList = postRepository.findAll(); return값에 postList 넣으면됨
        return postRepository.findAll();
    }

    public void updatePost(PostVo postVo){
        postRepository.save(Post.builder()
                .post_token(postVo.getPost_token())
                .post_name(postVo.getPost_name())
                .user_token(postVo.getUser_token())
                .book_token(postVo.getBook_token())
                .is_sell(postVo.getIs_sell())
                .description(postVo.getDescription())
                .major(postVo.getMajor())
                .price(postVo.getPrice())
                .image_uri(postVo.getImage_uri())
                .indate(postVo.getIndate()).build());
    }

    public void deletePost(int post_token){
        Post posts = postRepository.getById(post_token);
        postRepository.delete(posts);
    }


}
