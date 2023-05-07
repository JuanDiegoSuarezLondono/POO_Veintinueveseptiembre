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
public class Escaleno extends Triangulo{

    public Escaleno(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }
    @Override
    public double area()
    {        
        return Math.sqrt(((getLado1()+getLado2()+getLado3())/2)*(((getLado1()+getLado2()+getLado3())/2)-getLado1())*(((getLado1()+getLado2()+getLado3())/2)-getLado2())*(((getLado1()+getLado2()+getLado3())/2)-getLado3()));
    }
}
