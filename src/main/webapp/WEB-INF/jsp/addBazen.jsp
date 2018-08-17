<%@page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Dodavanje bazena</h3>
<br/><br/>
<c:url var="addBazen" value="/addBazen" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">

        <c:url var="post_url"  value="/addBazen/" />
        <form:form method="POST" action="${post_url}" modelAttribute="bazen">
            <% String success = (String) request.getAttribute("successMsg"); %>
            <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
            <div class="form-group">
                <form:label for="kategorijaBazena" path="kategorijaBazena">Kategorije bazena</form:label>
                <form:select id="slcRole" class="form-control" path="kategorijaBazena">
                    <form:option value="">SELECT</form:option>
                    <form:options items="${kategorijeBazena}" itemValue="idKategorijaBazena" itemLabel="nazivKategorija" />
                </form:select>
            </div>
            <div class="form-group">
                <form:hidden path="idBazen" />
            </div>
            <div class="form-group">
                <form:label path="imeBazen">Ime bazena</form:label>
                <form:input type="imeBazen" id="imeBazen" class="form-control" placeholder="Ime bazena" path="imeBazen" />
            </div>
            <div class="form-group">
                <form:label path="cenaUlaznice">Cena ulaznice</form:label>
                <form:input type="cenaUlaznice" id="cenaUlaznice" class="form-control" placeholder="Cena ulaznice na bazenu" path="cenaUlaznice" />
            </div>
            <div class="form-group">
                <form:label path="opis">Opis</form:label>
                <form:input type="opis" id="opis" class="form-control" placeholder="Opis bazena" path="opis" />
            </div>
            <div class="form-group">
                <form:label path="radnoVreme">Radno vreme</form:label>
                <form:input type="radnoVreme" id="radnoVreme" class="form-control" placeholder="Radno vreme bazena" path="radnoVreme" />
            </div>
            
            <button type="submit" class="btn btn-primary" style="display: block; margin: auto;">Dodaj bazen</button>
        </form:form>
    </div>
</div>

<%@include file="footer.jsp" %>