package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.textiles;
@Repository
public interface sareerepoint extends CrudRepository<textiles, Integer> {

}
