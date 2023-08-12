# @Trackia: Ejemplo My Name Is



## Introducción


Este software es parte de un conjunto de ejemplos que demuestran el funcionamiento de la librería @Trackia version 1.1.4.
Para más información puede dirigirse a la página de la librería [www.trackia.app](www.trackia.app) donde encontrará la documentación oficial y otros ejemplos relacionados.



Si bien, es posible ejecutar este servicio de manera autónoma, el ejemplo es aun más ilustrativo si se ejecuta junto a my-name-is-demo.
- [hello-world-demo](https://github.com/trackiaapp/hello-world-demo)
- [my-name-is-demo](https://github.com/trackiaapp/my-name-is-demo)


Por lo que se recomienda bajar ambos fuentes y ejecutarlos en combinación.



## Arquitectura

Para que este ejemplo sea mas eficiente, es necesario entender la arquitectura de implementada. Este software esta construido en 3 capas:
- Controlador
- Servicio
- Repositorio



## Descripción
Este proyecto responde ", my name is service @TrackIA". No recibe parámetros de entrada 


## Ejemplos

**GET**: http://localhost:5556/myNameIs

Salida:

```
, my name is service @TrackIA

```


## Configuración
El proyecto está configurado con un archivo yml en la ruta: **my-name-is-demo/src/main/resources/application.yml** con algunos parámetros por default.


Lo primero que debe considerar es que se ejecuta en localhost en el puerto 5556.

Otro aspecto importante a considerar, es que la configuración inicial envía la salida hacia el log, si desea cambiar la salida al servicio de trackia, debe crear una cuenta y modificar los valores de "trackia.dispatcher", para más información visite la documentación de dispatcher en
[www.trackia.app/documentacion/dispatcher](www.trackia.app/documentacion/dispatcher)


## Licencia
Proyecto de código abierto, siéntase libre de bajar y modificar este software como estime conveniente.

