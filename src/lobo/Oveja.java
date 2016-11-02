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
public class Oveja extends Animal{

    @Override
    public String emitirSonido() {
        return "Beeeeeee!";
    }

    @Override
    public String correr() {
       return "Hago lo que puedo, soy chiquita, que acaso no me ves?";
    }

    @Override
    public String comer(String pcomida) {
        String resul = "";
        switch(pcomida){
            case "Gallina":
                resul = "Mis amiguitas jamas";
                break;
            case "Vegetales":
                resul = "Paselo, me encanta";
                break;
            case "Pizza":
                resul = "Lo que sea";
                break;
            default:
                resul = "Mejor no, probemos otra";
                break;
        }
        return resul;
    }
    
}
