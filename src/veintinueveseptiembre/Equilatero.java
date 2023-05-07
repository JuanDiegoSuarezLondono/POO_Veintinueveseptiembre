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
public class Equilatero extends Triangulo{

    public Equilatero(int lado){
        super(lado, lado, lado);
    }
    
    @Override
    public double area()
    {
        return (Math.sqrt(3)*getLado1())/2;
    }   
}
