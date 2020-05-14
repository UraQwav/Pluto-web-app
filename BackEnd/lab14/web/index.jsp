<%--
  Created by IntelliJ IDEA.
  User: uraqw
  Date: 5/8/2020
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jspComponents.* "%>
<%@ page import="java.util.*" %>
<html>
  <head>
    <title>$Title$</title>
    <%! String name = null;
        DateChouseJsp r = new DateChouseJsp();
    Integer n = r.GetHOUR();
    protected String Salutation(Integer h) {
      String rc = "Good ";
      if ((h > 0) && (h <= 5))
        rc += "night";
      else if ((h > 5) && (h <= 12))
        rc += "morning";
      else if ((h > 12) && (h <= 17))
        rc += "afternoon";
      else rc += "evening";      return rc;
    }
    }
    %>
  </head>
  <body>
  <div>
      <%=Salutation(n)%>
  </div>
  <table border="1" width="100%" cellpadding="5">
    <tr>
      <th>Date</th>
      <th>Weak</th>
    </tr>
    <% for (int i = 0; i<7;i++){%>
    <tr>
      <td><%=i%></td>
      <td><%=i%></td>
    </tr>
    <%}%>
  </table>
  </body>
</html>
