package com.example.service.impl;

import java.util.List;

import com.example.entities.FavoritePackage;
import com.example.repository.FavoriteRepository;
import com.example.service.FavoriteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FavoritesServiceImpl implements FavoriteService{

	@Autowired
	private FavoriteRepository favoriteRepository;

	public List<FavoritePackage> getAll() {
		return favoriteRepository.findAll();
	}
	
	@Override
	public Long create(FavoritePackage entity) {
		favoriteRepository.save(entity);
		return entity.getId();
	}

	@Override
	public FavoritePackage getOneById(Long id) {
		return favoriteRepository.findById(id).orElseThrow(() -> new RuntimeException("Package Favorite Not Found!"));
	}

	@Override
	public void update(Long id, FavoritePackage entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		favoriteRepository.deleteById(id);
	}

	
}
