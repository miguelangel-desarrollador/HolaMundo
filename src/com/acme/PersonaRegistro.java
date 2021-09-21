package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    //Comentario programador externo, leído por programador interno
    @Override
    public String toString() {
        return "PersonaRegistro{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
