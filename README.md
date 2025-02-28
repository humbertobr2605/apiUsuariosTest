Peticiones POSTMAN

Traer todos los usuarios Metodo: GET, ENDPOINT:localhost:8080/usuarios

Guardar un usuario Metodo: POST, ENDPOINT:localhost:8080/usuarios
Body: {
    "nombre": "",
    "apellido": "",
    "correo": ""
}

Traer usuario por su id Metodo: GET, ENDPOINT:localhost:8080/usuarios/(id a buscar)

Actualizar usuario seleccionando su id Metodo: PUT, ENDPOINT:localhost:8080/usuarios/(id a seleccionar)
body: {
    "nombre": "",
    "apellido": "",
    "correo": ""
}

Eliminar un usuario Metodo: DELETE, ENTPOINT: localhost:8080/usuarios/(id seleccioando)
