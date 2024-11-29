package com.min.pkg03_pr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
  
  @RequestMapping(value="/", method=RequestMethod.GET)
  public String welcome() {
    return "home";
  }

  @RequestMapping(value="list", method=RequestMethod.GET)
  public void letsgo() {
    
  }

  @RequestMapping(value="/board/view")
  public ModelAndView gogogo() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("detail");
    mav.addObject("number", 20);
    return mav;
  }
  
}
