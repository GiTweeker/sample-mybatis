package com.example.demomybatis;

import com.example.demomybatis.mapper.ArticleMapper;
import com.example.demomybatis.pojo.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoMybatisApplicationTests {
	@Autowired
	ArticleMapper articleMapper;
	@Test
	public void contextLoads() {
		Article article = articleMapper.getArticle(1L);

		assertThat(article).isNotNull();
		assertThat(article.getId()).isEqualTo(1L);
		assertThat(article.getAuthor()).isEqualTo("Baeldung");
		assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring");
	}

}
