package com.example.service.impl;

import java.util.List;

import com.example.entities.Comments;
import com.example.repository.CommentsRepository;
import com.example.service.CommentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	private CommentsRepository favoriteRepository;

	public List<Comments> getAll() {
		return favoriteRepository.findAll();
	}
	
	@Override
	public Long create(Comments entity) {
		favoriteRepository.save(entity);
		return entity.getId();
	}

	@Override
	public Comments getOneById(Long id) {
		return favoriteRepository.findById(id).orElseThrow(() -> new RuntimeException("Package Favorite Not Found!"));
	}

	@Override
	public void update(Long id, Comments entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Long id) {
		favoriteRepository.deleteById(id);
	}
}
