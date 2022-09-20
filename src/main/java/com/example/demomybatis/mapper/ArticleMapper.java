package com.example.demomybatis.mapper;

import com.example.demomybatis.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM ARTICLES WHERE id = #{id}")
    Article getArticle(@Param("id") Long id);
}
