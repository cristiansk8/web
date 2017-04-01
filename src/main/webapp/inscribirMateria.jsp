<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
        <title>Index</title>
        <link rel="stylesheet" href="resources/css/styles.css">
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <h1>Ingresar Materia</h1>
        <form action="HelloServlet" method="post" class="formularios">
            <div>
                Nombre: <input type="text" name="nombre"><br>
                Creditos: <input type="text" name="creditos" ><br>
                Docente ID: <input type="text" name="idDocente" ><br>
            </div>
            <input type="submit" value="index" name="inscribirMateria" />
        </form>
        <jsp:include page="footer.jsp"/>
    </body>
</html>