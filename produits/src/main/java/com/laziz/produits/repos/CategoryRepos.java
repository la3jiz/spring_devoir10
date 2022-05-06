package com.laziz.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laziz.produits.entities.Categorie;

@Repository
public interface CategoryRepos extends JpaRepository<Categorie, Long> {
	
}
