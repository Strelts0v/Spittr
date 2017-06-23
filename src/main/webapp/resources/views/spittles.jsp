<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Spittr</title>
</head>
<body>
 <h2>Your spittles</h2>
 <ul>
  <c:forEach items="${spittles}" var="spittle" >
     <li>
         <div>spittle id: Id: <c:out value="${spittle.spittleId}" /></div>
         <div class="spittleMessage">
             <c:out value="${spittle.content}" />
         </div>
         <div>
             Author's id: <span class="spittleAuthor"><c:out value="${spittle.authorsId}" /></span>
             <br><span class="spittleTime"><c:out value="${spittle.date}" /></span>
         </div>
     </li>
  </c:forEach>
 </ul>
</body>
</html>
