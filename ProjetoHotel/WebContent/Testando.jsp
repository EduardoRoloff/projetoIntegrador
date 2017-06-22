<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste</title>
</head>
<body>
			<%
				Cookie[] cookies = request.getCookies();
    			for(Cookie cookie: cookies){
    			 String value = URLEncoder.encode(cookie.getValue(), "UTF-8");
       			 out.println("<b>nomeCookie:</b> "+cookie.getName());    
        		 out.println("<b>Valor:</b> " + value);
       			 out.println("<br>");
    			}
			%>	
</body>
</html>