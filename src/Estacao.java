/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aluno
 */
public class Estacao {
    private static final int MAXBICICLETAS = 20;
    private int id;
    private String nome;
    private String localidade;
    private ListaBicicletasDupEnc bicicletas;
    
    Estacao(int id, String nome, String localidade){
        this.id = id;
        this.nome = nome;
        this.localidade = localidade;
        this.bicicletas = new ListaBicicletasDupEnc();
    }

    public void adicionarBicicleta(Bicicleta b){
        this.bicicletas.append(b);
    }
    
    public void removerBicicleta(int id){
       bicicletas.deleteById(id);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public ListaBicicletasDupEnc getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ListaBicicletasDupEnc bicicletas) {
        this.bicicletas = bicicletas;
    }
    
    
    public void listarBicicletas(){
        System.out.println(this.nome + " em " +this.localidade);
        System.out.println("Contem:");
        this.bicicletas.imprimir();
        
    }
    
    public String bicicletasToString(){
        
        /* Modifique este metodo para que ele retorne uma string contendo os ids das bicicletas */
        StringBuilder s = new StringBuilder("[");
        NoBicicleta aux = bicicletas.getPrimeiro();
        while (aux != null) {
            s.append(aux.dado.getId());
            if (aux.prox != null) {
                s.append(", ");
            }
            aux = aux.prox;
        }
        
        s.append("]");
        
        return s.toString();
    }

    @Override
    public String toString() {
        return "Estacao{" + "id = " + id + ", nome = " + nome + ", localidade = " + localidade + ", bicicletas = " + bicicletasToString() + '}';
    }
    
    
    
}
