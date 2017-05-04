package com.zero.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: zero
 * Date: 2017/4/27
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("springTest")
public class HelloController {
    @RequestMapping(value = "index/{zero}")
    public String index(@PathVariable("zero") String zero){
        System.out.println("get" + zero);
        return "index";
    }
    @ResponseBody
    @RequestMapping("check")
    public Object check(String flag){
        return flag;
    }
}
