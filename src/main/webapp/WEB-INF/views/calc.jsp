<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include.jsp" %>

<script type="text/javascript" src="<c:url value='/js/jquery-2.0.2.js'/>"></script>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Calculator</title>
    </head>
<script type="text/javascript">
   function add(){
    number1=$("#CALC_VALUE1_ID").val();
    number2=$("#CALC_VALUE2_ID").val();
    console.log("add");
    var url="/trainingapp/calc/add/"+number1+"/"+number2;
     $.ajaxSetup({async: false});
     $.get(url,function(data){
     $("#CALC_RESULT_ID").val(data);
     });
     }


     function subtract(){
         number1=$("#CALC_VALUE1_ID").val();
         number2=$("#CALC_VALUE2_ID").val();
         console.log("subtract");
         var url="/trainingapp/calc/subtract/"+number1+"/"+number2;
          $.ajaxSetup({async: false});
          $.get(url,function(data){
          $("#CALC_RESULT_ID").val(data);
          });
          }


     function multiply(){
         number1=$("#CALC_VALUE1_ID").val();
         number2=$("#CALC_VALUE2_ID").val();
         console.log("multiply");
         var url="/trainingapp/calc/multiply/"+number1+"/"+number2;
          $.ajaxSetup({async: false});
          $.get(url,function(data){
          $("#CALC_RESULT_ID").val(data);
          });
          }


     function divide(){
        number1=$("#CALC_VALUE1_ID").val();
        number2=$("#CALC_VALUE2_ID").val();
        console.log("divide");
        var url="/trainingapp/calc/divide/"+number1+"/"+number2;
         $.ajaxSetup({async: false});
        $.get(url,function(data){
            $("#CALC_RESULT_ID").val(data);
        });
     }
   </script>


<body>
<h2>
Simple Web Calculator
<h2>

<input id="CALC_VALUE1_ID" type="text" />
<input id="CALC_VALUE2_ID" type="text" />
<input type="button" value="+" onclick="return add();" id="CLICK_ADD_ID" />
<input type="button" value="-" onclick="return subtract();" id="CLICK_SUBTRACT_ID" />
<input type="button" value="*" onclick="return multiply();" id="CLICK_MULTIPLY_ID"/>
<input type="button" value="/" onclick="return divide();" id="CLICK_DIVIDE_ID"/>
<input id="CALC_RESULT_ID" readonly="readonly" type="text"></input>


</body>
</html>