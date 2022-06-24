<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/31
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>商品管理页面</title>
</head>
<body>

<center><table border="1">
    <caption>商品列表</caption>
    <tr>
        <th width="100">id</th>
        <th width="100">name</th>
        <th width="100">category</th>
        <th width="100">seller_id</th>
        <th width="100">price</th>
        <th width="100">num</th>
        <th width="100">up_time</th>
        <th width="100">down_time</th>
        <th width="100">create_time</th>
        <th width="100">status</th>
    </tr>
    <%
        List<Goods> goods= (List<Goods>) request.getSession().getAttribute("goods");
        for (int i=0;i<goods.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+goods.get(i).getId()+"</td>");
            out.println("<td align=center>"+goods.get(i).getName()+"</td>");
            out.println("<td align=center>"+goods.get(i).getCategory()+"</td>");
            out.println("<td align=center>"+goods.get(i).getSell_id()+"</td>");
            out.println("<td align=center>"+goods.get(i).getPrice()+"</td>");
            out.println("<td align=center>"+goods.get(i).getNum()+"</td>");
            out.println("<td align=center>"+goods.get(i).getUp_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getDown_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getCreate_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getStatus()+"</td>");
            out.println("</tr>");
        }
    %>
</table></center>
<h1>以下为上架清单</h1>
<center><form action="/seller/up_sho" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    category <input type="text" name="category"><br>
    price <input type="text" name="price"><br>
    num <input type="text" name="num"><br>
    status(1为正常出售) <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击上架"><br>
</form></center>
<h1>以下为下架清单</h1>
<center><form action="/seller/down_sho" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    <input type="submit" name="submit" value="点击下架"><br>
</form></center>
<h1>以下为修改商品清单</h1>
<center><form action="/seller/update_sho" method="post">
    id <input type="text" name="id"><br>
    请输入要修改的内容：
    name <input type="text" name="name"><br>
    category <input type="text" name="category"><br>
    price <input type="text" name="price"><br>
    num <input type="text" name="num"><br>
    status(1为正常出售) <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击修改"><br>
</form></center>
<a href="/seller/back">返回</a>
</body>
</html>
