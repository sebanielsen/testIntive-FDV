package prueba.intive.fdv;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sebastian
 */
public class Cliente {

    private static int id = 0;
    private int id_cliente;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Dni;
    private Boolean isG;

    public Cliente(String N, String A, int E, int D, Boolean g) {
        id_cliente = id++;
        Nombre = N;
        Apellido = A;
        Edad = E;
        Dni = D;
        isG = g;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Boolean getIsG() {
        return isG;
    }

    public void setIsG(Boolean isG) {
        this.isG = isG;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String aux;
        if (isG == true) {
            aux = "Si";
        } else {
            aux = "No";
        }
        return "El ID del cliente es : " + getId() + "\nNombre del Cliente: " + Nombre + "\nApellido: " + Apellido + "\nEdad: " + Edad
                + "\nDNI:" + Dni + "\nPertenece a grupo familiar:" + aux + "\n";
    }





}
