<%--
  Created by IntelliJ IDEA.
  User: zhangxiaohu
  Date: 2023/2/3
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--把数据封装到Account中--%>
<%--    <form action="param/saveAccount" method="post">--%>
<%--        姓名: <input type="text" name="username" /><br>--%>
<%--        密码: <input type="text" name="password" /><br>--%>
<%--        金额: <input type="text" name="money" /><br>--%>
<%--        金额: <input type="text" name="user.uname" /><br>--%>
<%--        金额: <input type="text" name="user.age" /><br>--%>
<%--        <input type="submit" value="提交"><br>--%>
<%--    </form>--%>
        <%--把数据封装到map,list中--%>
        <form action="param/saveAccount" method="post">
            姓名: <input type="text" name="username" /><br>
            密码: <input type="text" name="password" /><br>
            金额: <input type="text" name="money" /><br>
            金额: <input type="text" name="list[0].uname" /><br>
            金额: <input type="text" name="list[0].age" /><br>
            金额: <input type="text" name="map['one'].uname" /><br>
            金额: <input type="text" name="map['two'].age" /><br>
            <input type="submit" value="提交"><br>
        </form>
</body>
</html>
