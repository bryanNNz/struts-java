<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dados Pessoa</title>
	</head>
	<body>
		<bean:write name="cadPersonForm" property="name"/>
		<bean:write name="cadPersonForm" property="email"/>
	</body>
</html>