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
public class Tigre extends Felino {
    //ATRIBUTOS
    private String cor;
    
    //CONSTRUTORES
    //VAZIO
    public Tigre() {
    }
    //CHEIO
    public Tigre(String cor, String comida, String habitat) {
        super(comida, habitat);
        this.cor = cor;
    }
    
    //GETTER E SETTER
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Urro");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Tigre");
    }
}
