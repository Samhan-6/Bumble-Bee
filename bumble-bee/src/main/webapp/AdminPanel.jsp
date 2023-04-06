<%-- 
    Document   : AdminPanel
    Created on : Apr 6, 2023, 12:15:30 AM
    Author     : Computer Hub
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.util.UUID"%>
<%@page import="com.webapp.bumble.bee.model.Admin"%>
<%@page import="com.webapp.bumble.bee.dao.AdminDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    
       
    <body>
        
        <% 
        
        AdminDAO adminDAO = new AdminDAO();
         
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;
    
        if(!adminDAO.adminLogin(connection, username, password)){
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
        
        <h1> Hello <%= request.getAttribute("username") %> ! </h1>
        
    </body>
</html>
