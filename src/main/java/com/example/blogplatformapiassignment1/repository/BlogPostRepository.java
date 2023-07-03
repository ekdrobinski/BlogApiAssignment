package com.example.blogplatformapiassignment1.repository;

import com.example.blogplatformapiassignment1.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
