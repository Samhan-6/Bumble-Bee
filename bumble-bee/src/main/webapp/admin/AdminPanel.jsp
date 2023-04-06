<%-- 
    Document   : AdminPanel
    Created on : Apr 6, 2023, 12:15:30 AM
    Author     : Computer Hub
--%>

<%@page import="java.util.UUID"%>
<%@page import="com.webapp.bumble.bee.util.Util"%>
<%@page import="com.webapp.bumble.bee.model.Admin"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    
    <% 
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    if(!Util.authenticate(username, password)){
        boolean validLogin = false;
        Cookie[] cookies = request.getCookies();
        
        for(Cookie cookie : cookies){
            
            if(cookie.getName().equals("session-id")){
                String sesId = cookie.getValue();
                
                Object sessionVal = session.getAttribute(sesId);
                if(sessionVal == null){
                    break;
                }
                
                username = sessionVal.toString();
                if(username != null){
                    validLogin = true;
                    break;
                }
            }
        }
        if(!validLogin){
            response.sendRedirect("login.jsp");
        } 
    }else{
        String sessionId = UUID.randomUUID().toString().replace("-", "");
        Cookie cookie = new Cookie("session-id", sessionId);
        session.setAttribute(sessionId, username);
        response.addCookie(cookie);
    }
    
    
    
    %>
    
    <body>
        <h1>Welcome to Admin Panel</h1>
    </body>
</html>
