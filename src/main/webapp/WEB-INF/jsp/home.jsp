<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>


<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<!-- Header with Background Image -->
<header class="business-header">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <img class="centerImage" style="margin-top: 50px; margin-bottom: -100px" src="<c:url value="/resources/images/slika1.jpg" />" alt="" />
                <h1 class="display-3 text-center text-white mt-4" style="color: white; margin-top: 50px;">AquaGroup</h1>
            </div>
        </div>
    </div>
</header>

<!-- Page Content -->
<div class="container">

    <div class="row">
        <div class="col-sm-8">
            <h2 class="mt-4">Kako da se izborite sa vrelim letnjim danima?</h2>
            <p>Bazen menja Vas zivot. Bazen gradi nove uspomene koje cine Vas zivot srecnijim. Bazen je tu za sve prilike i sva raspolozenja.</p>
            <p>Bilo da pozelite da se osamite i pobegnete od gradske guzve i vreline asfalta ili da se druzite sa porodicom i prijateljima - imate svoju malu, luksuznu
                oazu mira. Za kupanje, suncanje, opustanje i osvezavanje.</p>

        </div>
        <div class="col-sm-4">
            <h2 class="mt-4">Brzo kontaktiranje</h2>
            <address>
                <strong>AquaGroup</strong>
                <br>Karadjordjeva 150
                <br>Stara Pazova
                <br>
            </address>
            <address>
                <abbr title="Telefon">Tel:</abbr>
                (022) 123-456
                <br>
                <abbr title="Email">Email:</abbr>
                <a href="mailto:#">milos@aquagroup.com</a>
            </address>
        </div>
    </div>
    <!-- /.row -->

    <div class="row">
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/slika2.jpg"/>" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">Galerija</h4>
                    <p class="card-text">Ukoliko zelite da vidite slike nasih radova, pritisnite link ispod.</p>
                </div>
                <div class="card-footer">
                    <c:url var="galerija"  value="/galerija" />
                    <a class="btn btn-primary" href="${galerija}">Idi u galeriju</a>
                </div>
            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/slika3.png" />" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">Kontakt</h4>
                    <p class="card-text">Imate dodatna pitanja? zelite da dobijete detaljniji odgovor na Vase pitanje? Idite na kontakt stranicu, posaljite poruku i mi cemo Vam u najkracem roku odgovoriti.</p>
                </div>
                <div class="card-footer">
                    <c:url var="kontakt"  value="/kontakt" />
                    <a class="btn btn-primary" href="${kontakt}">Kontaktirajte nas</a>
                </div>
            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="<c:url value="/resources/images/slika4.jpg" />" alt="TestDisplay"/>
                <div class="card-body">
                    <h4 class="card-title">O nama</h4>
                    <p class="card-text">Ukoliko zelite da saznate vise informacija o nasoj firmi, idite na link ispod i upoznajte se o nasem nacinu poslovanja.</p>
                </div>
                <div class="card-footer">
                    <c:url var="onama"  value="/onama" />
                    <a class="btn btn-primary" href="${onama}">Saznajte vise</a>
                </div>
            </div>
        </div>

    </div>

<%@include file="footer.jsp" %>
