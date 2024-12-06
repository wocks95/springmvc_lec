package com.min.myapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.myapp.dao.IBlogDao;
import com.min.myapp.dto.BlogDto;

@Service
public class BlogServiceImpl implements IBlogService {
  private IBlogDao blogDao;
  
  @Autowired
  public void prepare(IBlogDao blogDao) {
    this.blogDao = blogDao;
  }
  
  @Override
  public Map<String, Object> getBlogList() {
    List<BlogDto> blogList = blogDao.selectBlogList();
    int count = blogDao.selectBlogCount();
    
    return Map.of("blogList", blogList, "count", count);
  }

  @Override
  public int increseBlogHit(int blog_id) {
    
    return 0;
  }

  @Override
  public BlogDto getBlogById(int blog_id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String registerBlog(BlogDto blogDto) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String modifyBLog(BlogDto blogDto) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String removeBlog(int blog_id) {
    // TODO Auto-generated method stub
    return null;
  }

}
