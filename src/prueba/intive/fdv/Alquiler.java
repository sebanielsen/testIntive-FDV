/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba.intive.fdv;
import java.util.ArrayList;
/**
 *
 * @author sebastian
 */
public class Alquiler {
   private static int id = 0;
    private int id_alquiler;
    private String NroContrato;
    private int tipoDeAlquiler;
    private Boolean isGrupo;
    private double importe;
    private ArrayList<Cliente> arrayGrupo = new ArrayList<Cliente>();
    private Cliente c;
    private Arrendatario a;
    
    
    public Alquiler( String NRO,int T,Boolean Is, double I, ArrayList<Cliente> G, Cliente C, Arrendatario A){
    
         id_alquiler=id++;
         NroContrato=NRO;
         tipoDeAlquiler=T;
         isGrupo=Is;
         importe=I;
         arrayGrupo=G;
         c=C;
         a=A;               
    }
    public String getNroContrato() {
        return NroContrato;
    }


    public void setNroContrato(String NroContrato) {
        this.NroContrato = NroContrato;
    }


    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Arrendatario getA() {
        return a;
    }

    public void setA(Arrendatario a) {
        this.a = a;
    }

    public ArrayList<Cliente> getArrayGrupo() {
        return arrayGrupo;
    }

    public void setArrayGrupo(ArrayList<Cliente> arrayGrupo) {
        this.arrayGrupo = arrayGrupo;
    }

    public String getTipoDeAlquiler() {
        String tipo="";
        switch(tipoDeAlquiler) {
            case 1: tipo="Alquiler por Hora";
                    break;
                    
            case 2: tipo="Alquiler Diario";
                    break;
                    
            case 3: tipo="Alquiler Semanal";
                    break;     
        }
        return tipo;
    }

    public void setTipoDeAlquiler(int tipoDeAlquiler) {
        this.tipoDeAlquiler = tipoDeAlquiler;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * @return the isGrupo
     */
    public Boolean getIsGrupo() {
        return isGrupo;
    }

    /**
     * @param isGrupo the isGrupo to set
     */
    public void setIsGrupo(Boolean isGrupo) {
        this.isGrupo = isGrupo;
    }
    
    @Override
    public String toString() {
        String aux="Tiene";
        String aux2 = "";
        if (isGrupo == true) {
            aux = "Si";
        } else {
            aux = "No";
        }
        if (arrayGrupo.isEmpty() && c.getIsG() == false) {
            aux2 = "No tiene";
        } else {
            if (arrayGrupo.isEmpty() == false) {
                for (int i = 0; i < arrayGrupo.size(); i++) {
                    aux2 = aux2 + arrayGrupo.get(i).getNombre() + " " + arrayGrupo.get(i).getApellido() + "\n";
                }
            }
        }
        return "Id:"+ id_alquiler +"\nNombre del Cliente:"+c.getNombre()+" "+c.getApellido()+"\nNumero de contrato:"+ NroContrato +"\nTipo de Alquiler: " + getTipoDeAlquiler() + "\nPertenece a grupo familiar:" + aux + "\nImporte:" + importe+ "\nArrendatario:"+a + "\nGrupo Familiar:" + aux2 +"\n";
            
    }
    
}
