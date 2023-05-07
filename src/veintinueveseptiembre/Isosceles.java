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
public class Isosceles extends Triangulo{

    public Isosceles(int lado1, int lado2) {
        super(lado1, lado2, lado2);
    }
    
    @Override
    public double area()
    {
        return Math.sqrt(Math.pow(getLado1(), 2)-(Math.pow(getLado2(), 2)/4));
    }
    
    
}
