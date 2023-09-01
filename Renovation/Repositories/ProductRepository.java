package com.ex.Renovation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ex.Renovation.Model.Products;

public interface ProductRepository  extends JpaRepository<Products, Integer>{

}