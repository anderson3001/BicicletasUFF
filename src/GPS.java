/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ansel
 */
public class GPS {
    private int id;
    private String modelo;

    public GPS(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }
    
    Ponto2D getPosicao(){
        /* Modifique este método para que gere um número aleatório entre [0,1000] */
        return new Ponto2D((float)(Math.random()*1000),(float)(Math.random()*1000));
    }
}
