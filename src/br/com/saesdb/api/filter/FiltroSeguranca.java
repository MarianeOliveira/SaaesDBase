package br.com.saesdb.api.filter;

import br.com.saesdb.util.SSOUtil;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FiltroSeguranca implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        HttpSession httpSession = httpServletRequest.getSession();
        if (httpSession.getAttribute("login") == null && !httpServletRequest.getRequestURI().endsWith("login.xhtml") ) {
            String location = httpServletRequest.getContextPath() + "/login.xhtml";
            httpServletResponse.sendRedirect( location );
            return;
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    public void enviaPaginaLogin(HttpServletResponse response, HttpServletRequest httpServletRequest) {
        try {
            response.sendRedirect(SSOUtil.getURL_LOGIN(httpServletRequest));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
