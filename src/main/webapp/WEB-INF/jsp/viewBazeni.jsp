<%@ page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Pregled bazena</h3>
<br/><br/>
<c:if test="${!empty bazeni}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Kategorija bazena</th>
                <th>Ime bazena</th>
                <th>Cena ulaznice</th>
                <th>Opis</th>
                <th>Radno Vreme</th>
                <th>Izmena</th>
                <th>Brisanje</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${bazeni}" var="bazen">
                <tr>
                    <td>${bazen.kategorijaBazena.nazivKategorija}</td>
                    <td>${bazen.imeBazen}</td>
                    <td>${bazen.cenaUlaznice}</td>
                    <td>${bazen.opis}</td>
                    <td>${bazen.radnoVreme}</td>
                    <td><a href="<c:url value='/editBazen/${bazen.idBazen}' />">Izmeni</a></td>
                    <td><a href="<c:url value='/deleteBazen/${bazen.idBazen}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>


<%@ include file="footer.jsp" %>