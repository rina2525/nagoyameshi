package com.example.taberogu.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taberogu.entity.Category;
import com.example.taberogu.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{
	 public Page<Restaurant> findByNameLike(String keyword, Pageable pageable);
	 List<Restaurant>findBycategory_id(Integer category);
	public List<Restaurant> findByCategory(Category categories);
	public Page<Restaurant> findBycategory_id(Integer categoryId, Pageable pageable);
	 
	 
}

