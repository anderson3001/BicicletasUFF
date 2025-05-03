/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aluno
 */
public class ListaBicicletas{
    private Bicicleta[] elementos;
    private int max;
    private int n;
    
    ListaBicicletas(int max){
        this.n = 0;
        this.max = max;
        this.elementos = new Bicicleta[max];
    }
    
    public void append(Bicicleta b){
        /*if (this.n < this.max){
            this.elementos[this.n++] = o;
        }
        else{
     
            System.out.println("Erro:Lista esta cheia.");
        }*/
        
        try{
            this.elementos[this.n++] = b;
        }
        catch(ArrayIndexOutOfBoundsException e){
            this.n--;
            System.out.println(e);
        }
    }

    public void imprimir() {
        System.out.println("[ ");
        for (int i = 0;i<this.n;i++){
            System.out.println(this.elementos[i]+" ");
            
        }
        System.out.println("]");
    }
    
    public Bicicleta get(int i){
        Bicicleta b = null;
        try{
            b = this.elementos[i];
        }
        catch(Exception e){
            System.out.println(e);
        }   
        return b;
    }
    
    public Bicicleta getId(int id){
        for (Bicicleta b:elementos){
            if (b.getId()==id){
                return b;
            }
        }
        return null;
    }

    public void removerId(int id){
        /* Implemente o método para remover uma bicicleta dada seu id */
   
        
    }

    public void ordenarId(){
        /* Implemente um metodo que ordene as bicicletas por id */
        
    }
    
    public int length(){
        return this.n;
    }
    
}
