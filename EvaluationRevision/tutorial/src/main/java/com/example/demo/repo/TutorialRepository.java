package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tutorial;
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer>{
//	public List<Tutorial> findAll();
}
