package com.example.demomybatis;

import com.example.demomybatis.mapper.ArticleMapper;
import com.example.demomybatis.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Article article  = articleMapper.getArticle(1L);
        log.info("=====");

    }
}
