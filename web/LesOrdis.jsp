<%-- 
    Document   : LesOrdis
    Created on : 11 mai 2016, 10:40:48
    Author     : DIOUF ABBAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  include file="header.jsp" %>
<%@  include file="nav.jsp" %>

<script type="text/javascript">
    $(document).ready(function () {
        $("#table").dataTable();
    });
</script>

<div class="row">
    <div id="main-content">
        <div class="container">

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title" align="center">Les Livres</h3>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered" id="table">
                        <thead>  <tr class="danger"><td>Reference</td><td>Marque</td><td>Ram</td><td>Disque</td><td>Nom Utilisateur</td><td>Nom Systeme</td><td>Version Systeme</td></thead>
                        <tbody>
                            <c:forEach var="item" items="${lesOr}" >

                                <tr><td class="info">
                                        <c:out value="${item.reference}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.marque}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.ram}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.disque}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.idUser.nom}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.idOs.nom}" />
                                    </td>
                                    <td class="">
                                        <c:out value="${item.idOs.version}" />
                                    </td>
                                    
                                    
                                    
                                </tr>
                           </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    
<%@  include file="footer.jsp" %>