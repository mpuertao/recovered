# recovered
Proyecto desarrollado en java con springboot el cual busca ejemplificar las diferentes pruebas que debe conllevar un microservicio basado en la pirámide de pruebas de cohn.

Aún está en Construcción, y falta la inmersiónn de la BD la cual se hará con Docker para Postgresql.

La idea del microservicio es exponer API REST para el consumo, este tendrá 3 puntos finales: obtener los recuperados por covid19 (es para ejemplificar), obtener recuperado por Id, y crear un recuperado en la BD.:

GET /recovered
GET /recovered/{id}
POST /recovered

Se realizarán pruebas unitarias, de integracion, componentes, Contrato y E2E. 

En la primera versión tendremos: Pruebas Unitarias, Integracion con la inmersión de la BD en Postgresql
En la segunda version tendremos: Pruiebas de contrato con la creación de otro microservicio para ejemplificar las pruebas de contrato y E2E.
