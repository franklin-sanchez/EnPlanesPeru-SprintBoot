package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface CrudServiceComment <T, ID>{
	List<T> getAll();

	T getOneById(ID id);

	Long create(T entity);

	void update(ID id, T entity);

	void delete(ID id);
}
