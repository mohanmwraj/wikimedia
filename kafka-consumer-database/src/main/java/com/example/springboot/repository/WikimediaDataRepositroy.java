package com.example.springboot.repository;

import com.example.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepositroy extends JpaRepository<WikimediaData, Long> {
}
