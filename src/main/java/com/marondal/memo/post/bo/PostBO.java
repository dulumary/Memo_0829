package com.marondal.memo.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.memo.post.dao.PostDAO;
import com.marondal.memo.post.model.Post;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;
	
	public int addPost(int userId, String title, String content) {
		
		return postDAO.insertPost(userId, title, content);
	}
	
	// 로그인한 사용자의 메모 리스트를 얻어 오는 기능

	public List<Post> getPostList(int userId) {
		return postDAO.selectPostList(userId);
			
	}
	
	// id와 일치하는 하나의 메모 얻어 오는 기능
	public Post getPost(int id) {
		return postDAO.selectPost(id);
	}

}
