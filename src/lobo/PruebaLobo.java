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
public class PruebaLobo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lobo lobito = new Lobo("Colmillo Blanco");
        lobito.disfrazar(2);
        System.out.println(lobito.emitirSonido());
        System.out.println(lobito.correr());
        System.out.println(lobito.comer("gallina"));
        System.out.println(lobito.comer("vegetales"));
        System.out.println(lobito.comer("pizza"));
        System.out.println(lobito.comer("Helado"));
        System.out.println(lobito);
    }
    
}
