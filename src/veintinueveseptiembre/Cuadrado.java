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
public class Cuadrado extends Rectangulo {

    public Cuadrado(int ancho) {
        super(ancho, ancho);
    }
   
    public int perimetro()
    {
        return 4*getAncho();
    }
    
}
