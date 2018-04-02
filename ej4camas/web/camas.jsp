<%-- 
    Document   : camas
    Created on : 13-01-2018, 12:31:39
    Author     : felipeacj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Camas</title>
         <!-- librerías bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.rawgit.com/arafkarim/BootstrapPlusPlus/2d8d0b9d/bpp/bpp.min.css">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<!-- fin librerías bootstrap-->
    </head>
    <body>
        <table class="table table-dark">
            <thead>
              <tr>
                <th scope="col">Servicio</th>
                <th scope="col">Ingreso</th>
                <th scope="col">Egreso</th>
                <th scope="col">Ocupados</th>
                <th scope="col">DesOcupados</th>
              </tr>
            </thead>
            <tbody>
              ${camas}
            </tbody>
          </table>
    </body>
</html>
