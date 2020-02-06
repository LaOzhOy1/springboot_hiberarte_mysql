package laozhoy1.starter.springbootredishiberatemysql.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Demo class
 *
 * @module test
 * @blame 吴经纶
 * @author laozhoy1
 * @since 20/1/13 17:57
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String showIndex(){
        return "hello";
    }
    @GetMapping("/getTestInfo")
    @ResponseBody
    public String getTestInfo()
    {
        return "接受成功";
    }

}
