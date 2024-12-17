package com.min.myapp;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.min.myapp.dao.IBlogDao;
import com.min.myapp.dto.BlogDto;


@SpringJUnitConfig(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
                                "file:src/main/webapp/WEB-INF/spring/root-context.xml"})
class BlogDaoTest {

  @Autowired
  private IBlogDao blogDao;
  
  
  @Test
  void 목록테스트() {
    assertEquals(100, blogDao.selectBlogList().get(0).getHit());
  }

  @Test
  void 상세테스트() {
    int blog_id = 2;
    assertEquals("표고버섯구이", blogDao.selectBlogById(blog_id).getTitle());
  }
  
  @Test
  void 전체행개수테스트() {
    assertEquals(2, blogDao.selectBlogCount());
  }
  @Test
  void 수정테스트() {
    int blog_id = blogDao.selectBlogList().get(0).getBlog_id();
    BlogDto blogDto = BlogDto.builder()
                        .title("수정_테스트제목")
                        .contents("수정_데스트내용")
                        .blog_id(blog_id)
                        .build();
    blogDao.updateBlog(blogDto);
  assertEquals("수정_테스트제목",blogDao.selectBlogById(blog_id).getTitle());
  }
}
