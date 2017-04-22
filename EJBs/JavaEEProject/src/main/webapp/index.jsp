<%--
  Created by IntelliJ IDEA.
  User: a1
  Date: 06.04.17
  Time: 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Basic HelloWorld</title>
  </head>
  <body>
    <h1>Hello, World!</h1>
  <%
    int a = 5;
    int b = 6;
    if( a + b > 10) {
      out.println( "a + b > 11");
    } else {
      out.println( "It is not a + b > 11");
    }
    out.println();
    out.println(String.format("a+b: %s", a + b) );
  %>
  </body>
</html>
