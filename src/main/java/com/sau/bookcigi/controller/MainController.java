package com.sau.bookcigi.controller;

import com.sau.bookcigi.domain.entity.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

/*
    public ResponseEntity<List<mainResponse>> getMainPages(@RequestParam int size, Post post) {
        List<mainResponse> articleResponses = MainService.fetchPagesBy(size, post.getBook_token());
        return new ResponseEntity<>(articleResponses, HttpStatus.OK);
    }*/


}
