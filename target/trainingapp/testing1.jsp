<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include.jsp" %>

<script type="text/javascript" src="<c:url value='/js/jquery-2.0.2.js'/>"></script>

<script type="text/javascript">

function process() {
    console.log("process");
    team=$("#FavoriteTeam").val();
    colour=$("#FavoriteColor").val();
    luckyNumber=$("#LuckyNumber").val();

    var url="/trainingapp/testing/"+team+"/"+colour+"/"+luckyNumber;
    $.get(url,function(data){
    $("#TESTING_MESSAGE_ID").val(data);
     });
     }


     function resetValues() {
        console.log("clear");
        $("#FavoriteTeam").val("");
        $("#FavoriteColor").val("");
        $("#LuckyNumber").val("");
        $("#TESTING_MESSAGE_ID").val("");
        }

</script>

<head>
<style type="text/css">
.auto-style1 {
	text-align: center;
}
.auto-style2 {
	text-align: left;
}
</style>
</head>

	<div class="auto-style1">
	    <p>Welcome to the Testing Page 1</p>
    	<br/>
	    <br/>
	    <p class="auto-style2">	Message: <input type="text" id="TESTING_MESSAGE_ID" style="width: 200px;" readonly="readonly" />  </p>
	    <p class="auto-style2">Please Enter the Following:</p>
	    <table>
		<tr>
			<td>Favorite team:</td>
			<td>
			<input name="FavoriteTeam" type="text" id="FavoriteTeam" title="Not blank; 25 characters max" />
			&nbsp;</td>
		</tr>
		<tr>
			<td>Favorite color:</td>
			<td style="height: 30px">
			<select name="FavoriteColor" id="FavoriteColor" title="any color except none">
	<option selected="selected" value="none">none</option>
	<option value="Red">Red</option>
	<option value="Blue">Blue</option>
	<option value="Green">Green</option>
	<option value="Orange">Orange</option>
	<option value="White">White</option>
	<option value="Black">Black</option>
	<option value="Brown">Brown</option>

</select>
			&nbsp;</td>
		</tr>
		<tr>
			<td >Lucky number:</td>
			<td>
			<input name="LuckyNumber" type="text" id="LuckyNumber" title="Integer, 1 to 99999" />
			</td>
		</tr>
	</table>
		<div class="auto-style2">
			<br>
			<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" name="Done" value="Done" id="Done" onclick ="return process();" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" name="Clear" value="Clear" id="Clear" onclick="return resetValues();" />
		</div>
	</div>

</form>
