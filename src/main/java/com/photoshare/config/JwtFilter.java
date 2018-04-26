package com.photoshare.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;


public class JwtFilter extends GenericFilterBean { // JSON Web Token Filter  
	@Override
	public void doFilter(final ServletRequest req,  final ServletResponse res, final FilterChain chain)  throws IOException, ServletException {
		
		// TODO Auto-generated method stub
		
	        final HttpServletRequest  request  = (HttpServletRequest) req;
	        final HttpServletResponse response = (HttpServletResponse) res;

	        final String authHeader =  request.getHeader("authorization");


	        if("OPTIONS".equals(request.getMethod())) {
	            response.setStatus(HttpServletResponse.SC_OK);

	            chain.doFilter(req, res);
	        } else {

	            if(authHeader == null || !authHeader.startsWith("Bearer ")){
	                throw new ServletException("Missing or invalid Authorization header -> MIA");
	            }

	            final String token = authHeader.substring(7); // "Bearer " son 7 caracteres....

	            try {
	                final Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
	                request.setAttribute("claims", claims);
	            } catch(final SignatureException e) {
	                throw new ServletException("Invalid token -> MIA");
	            }

	            chain.doFilter(req, res);
	        }
		
	}

}

