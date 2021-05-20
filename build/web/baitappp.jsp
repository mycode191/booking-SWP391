<%-- 
    Document   : baitappp
    Created on : Mar 31, 2021, 2:48:02 PM
    Author     : HIEU19
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border-collapse: collapse;
            }
            table, tr, td{
                border: 1px solid black;
                font-size: 30px;
            }
            a{
                text-decoration: none;
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>ID</td>
                <td>Accept</td>
               
            </tr>
            <c:forEach items="${requestScope.list}" var="list">
                <tr>
                    <td>${list.id}</td>
                    <c:if test="${list.accept == true}">
                        <td><a href="list2?id=${list.id}&acc=${false}">True</a>&nbsp;</td>
                    </c:if>
                     <c:if test="${list.accept == false}">
                        <td><a href="list2?id=${list.id}&acc=${true}">False</a>&nbsp;</td>
                    </c:if>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
