<%-- 
    Document   : TablaJsp
    Created on : 14-ene-2018, 22:28:53
    Author     : italo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--${N}
        ${Nombre}
        ${2005}
        ${2006}
        ${2007}
        ${2008}
        ${2009}
        ${2010}
        ${2011}
        ${2012}
        ${2013}
        ${2014}
        ${2015}-->
        <table class="table table-sm table-dark">
            <thead>
                <tr>
                <th scope="col">N</th>
                <th scope="col">Nombre</th>
                <th scope="col">2005</th>
                <th scope="col">2006</th>
                <th scope="col">2007</th>
                <th scope="col">2008</th>
                <th scope="col">2009</th>
                <th scope="col">2010</th>
                <th scope="col">2011</th>
                <th scope="col">2012</th>
                <th scope="col">2013</th>
                <th scope="col">2014</th>
                <th scope="col">2015</th> 
              </tr>
            </thead>
            <tbody>
              <tr>                                
                  <td>${N}</td>
                  <td>${Empresa}</td>
                  <td>${a2005}</td>
                  <td>${a2006}</td>
                  <td>${a2007}</td>
                  <td>${a2008}</td>
                  <td>${a2009}</td>
                  <td>${a2010}</td>
                  <td>${a2011}</td>
                  <td>${a2012}</td>
                  <td>${a2013}</td>
                  <td>${a2014}</td>
                  <td>${a2015}</td>
              </tr>
              ${html}
            </tbody>
          </table>
    </body>
</html>
