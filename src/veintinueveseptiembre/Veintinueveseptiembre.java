/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veintinueveseptiembre;

/**
 *
 * @author suare
 */
public class Veintinueveseptiembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo R=new Rectangulo(2,4);
        Cuadrado C=new Cuadrado(4);
        System.out.println("R: "+R.area());
        System.out.println("C: "+C.perimetro());
        
        Escaleno Es=new Escaleno(2,2,2);
        Equilatero Eq= new Equilatero(2);
        Isosceles I= new Isosceles(5,12);
        
        System.out.println("R: "+R.area());
        System.out.println("C: "+C.perimetro());
        System.out.println("Es: "+Es.area());
        System.out.println("Eq: "+Eq.area());
        System.out.println("I: "+I.area());
        // TODO code application logic here
    }    
}
