package com.tecgurus.contact_list.dao;

public interface CRUD <T, K>{
	T getById(K id);
	void create(T t);
	void update(T t);
	void delete(K id);
}
