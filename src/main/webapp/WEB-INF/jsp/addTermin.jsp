<%@page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Lista zakazanih termina</h3>
<br/><br/>
<c:if test="${!empty zakazaniTermini}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID Zakazivanja</th>
                <th>E-Mail Korisnika</th>
                <th>Poruka</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${zakazaniTermini}" var="zakazaniTermin">
                <tr>
                    <td>${zakazaniTermin.idZakazivanje}</td>
                    <td>${zakazaniTermin.korisnik.emailKorisnik}</td>
                    <td>${zakazaniTermin.poruka}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>
<br/><br/><br/><br/>
<h3 style="text-align: center">Dodavanje termina</h3>
<br/><br/>
<c:url var="addTermin" value="/addTermin" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">

        <c:url var="post_url"  value="/addTermin/" />
        <form:form method="POST" action="${post_url}" modelAttribute="termin">
            <% String success = (String) request.getAttribute("successMsg"); %>
            <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
            <div class="form-group">
                <form:label for="bazen" path="bazen">Bazen</form:label>
                <form:select id="slcRole" class="form-control" path="bazen">
                    <form:option value="">ODABERITE BAZEN</form:option>
                    <form:options items="${bazeni}" itemValue="idBazen" itemLabel="imeBazen" />
                </form:select>
            </div>
            <div class="form-group">
                <form:hidden path="idTermin" />
            </div>
            <div class="form-group">
                <form:label path="vremeOd">Vreme od</form:label>
                <form:input type="text" id="vremeOd" class="form-control" placeholder="Unesite u formatu HHMMSS" path="vremeOd" />
            </div>
            <div class="form-group">
                <form:label path="vremeDo">Vreme do</form:label>
                <form:input type="text" id="vremeDo" class="form-control" placeholder="Unesite u formatu HHMMSS" path="vremeDo" />
            </div>
            <button type="submit" class="btn btn-primary">Dodaj termin</button>
        </form:form>
    </div>
</div>

<%@include file="footer.jsp" %>
