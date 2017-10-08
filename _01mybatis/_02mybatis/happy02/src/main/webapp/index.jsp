<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body >

    <table>
        <tr>
            <td>编号</td>
            <td>标题</td>
            <td>访问量</td>
            <td>评论次数</td>
        </tr>


        <c:forEach var="item" items="${pa.getPag_user()}">
        <tr>
            <td>${item.newsid}</td>
            <td><a href="">${item.newstitle}</a></td>
            <td>${item.newsContent}</td>
            <td>${item.clickCount}</td>
        </tr>

        </c:forEach>
        <tr>
            <td>                    [${pa.getPageIndex()}/${pa.getTotalPages()}]</td>
            <td><a href="<%=path%>/News_Servlet?action=list&pageIndex=${pa.getPageIndex()-1}">上页</a></td><td>
            <a href="<%=path%>/News_Servlet?action=list&pageIndex=${pa.getPageIndex()+1}">下页</a>
        </td>
        </tr>

    </table>



</body>
</html>