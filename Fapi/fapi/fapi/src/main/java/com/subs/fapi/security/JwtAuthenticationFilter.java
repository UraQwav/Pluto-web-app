//package com.subs.fapi.security;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.security.InvalidKeyException;
//
//public class JwtAuthenticationFilter  extends UsernamePasswordAuthenticationFilter {
//
//    private AuthenticationManager authenticationManager;
//    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//}
//
//
