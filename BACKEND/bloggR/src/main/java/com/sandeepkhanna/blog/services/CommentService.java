package com.sandeepkhanna.blog.services;

import com.sandeepkhanna.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId, Integer userId);
	
	void deleteComment(Integer commentId);
	
	
}
