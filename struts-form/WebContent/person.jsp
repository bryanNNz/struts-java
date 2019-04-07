<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro Pessoa</title>
	</head>
	<body>
		<div style="color:red">
			<html:errors />
		</div>
		<html:form action="/cadPessoa">
			Nome: <html:text property="name"></html:text><br>
			Email: <html:text property="email"></html:text>
			<html:submit value="Send"/>
		</html:form>
	</body>
</html>