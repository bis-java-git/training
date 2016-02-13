<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h2>Application Error, please contact support.</h2>

            <br/>
            <br/>
            <a href="http://localhost:8080/trainingapp/index.jsp">Please try following link  </a>
            <br/>
            <br/>
            <br/>
            Powered by <a href="www.softwarehouse.co">Business Integration Software Ltd.</a>

        Requested URL= ${url}<br><br>

        <!--
	    <strong>Exception Stack Trace</strong><br>
	    Failed URL: ${url}
        Exception:  ${exc.message}
	    <c:forEach items="${exc.stackTrace}" var="ste">
    		${ste}
		</c:forEach>
        -->

</body>
</html>
