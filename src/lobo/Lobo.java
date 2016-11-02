/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobo;

/**
 *
 * @author arser
 */
public class Lobo extends Animal implements Disfraz{
    private String nombre;
    private Animal actuacion;
    
    public Lobo(String pnombre){
        this.setActuacion(actuacion);
        this.setNombre(pnombre);
        this.quitarDisfraz();
    }

    /**
     * @return the nombre
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String emitirSonido(){
        return "Awwwwwwwww!";
    }
    
    public String correr(){
        return "Voy raudo y veloz";
    }
    
    public String comer(String comida){
        String resul = "";
        switch(comida){
            case "gallina":
                resul = "Mi manjar preferido";
                break;
            case "vegetales":
                resul = "Ni a canion";
                break;
            case "pizza":
                resul = "Con hambre no hay mal pan";
                break;
            default:
                resul = "Me abstengo";
                break;
        }
        return resul;
    }
    
    public String toString(){
        String resul = this.getNombre();
        return resul;
    }

    @Override
    public void disfrazar(int pdisfraz) {
        
    }

    @Override
    public void quitarDisfraz() {
        this.setActuacion((Lobo) this);
    }

    /**
     * @return the actuacion
     */
    private Animal getActuacion() {
        return actuacion;
    }

    /**
     * @param actuacion the actuacion to set
     */
    private void setActuacion(Animal actuacion) {
        this.actuacion = actuacion;
    }

 

    
    
}
