package com.axiang.service;

import com.axiang.po.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> listCommentByBlogId(Long BlogId);

    Comment saveComment(Comment comment);
}
