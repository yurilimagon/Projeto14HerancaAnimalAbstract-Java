/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public abstract class Canino extends Animal {
    //CONSTRUTORES
    //VAZIO
    public Canino() {
    }
    //CHEIO
    public Canino(String comida, String habitat) {
        super(comida, habitat);
    }
    
    @Override
    public abstract void makeNoise();
}
