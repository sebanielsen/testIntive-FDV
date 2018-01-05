/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba.intive.fdv;

/**
 *
 * @author sebastian
 */
public class Arrendatario {
    private int id;
    private String Nombre;
    private String Apellido;
    
    public Arrendatario(int ID, String N, String A){
    id = ID;
    Nombre = N  ;
    Apellido = A  ;    
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    @Override
    public String toString()
    {
        return "\nID: "+id+"\nNombre : "+Nombre+
                "\nApellido:"+Apellido+"\n";
    }
}
