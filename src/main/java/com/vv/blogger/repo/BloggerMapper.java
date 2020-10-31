package com.vv.blogger.repo;


import com.vv.blogger.model.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BloggerMapper {
    @Insert("INSERT INTO blogger.blog (id, title, Body, createDate) VALUES(#{id}, #{title}, #{body}, #{createDate})")
    void insert(Blog user);
}
