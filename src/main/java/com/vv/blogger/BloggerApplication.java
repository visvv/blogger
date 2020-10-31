package com.vv.blogger;

import com.vv.blogger.model.Blog;
import com.vv.blogger.repo.BloggerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.time.LocalDateTime;
import java.util.Date;

// excluding hibernate auto-configuration
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class BloggerApplication implements CommandLineRunner {

    @Autowired
    BloggerMapper bloggerMapper;


    @Override
    public void run(String... args) throws Exception {
        Blog blog = new Blog();
        blog.setId(1);
        blog.setTitle("AAAA");
        blog.setBody("new body");
        blog.setCreateDate(new Date());
        this.bloggerMapper.insert(blog);
    }

    public static void main(String[] args) {
        SpringApplication.run(BloggerApplication.class, args);
    }
}
