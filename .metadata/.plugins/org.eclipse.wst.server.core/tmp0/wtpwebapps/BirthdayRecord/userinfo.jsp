<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<%@page import="entity.UserInfo" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
 <body><br>
       <table border="1">
       <tr><td>Id_phone_number</td><td>Name</td><td>Phone</td><td>Email</td><td>Nickname</td><td>Password</td><td>操作</td></tr>
       <% 
            List<UserInfo> list = (List<UserInfo>)request.getAttribute("list");
            for(UserInfo userInfo: list){
        %>
        <tr><td><%=userInfo.getId_phone_number() %></td><td><%=userInfo.getName() %></td><td><%=userInfo.getPhone() %></td><td><%=userInfo.getEmail() %></td><td><%=userInfo.getNickname() %></td><td><%=userInfo.getPassword() %></td>
        <td><a href="UserInfoServlet?method=delete&phone=<%=userInfo.getPhone() %>">删除</a><td>
        <a href="UserInfoServlet?method=toedit&phone=<%=userInfo.getPhone() %>">修改</a></td>
        </tr>  
        <% } %>
        </table>
  </body>
  <a href="registered.html">注册</a>
</html>