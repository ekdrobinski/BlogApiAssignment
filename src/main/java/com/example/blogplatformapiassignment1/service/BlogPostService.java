package com.example.blogplatformapiassignment1.service;

import com.example.blogplatformapiassignment1.model.BlogPost;
import com.example.blogplatformapiassignment1.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {
    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogPostRepository.findById(id);
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
        BlogPost existingBlogPost = blogPostRepository.findById(id).orElse(null);
        if (existingBlogPost != null) {
            existingBlogPost.setTitle(updatedBlogPost.getTitle());
            existingBlogPost.setContent(updatedBlogPost.getContent());
            existingBlogPost.setAuthor(updatedBlogPost.getAuthor());
            return blogPostRepository.save(existingBlogPost);
        }
        return null;
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}