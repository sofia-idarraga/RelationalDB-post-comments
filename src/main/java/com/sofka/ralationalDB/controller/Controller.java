package com.sofka.ralationalDB.controller;

import com.sofka.ralationalDB.entity.Comment;
import com.sofka.ralationalDB.entity.Post;
import com.sofka.ralationalDB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPost(){
       return postService.findAllPost();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment){
        return postService.createComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post){
        postService.deletePost(post);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment){
        postService.deleteComment(comment);
    }

}
