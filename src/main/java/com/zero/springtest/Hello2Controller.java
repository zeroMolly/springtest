package com.zero.springtest;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: zero
 * Date: 2017/5/4
 * Time: 9:37
 * Spring也提供了Last-Modified机制的支持，只需要实现LastModified接口
 * Spring判断是否过期，通过如下代码，即请求的“If-Modified-Since” 大于等于当前的getLastModified方法的时间戳，则认为没有修改：
 * this.notModified = (ifModifiedSince >= (lastModifiedTimestamp / 1000 * 1000));
 */

public class Hello2Controller extends AbstractController implements LastModified{
    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<a href='www.baidu.com'>aaa</a>");
        return null;
    }
    @Override
    public long getLastModified(HttpServletRequest request) {
        if(lastModified==0L){
            lastModified=System.currentTimeMillis();
        }
        return lastModified;
    }

    public static void main(String[]args){
        System.out.print(System.currentTimeMillis()-Long.valueOf("1493865092255"));
    }
}
