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
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public int area()
    {
        return alto*ancho;
    }

    public int getAncho() {
        return ancho;
    }
}
