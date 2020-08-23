<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2020/8/18
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
      $(function(){
        $("#btn").click(function(){
          $.post("json.do",function(data){
            var html="";
            for(var i=0;i<data.length;i++){
              html += "<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].sex+"</td></tr>";
            }
            $("#content").html(html);
          });
        });
      });
    </script>
  </head>
  <body>
  <input id="btn" value="Get Data" type="button"/>
  <table width="80%" align="center">
    <tr>
      <td>Id</td>
      <td>Name</td>
      <td>Sex</td>
    </tr>
    <tbody id="content"></tbody>
  </table>
  </body>
</html>
