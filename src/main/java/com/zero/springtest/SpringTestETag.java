package com.zero.springtest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: zero
 * Date: 2017/5/4
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class SpringTestETag extends AbstractController{
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<a href='www.baidu.com'>aaa</a>");
        return null;
    }
}
