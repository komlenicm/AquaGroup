<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>

<link href="<c:url value="/resources/css/kontakt.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/><br/><br/>
<div class="container" style="text-align: center">
  <div class="col-md-5 form-area" style="ce">
        <h3 style="margin-bottom: 25px; text-align: center;">Kontakt</h3>
        <c:url var="kontakt" value="/kontakt" ></c:url>
        <c:url var="post_url"  value="/kontakt/" />
        <form:form method="POST" modelAttribute="kontakt" action="${post_url}">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:input type="imeKontakt" class="form-control" id="imeKontakt" placeholder="Vase ime" path="imeKontakt" />
            </div>
            <div class="form-group">
                <form:input type="emailKontakt" class="form-control" id="emailKontakt" placeholder="Vasa e-mail adresa" path="emailKontakt" />
            </div>
            <div class="form-group">
                <form:input type="brojTelefonaKontakt" class="form-control" id="brojTelefonaKontakt" placeholder="Vas broj telefona" path="brojTelefonaKontakt" />
            </div>
            <div class="form-group">
                <form:input type="naslovKontakt" class="form-control" id="naslovKontakt" placeholder="Naslov poruke" path="naslovKontakt" />
            </div>
            <div class="form-group">
                <form:input type="porukaKontakt" class="form-control" id="porukaKontakt" placeholder="Vasa poruka" path="porukaKontakt" />
            </div>
            <button type="submit" class="btn btn-primary pull-right" style="display: block; margin: auto;">Posalji</button>
        </form:form>

  </div>

  <div class="col-md-5">
    <div class="form-area">
      <form role="form">
        <br style="clear:both">
        <h3 style="margin-bottom: 25px; text-align: center;">Ostali podaci</h3>
        <p><strong>PIB: </strong> 123456789</p>
        <p>Preduzece je u sistemu PDV, potvrda br: 123456789</p>
        <p><strong>Maticni broj: </strong> 12345678</p>
        <p><strong>Registarski broj: </strong> 123456789</p>
        <p><strong>Registarski broj APR: </strong> BD 123456789</p>
        <p><strong>?ifra delatnosti: </strong> 1234</p>
        <p><strong>Tekuci racun:</strong> 123-4567867-89, Met Bank</p>
        <div style="clear:both;"></div>
      </form>
    </div>
  </div>

</div>
<%@include file="footer.jsp" %>
