<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Rezervacija termina za bazen</h3>
<br/><br/>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <c:url var="zakazivanjeTermina" value="/zakazivanjeTermina" ></c:url>
        <form:form method="POST" modelAttribute="zakazivanjeTermina">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:label path="poruka">Poruka: </form:label>
                <form:input type="poruka" class="form-control" id="poruka" placeholder="Vasa poruka" path="poruka" />
            </div>
            <button type="submit" class="btn btn-primary" style="display: block; margin: auto;">Rezervisi termin</button>
        </form:form>
    </div>
</div>
 
<%@include file="footer.jsp" %>
