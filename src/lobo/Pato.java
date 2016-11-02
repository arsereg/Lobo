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
public class Pato extends Animal{

    @Override
    public String emitirSonido() {
       return "Cuack cuack!"; 
    }

    @Override
    public String correr() {
        return "Placa, placa placa";
    }

    @Override
    public String comer(String pcomida) {
        String resul = "";
        switch(pcomida){
            case "Gallina":
                resul = "Venga para acá, a mis familiares los amo más";
                break;
            case "Vegetales":
                resul = "Lo que sea";
                break;
            case "Pizza":
                resul = "Soy como las tortugas";
                break;
            default:
                resul = "No desperdicio nada";
                break;
        }
        return resul;
    }
    
}
