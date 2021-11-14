package com.sau.bookcigi.controller;

import com.sau.bookcigi.domain.entity.Post;
import com.sau.bookcigi.repository.PostRepository;
import com.sau.bookcigi.service.PostService;
import com.sau.bookcigi.vo.PostVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    @Autowired //생성자 setter 필드 3가지의 경우에 사용가능 필요한 의존객체의 "타입"에 해당하는 빈을 찾아 주입(IoC컨테이너안에 존재하는 Bean을 자동으로 주입)
    PostService postService;


    @PostMapping("")
    public String insertPost(@RequestBody PostVo postvo){
        postService.insertPost(postvo);
        return "insert Test입니다.";
    }

    @GetMapping("")
    public List<Post> findAllPost(){
        return postService.selectPost();
    }


    @PutMapping("")
    public String  updatePost(@RequestBody PostVo postVo){
        postService.updatePost(postVo);
        return "update입니다.";
    }

    @DeleteMapping("/{postToken}")
    public String deletePost(@PathVariable("postToken") int postToken){
    postService.deletePost(postToken);
        return "delete Test입니다.";
    }

}
