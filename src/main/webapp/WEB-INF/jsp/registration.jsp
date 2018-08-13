<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Registracija</h3>
<br/><br/>
<c:url var="registration" value="/registration/" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">

        <c:url var="post_url"  value="/registration/" />
        <form:form method="POST" action="${post_url}" modelAttribute="korisnik">
            <% String success = (String) request.getAttribute("successMsg"); %>
            <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
            <div class="form-group">
                <form:label path="emailKorisnik">E-Mail</form:label>
                <form:input type="emailKorisnik" id="emailKorisnik" class="form-control" placeholder="Unesite Vasu E-Mail adresu" path="emailKorisnik" />
            </div>
            <div class="form-group">
                <form:label path="imeKorisnik">Ime</form:label>
                <form:input type="imeKorisnik" id="imeKorisnik" class="form-control" placeholder="Unesite Vase ime" path="imeKorisnik" />
            </div>
            <div class="form-group">
                <form:label path="prezimeKorisnik">Prezime</form:label>
                <form:input type="prezimeKorisnik" id="prezimeKorisnik" class="form-control" placeholder="Unesite vase prezime" path="prezimeKorisnik" />
            </div>
            <div class="form-group">
                <form:label path="password">Lozinka</form:label>
                <form:input type="password" id="password" class="form-control" placeholder="Unesite vasu lozinku" path="password" />
            </div>

          <button type="submit" class="btn btn-primary">Registruj se</button>
        </form:form>
    </div>
</div>
        
<%@include file="footer.jsp" %>