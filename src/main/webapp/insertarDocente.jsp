<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Index</title>
  <link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <h1>Ingresar Docente</h1>
    <form action="HelloServlet" method="post">
        <div>
            Nombre: <input type="text" name="nombre" size="20"><br>
            Apellido: <input type="text" name="apellido" size="20"><br>
            Direccion: <input type="text" name="direccion" size="20"><br>
            Especificacion: <input type="text" name="especificacion" size="20"><br>
        </div>
          <input type="submit" value="index" name="Submit" />
    </form>
</body>
</html>