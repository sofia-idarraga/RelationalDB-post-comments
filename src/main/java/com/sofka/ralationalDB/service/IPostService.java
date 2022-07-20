package com.sofka.ralationalDB.service;

import com.sofka.ralationalDB.entity.Comment;
import com.sofka.ralationalDB.entity.Post;

import java.util.List;

public interface IPostService {

    Post createPost(Post post);
    Post createComment(Comment comment);
    void deletePost(Post post);
    void deleteComment(Comment comment);

    List<Post> findAllPost();
}
