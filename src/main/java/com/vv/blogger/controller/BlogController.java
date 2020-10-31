package com.vv.blogger.controller;

import com.vv.blogger.model.Blog;
import com.vv.blogger.repo.BloggerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {
    @Autowired
    private BloggerMapper bloggerMapper;

    @GetMapping("/blog")
    public Blog getBlog(@RequestParam("id") Integer blogId) {
        return bloggerMapper.getBlog(blogId);
    }

    @PostMapping("/blog")
    public Blog createBlog(@RequestBody Blog blog) {
        this.bloggerMapper.insert(blog);
        return blog;
    }


    @DeleteMapping("/blog")
    public void deleteBlog(@RequestParam("id") Integer blogId) {
        this.bloggerMapper.deleteBlog(blogId);
    }

    @PutMapping("/blog")
    public Blog updateBlog(@RequestBody Blog blog) {
        this.bloggerMapper.update(blog);
        return blog;
    }
}
