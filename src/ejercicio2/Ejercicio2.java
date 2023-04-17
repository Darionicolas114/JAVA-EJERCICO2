/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author dario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computadora componentes=new Computadora(18.5, 1, 48, "Lenovo");
        {
            System.out.println("Pantalla : " + componentes.getPantalla()+ " Pulgadas");
            System.out.println("Mause : " + componentes.getMause());
            System.out.println("Teclado con : " + componentes.getTeclado() + " Botones");
            System.out.println("Marca : " + componentes.getMarca());
        
        
        
        };
        
        
        
        
    }
    
}
