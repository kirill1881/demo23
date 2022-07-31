package com.example.demo.repos;

import com.example.demo.models.JsonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JsonRepo extends JpaRepository<JsonModel, Long> {

}
