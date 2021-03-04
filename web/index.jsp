<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<html>
    <head>
        <title>Inicio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.6.0/umd/popper.min.js" integrity="sha512-BmM0/BQlqh02wuK5Gz9yrbe7VyIVwOzD1o40yi1IsTjriX/NGF37NyXHfmFzIlMmoSIBXgqDiG1VNU6kB5dBbA==" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"></script>
        <!-- Mi CSS -->
	<link rel="stylesheet" type="text/css" href="CSS/styles.css">
    </head>
    <body>
        <!-- Menú -->
        <nav class="navbar navbar-dark bg-primary">
            <a class="navbar-brand" href="index.jsp">
            Inicio</a>
            <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="navbar-collapse collapse" id="navbarsExample01" style="">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link d-flex align-items-center" routerLink="/backoffice/jobs" routerLinkActive="active" href="ServletListadoArticulos">
                            <h3 class="my-0">Lista de Articulos</h3>
                    </a>
                    <div class="linea"></div>
                </li>
                <li class="nav-item active">
                    <a class="nav-link d-flex align-items-center" routerLink="/backoffice/jobs" routerLinkActive="active" href="ServletTablaArticulos">
                            <h3 class="my-0">Tabla de Articulos</h3>
                    </a>
                    <div class="linea"></div>
                </li>
            </div>
        </nav>
        <% 
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formato.format(new Date());
        %>
        <!-- Texto central -->
        <header class="texto-principal">
            <div class="description">
                <h1 id="titulo">Antonio Jose Gonzalez Perez - <span class="typed"> <%out.print(fecha.toString());%></span></h1>
                <p>
                    Esta es mi pagina principal en la que se encuentra el boton para ir a la lista de jugadores profesionales de esports
                </p>
            </div>
        </header>
    </body>
</html>
