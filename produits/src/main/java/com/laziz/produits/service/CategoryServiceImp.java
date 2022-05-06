package com.laziz.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laziz.produits.entities.Categorie;
import com.laziz.produits.repos.CategoryRepos;

@Service
public class CategoryServiceImp implements CategoryService{
	
	@Autowired
	private CategoryRepos catRepository;
	
	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return catRepository.findAll();
	}

}
