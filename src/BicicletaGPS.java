/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ansel
 */
public class BicicletaGPS extends Bicicleta {
    private GPS gps;
    

    public BicicletaGPS(int id, int numPat, String modeloGPS ) {
        super(id, numPat);
        this.gps = new GPS(id,modeloGPS);
        
    }
    
    public Ponto2D getPosicao(){
        /* Modifique este metodo para retornar  a posicao via o GPS */
        
        return new Ponto2D(0,0);
    }
    
    
    
}
