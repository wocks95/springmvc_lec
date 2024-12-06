package com.min.myapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.myapp.service.IBlogService;

@RequestMapping("/blog")
@Controller
public class BlogController {

  private IBlogService blogService;
  
  @Autowired
  public void prepare(IBlogService blogService) {
    this.blogService = blogService;
  }
  
  @RequestMapping(value="/list.do")
  public String list(Model model) {
    Map<String, Object> map = blogService.getBlogList();
    model.addAttribute("blogList", map.get("blogList"));
    model.addAttribute("count", map.get("count"));
    return "blog/list";
  }
  
  
  
}
