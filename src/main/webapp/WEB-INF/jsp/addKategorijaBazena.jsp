<%@ page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>

<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>

<h3 style="text-align: center">Dodavanje kategorije bazena</h3>
<br/><br/>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <c:url var="addKategorijaBazena" value="/addKategorijaBazena" ></c:url>
        <c:url var="post_url"  value="/addKategorijaBazena/" />
        <form:form method="POST" modelAttribute="kategorijaBazena" action="${post_url}">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:label path="nazivKategorija">Naziv kategorije bazena</form:label>
                <form:input type="nazivKategorija" class="form-control" id="nazivKategorija" placeholder="Unesite naziv kategorije" path="nazivKategorija" />
            </div>
            <button type="submit" class="btn btn-primary" style="display: block; margin: auto;">Dodaj kategoriju bazena</button>
        </form:form>
    </div>
</div>
<br/><br/><br/><br/>   
<%@ include file="footer.jsp" %>