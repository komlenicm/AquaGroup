<%@page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Pregled kategorija bazena</h3>
<br/><br/>
<c:if test="${!empty kategorijeBazena}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Naziv kategorije</th>
                <th>Izmena</th>
                <th>Brisanje</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${kategorijeBazena}" var="kategorijaBazena">
                <tr>
                    <td>${kategorijaBazena.nazivKategorija}</td>
                    <td><a href="<c:url value='/editKategorijaBazena/${kategorijaBazena.idKategorijaBazena}' />">Izmeni</a></td>
                    <td><a href="<c:url value='/deleteKategorijaBazena/${kategorijaBazena.idKategorijaBazena}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>


<%@ include file="footer.jsp" %>
