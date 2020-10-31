package com.vv.blogger.repo;


import com.vv.blogger.model.Blog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BloggerMapper {
    @Insert("INSERT INTO blogger.blog (title, Body, createDate) VALUES(#{title}, #{body}, #{createDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(Blog blog);

    @Insert("UPDATE blogger.blog SET title=#{title} ,body=#{body} WHERE id=#{id}")
    void update(Blog blog);

    @Select("SELECT * FROM blogger.blog WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "body", column = "body"),
            @Result(property = "createDate", column = "createDate"),
    })
    Blog getBlog(@Param("id") Integer id);

    @Delete("DELETE FROM blogger.blog WHERE id = #{id}")
    void deleteBlog(@Param("id") Integer id);
}
