/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.intive.fdv;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author sebastian
 */
public class PruebaIntiveFDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaIntiveFDV prueba = new PruebaIntiveFDV();

        System.out.print("Sr. Arrendatario:\nEscriba su nombre a continuacion: \n");
        String nombArr = In.readString();
        System.out.print("Escriba su apellido: \n");
        String apeArr = In.readString();
        int id = 0;
        Arrendatario a = new Arrendatario(id, nombArr, apeArr);

        int opcion;
        System.out.print("Escriba: 1 para registrar un nuevo alquiler - 2 para devolver una bicicleta \n");
        opcion = In.readInt();
        if (opcion == 1) {
            int cant;
            System.out.print("Primero vamos a registrar al cliente" + "\n");
            System.out.print("Cuantos clientes desea registrar?" + "\n");
            ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            cant = In.readInt();
            System.out.print("Las tarifas son: 1. Alquiler por hora $5" + "  " + "2.Alquiler Diario $20" + "  " + "3. Alquiler semanal $60" + "\n");
            System.out.print("Tambien tiene alquiler familiar, es una promocion que incluye 3 a 5 personas con un descuento del 30% sobre cualquier tipo de alquiler" + "\n");
            System.out.print("Va a ingresar un grupo familiar? 1-Si 2-No" + "\n");
            int g = In.readInt();
            if (g == 1) {
                clientes = prueba.registrarCliente(cant, true);
                prueba.asignarAlquiler(clientes, a);

            } else {
                clientes = prueba.registrarCliente(cant, false);
                prueba.asignarAlquiler(clientes, a);
            }
        } else {
            prueba.registrarDevolucion();
        }
    }

    public ArrayList<Cliente> registrarCliente(int cant, Boolean isG) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        for (int i = 0; i < cant; i++) {
            System.out.print("Cliente: " + i+1 + "\n");
            System.out.print("Ingrese el Nombre del cliente: " + "\n");
            String nomb = In.readString();
            System.out.print("Ingrese el Apellido del cliente: " + "\n");
            String ape = In.readString();
            System.out.print("Ingrese la edad: " + "\n");
            int ed = In.readInt();
            System.out.print("Ingrese el DNI: " + "\n");
            int dni = In.readInt();

            System.out.print("----------------------------------------- \n");
            String gf;
            if (isG == false) {
                gf = "No";
            } else {
                gf = "Si";
            }
            Cliente c = new Cliente(nomb, ape, ed, dni, isG);
            System.out.print("Los datos ingresados son: \nNombre:" + nomb + "\nApellido:" + ape + "\nEdad:" + ed + "\nDNI:" + dni + "\nPertenece a Grupo Familiar: " + gf + "\n");
            clientes.add(c);
            System.out.print("----------------------------------------- \n");
            System.out.print("Si es correcto escriba 1 sino 0: " + "\n");
            int opc = In.readInt();
            if (opc == 1) {
                System.out.print("----------------------------------------- \n");
                if (!clientes.isEmpty() && clientes.size() == cant) {
                    System.out.print("El registro fue exitoso" + "\n");
                }
            }
        }
        for (int x = 0; x < clientes.size(); x++) {
            System.out.print("----------------------------------------- \n");
            System.out.print("Se han registrado las siguientes personas: \n");
            System.out.println(clientes.get(x).getNombre() + " " + clientes.get(x).getApellido());
        }
        return clientes;
    }

    public void asignarAlquiler(ArrayList<Cliente> Clientes, Arrendatario a) {
        PruebaIntiveFDV prueba = new PruebaIntiveFDV();
        for (Cliente k: Clientes) {
            
            System.out.print("----------------------------------------- \n");
            System.out.print("Para el cliente:" + k.getNombre() + " " + k.getApellido() + "\n");
            System.out.print("Eliga que tipo de alquiler desea:" + "\n");
            System.out.print("Escriba 1-Alquiler por hora($5)/ 2- Alquiler Diario($20) /3- Alquiler Semanal($60)" + "\n");
            int op = In.readInt();
            int cant;
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad de horas que el cliente ---" + k.getNombre() + "--- desea alquilar la bicicleta" + "\n");
                    cant = In.readInt();
                    prueba.registrarAlquiler(op, cant, k, a);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dias que el cliente ----" + k.getNombre() + "---- desea alquilar la bicicleta" + "\n");
                    cant = In.readInt();
                    prueba.registrarAlquiler(op, cant, k, a);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de semanas que el cliente ----" + k.getNombre() + "---- desea alquilar la bicicleta" + "\n");
                    cant = In.readInt();
                    prueba.registrarAlquiler(op, cant, k, a);
                    break;

            }
        }
    }

    public void registrarAlquiler(int tipoAlq, int cant, Cliente c, Arrendatario a) {

        double impor;
        impor = 0.0;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        String nrocontrato = Integer.toString(c.getId() + c.getDni());

        double importe;
        importe = 0.0;
        Boolean isGrupoFamiliar;
        ArrayList<Cliente> arrayGrupo = new ArrayList<Cliente>();
        Cliente cl;
        Arrendatario ar;
        
        

       
        switch (tipoAlq) {
            case 1:
                importe = cant * 5;
                
                if (c.getIsG() == true) {
                    double desc = (importe * 30) / 100;
                    importe = importe - desc;

                    arrayGrupo.add(c);
                }
                System.out.print("El importe que el cliente debe abonar es:" + importe + "\n");
                break;
                
            case 2:
                importe = cant * 20;
                if (c.getIsG() == true) {
                    double desc = (importe * 30) / 100;
                    importe = importe - desc;

                    arrayGrupo.add(c);
                }
                System.out.print("El importe que el cliente debe abonar es:" + importe + "\n");

                break;
            case 3:
                importe = cant * 60;
                if (c.getIsG() == true) {
                    double desc = (importe * 30) / 100;
                    importe = importe - desc;

                    arrayGrupo.add(c);
                }
                System.out.print("El importe que el cliente debe abonar es:" + importe + "\n");

                break;
        }


        Alquiler al = new Alquiler(nrocontrato, tipoAlq, c.getIsG(), importe, clientes, c, a);
        System.out.print("Se ha registrado exitosamente el alquiler. \nLos datos son:\n" + al.toString());
    }

    public void verificarTiempoDeUso(int cantContratada, int cantUtilizada, int opc) {
        int cantReal = 0;
        PruebaIntiveFDV prueba = new PruebaIntiveFDV();
        if (cantContratada < cantUtilizada) {
            switch (opc) {
                case 1:
                    cantReal = cantUtilizada - cantContratada;
                    //System.out.print("Ingrese la cantidad de horas que usted realmente utilizó" + "\n");
                    prueba.importeaCobrar(opc, cantReal);
                    break;
                case 2:
                    cantReal = cantUtilizada - cantContratada;
                    //System.out.print("Ingrese la cantidad de dias que usted realmente utilizó" + "\n");
                    prueba.importeaCobrar(opc, cantReal);
                    break;
                case 3:
                    cantReal = cantUtilizada - cantContratada;
                    //System.out.print("Ingrese la cantidad de semanas que usted realmente utilizó" + "\n");
                    prueba.importeaCobrar(opc, cantReal);
                    break;
            }
        }
    }

    public double importeaCobrar(int op, int cantReal) {
        double importe = 0.0;
        switch (op) {
            case 1:
                importe = cantReal * 5;
                System.out.print("El importe que el cliente adeuda es: " + importe+"\n");
                System.out.print("Gracias por utilizar nuestros servicios");
                break;
            case 2:
                importe = cantReal * 20;
                System.out.print("El importe que el cliente adeuda es: " + importe+"\n");
                System.out.print("Gracias por utilizar nuestros servicios");
                break;
            case 3:
                importe = cantReal * 60;
                System.out.print("El importe que el cliente adeuda es: " + importe+"\n");
                System.out.print("Gracias por utilizar nuestros servicios");
                break;
        }
        return importe;
    }

    public void registrarDevolucion() {
        PruebaIntiveFDV prueba = new PruebaIntiveFDV();
        System.out.print("Si utilizó la bicicleta mas tiempo del que contrató escriba 1, de lo contrario escriba 0" + "\n");
        int opcion = In.readInt();
        if (opcion == 1) {

            System.out.print("Escriba la opcion que usted contrató: \n 1-Alquiler por hora/ 2- Alquiler Diario /3- Alquiler Semanal/ 4- Alguiler grupo Familiar" + "\n");
            opcion = In.readInt();
            int cantContratada = 0;
            int cantUtilizada = 0;
            System.out.print("Aclaración:Si la cantidad de horas que usted contrató es menor a la que utilizó, lamentablemenete no podremos devolverle su dinero" + "\n");
            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la cantidad de horas que usted contrató" + "\n");
                    cantContratada = In.readInt();
                    System.out.print("Ingrese la cantidad de horas que usted realmente utilizó" + "\n");
                    cantUtilizada = In.readInt();
                    prueba.verificarTiempoDeUso(cantContratada, cantUtilizada, opcion);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad de dias que usted contrató" + "\n");
                    cantContratada = In.readInt();
                    System.out.print("Ingrese la cantidad de dias que usted realmente utilizó" + "\n");
                    cantUtilizada = In.readInt();
                    prueba.verificarTiempoDeUso(cantContratada, cantUtilizada, opcion);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de semanas que usted contrató" + "\n");
                    cantContratada = In.readInt();
                    System.out.print("Ingrese la cantidad de dias que usted realmente utilizó" + "\n");
                    cantUtilizada = In.readInt();
                    prueba.verificarTiempoDeUso(cantContratada, cantUtilizada, opcion);
                    break;
            }
        } else {
            System.out.print("Gracias por utilizar nuestros servicios");
        }
    }

}
