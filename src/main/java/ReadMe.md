<h1><strong>Work in progress</strong></h1>
<h1> Sistema de peajes </h1>

<p> Proyecto obligatorio de finalización de la materia Diseño y Desarrollo de aplicaciones.<br>
 Este proyecto se realizó en lenguaje Java (JDK 19) con utilización de Swing para el interfaz de usuario y se aplica varios patrones de diseño.
</p>

<h2> Objetivo del proyecto</h2>
    <p>
    • Construir un prototipo para gestionar los distintos peajes que se carguen en el sistema.<br>
    • Panel de control para usuarios con rol Administrador y otro panel para usuarios con rol propietarios de vehículos.<br>
    • Existirá cálculos de bonificaciones.<br>
    • Se realizara una interfaz gráfica para escritorio para los distintos usuarios.<br>
    </p>


<h2>Stack usado</h2>
    <ul>
        <li>Java</li>
        <li>Swing (interfaz gráfica)</li>
    </ul>


<h2> Patrones utilizados</h2>
    <ul>
        <li>Fachada</li>
        <li>División Lógica</li>
        <li>Experto</li>
        <li>Herencia</li>
        <li>Polimorfismo</li>
        <li>Interfaces</li>
        <li>Observer</li>
        <li>Excepciones</li>
        <li>MVC (modelo-vista-controlador)</li>
    </ul>



<h2>Funcionalidades</h2>
   <h3>Generales:</h3>
<ul>
        <li>Login </li>
        <li>Salir </li>
</ul>    
<h3>Propietario</h3> 
<ul>   
    <li>Solicitar recarga de saldo</li>
    <li> Borrar notificaciones del panel</li>
</ul>    
<h3>Administrador </h3>
<ul>
           <li> Emular transito</li>
           <li>Aprobar recarga</li>
           <li> Asignar Bonificaciones</li>
</ul>
     



<h2> Ejecución del proyecto</h2>
    <p>Para poder probar el proyecto, deberá descargar los archivos del repositorio,<br>
    tener instalado en el equipo Apache NetBeans IDE 17.<br>
    Ya con los archivos descargador y el IDE ejecutado, abra el proyecto dentro del IDE. <br>
    Seleccione la raíz del proyecto, clic derecho sobre lo seleccionado y a continuación puede ejecutarlo apretando la opción “RUN” 
    como se puede apreciar a continuación.</p>

<div id="run" align="center">
<img src="./img/runProject.PNG" >
</div>
<br>

    
 <p>Luego de que se ejecute el programa, aparecerá una ventana para hacer Login al sistema.<br>
 Dentro de Login Sistema Peaje, se desplegará dos opciones para ingresar como usuario Propietario o Administrador.</p>
    <div id="login" align="center">
    <img src="./img/loginProject.PNG">
    </div>
   <br>

<h3>Ingresando un usuario válido</h3>
<p>
    Existe un juego de datos para probar en el sistema, independiente si desea ingresar como Administrador o Propietario.<br>
    <strong>Dichos datos serian: Cedula: 123 | Contraseña: 123</strong>.<br>
    En este caso, ingresaremos como Propietario.
</p>
    <div id="loginInput" align="center">
    <img src="./img/login.PNG">
    </div>
<br>

<p>
Luego de ingresar con el usuario 123(Juan Perez), nos aparecerá el panel de control para Propietarios, el cual nos dara 
informaciones como: saldo disponible, vehiculos asociados al usuario con sus detalles, que bonificaciones tiene el usuario, los tránsitos hechos por los distintos peajes y con que vehículo,
las recargas solicitadas y aprobadas con sus detalles y los mensajes como notificación de cada vez que pasa por un peaje.

</p>

