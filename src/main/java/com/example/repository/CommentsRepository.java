package com.example.repository;

import com.example.entities.Comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
	
	/*@Query("FROM FavoritePackage")
	List<FavoritePackage> findAll();
	
	@Query("FROM FavoritePackage WHERE user_id = ?1")
	List<FavoritePackage> findAllByUser(long id);*/
	
}
