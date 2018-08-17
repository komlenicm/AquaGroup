<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@include file="header.jsp" %>

<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Lista zakazanih termina</h3>
<c:if test="${!empty termini}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Kategorija bazena</th>
                <th>Naziv bazena</th>
                <th>Vreme od</th>
                <th>Vreme do</th>
                <th>Izmena</th>
                <th>Brisanje</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${termini}" var="termin">
                <tr>
                    <td>${termin.bazen.kategorijaBazena.nazivKategorija}</td>
                    <td>${termin.bazen.imeBazen}</td>
                    <td>${termin.vremeOd}</td>
                    <td>${termin.vremeDo}</td>
                    <td><a href="<c:url value='/editTermin/${termin.idTermin}' />">Izmeni</a></td>
                    <td><a href="<c:url value='/deleteTermin/${termin.idTermin}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>
<%@include file="footer.jsp" %>
