La aplicacion requeria poder registrar alquileres de bicicletas por lo que me parecio
necesario tenes al menos 3 clases/entidades.
Primero, Una clase llamada cliente donde se puedan guardar los datos del cliente como:
 id_cliente
 Nombre
 Apellido
 Edad
 Dni
 Y una variable que permita identificar si ese usuario pertenece a un grupo familiar(Family Rental)
 por lo cual utilize un booleano que indique si pertenece a un grupo familiar.

 Tambien Necesitaba saber quien era el Arrendatario, es decir el agente o persona que registra el alquiler.
 para ello use una clase que se llama arrendatario que contiene los siguientes campos:
 id
 Nombre
 Apellido
 con estos datos ya me alcanza para saber que ARRENDATARIO alquiló cierta bicicleta a determinado CLIENTE.
 
 Como ultima clase pense que habia que registrar una clase donde figuren datos del alquiler y se reunan 
 estas dos clases, Arrendatario y cliente.
 Para ello decidi crear una clase Alquiler donde figuran estos campos.
 

id_alquiler -----> Tipo de dato entero que permite buscar un alquiler por su ID
NroContrato -----> Tipo de dato entero que permite registrar mediante una forma legal un alquiler y quedar documentado
tipoDeAlquiler -----> Tipo de dato entero que permite saber si el alquiler es por Horas, Diario o Semanal
isGrupo -----> Tipo de dato Booleano que permite determinar si el alquiler es Familiar
importe -----> Tipo de dato Double que permite saber el importe que se cobro por el alquiler
arrayGrupo -----> Un array que contiene a todos los <Clientes> que pertenecen al grupo familiar
Cliente -----> Si el cliente no pertenece a un grupo familiar quedara registrado como que alquilo la bicicleta
Arrendatario -----> Se registra al agente que realizo la operacion del alquiler.

 Las practicas que quize aplicar para este set de clases fueron las siguientes:
 
 1.Tratar de utilizar la menor cantidad de Variables y no instanciar objetos ocupando espacio en memoria
 que no sean vitales.
 2.Tratar de determinar en que casos es mejor utilizar Array, Vectores o arraylist para guardar datos.
 3. Reservar memoria de la JVM(Solo la necesaria) para evitar excesivo consumo de recursos.
 4. Preguntar si una variable es nula antes de intentar acceder o agregar informacion en ella y asi evitar
 los NullPointerException.
 
 Para hacer las pruebas unitarias en Junit abrir Netbeans. Abrir paquete Test Packages. Dentro hay un archivo
 TestExampleIT.java. Abrir archivo y con el boton derecho en el menu desplegable seleccionar opcion Test file.
 
 