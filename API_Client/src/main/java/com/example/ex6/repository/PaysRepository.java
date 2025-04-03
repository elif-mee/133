package com.example.ex6.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.ex6.model.Cat;

// This will be AUTO IMPLEMENTED by Spring into a Bean called SkieurRepository
// CRUD refers Create, Read, Update, Delete

public interface PaysRepository extends CrudRepository<Cat, Integer> {

}