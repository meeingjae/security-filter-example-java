package com.mingvel.securityfilterexamplejava.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class ApiKeyFilter extends OncePerRequestFilter {

    //    @Autowired
    //    SomeService someService;
    //
    //    @Autowired
    //    SomeRepository someRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // someService.doService()
        // someRepository.findSome()
        filterChain.doFilter(request, response);
    }
}
