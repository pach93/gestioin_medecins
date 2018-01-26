<%-- 
    Document   : AjoutOrdi
    Created on : 11 mai 2016, 09:39:21
    Author     : DIOUF ABBAS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@  include file="header.jsp" %>
<%@  include file="nav.jsp" %>
<form method="post" action="${pageContext.request.contextPath}/Ordi">

    <!-- nom complet -->
    <div class="form-group">
        <label for="name">Reference<span class="text-danger">*</span> </label>
        <input type="text" class="form-control" name="ref" value=""
               required=required/>
    </div>

    <!-- nom complet -->
    <div class="form-group">
        <label for="name">Marque<span class="text-danger">*</span> </label>
        <input type="text" class="form-control" name="mark" value=""
               
               required=required/>
    </div>

    <!-- nom complet -->
    
    <!-- Pseudo -->
    <div class="form-group" >
        <label for="pseudo">Taille de la Ram<span class="text-danger">*</span> </label>
        <input type="number" class="form-control" name="ram" value=""
               
               required=required placeholder="La ram est en GO"/>
    </div>

    <!-- Email -->
    <div class="form-group">
        <label for="email">Taille Disque<span class="text-danger">*</span> </label>
        <input type="number" class="form-control" name="disk" value=""
               
               required=required placeholder="Le disque est en GO"/>
    </div>

    <div class="form-group">
        <label for="adresse">Système d'exploitation<span class="text-danger">*</span> </label>
            <select name="os">
                <c:forEach var="item" items="${lesOs}">
                    <option value="<c:out value="${item.id}"/>"><c:out value="${item.nom}"/><c:out value=" "/> <c:out value="${item.version}"/></option>
                </c:forEach>
                
            </select>
    </div>
    
    <div class="form-group">
        <label for="adresse">Matricule <span class="text-danger">*</span> </label>
            <select name="us">
                <c:forEach var="item" items="${lesUs}">
                    <option value="<c:out value="${item.id}"/>"><c:out value="${item.mat}"/></option>
                </c:forEach>
                
            </select>
    </div>


    <!-- Bouton validation-->
    <button type="submit" class="btn btn-success" name="ajouter">Valider les informations</button>
    
</form>

<style type="text/css">
    body{
        background:url(http://www.siwallpaper.com/wp-content/uploads/2015/04/city_street_11_desktop_background_wallpaper.jpg)no-repeat center center fixed;
        background:url(fond.jpg)no-repeat center center fixed;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;}

    #wrap {
        font-family: "helvetica";
        padding: 20px;
    }

    form {
        width: 600px;
        position: absolute;
        top:270px;
        left: 500px;
        margin: -184px 0px 0px -155px;

        padding: 20px 30px;
        border-radius: 5px;
        box-shadow: 0px 1px 0px rgba(0,0,0,0.3),inset 0px 1px 0px rgba(255,255,255,0.04)
    }



    input{
        width: 100px;
        border: none;
        padding: 10px;
        font-size: 15px;
    }
    button {

        width: 100%;
        margin: 20px auto;
        border: none;
        padding: 10px;
        font-size: 15px;
    }

    button {
        background-color: #16aa56;
        color: #fff;
        font:600 14px sans-serif;
        width: 100%
    }

    button:hover {
        background-color: #17cb58;
    }

    input {
        background: white;
        padding-left: 40px;
    }




</style>
<%@  include file="footer.jsp" %>
