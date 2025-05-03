public class ListaBicicletasDupEnc {
    private NoBicicleta primeiro;
    private NoBicicleta ultimo;
    private int tamanho;

    public ListaBicicletasDupEnc() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void append(Bicicleta b) {
        NoBicicleta bike = new NoBicicleta(b);

        if (primeiro == null) {
            primeiro = bike;
            ultimo = bike;
        }
        else {
            ultimo.prox = bike;
            bike.ant = ultimo;
            ultimo = bike;
        }
        tamanho++;
    }

    public void imprimir() {
        NoBicicleta atual = primeiro;

        if (primeiro == null) {
            System.out.println("A lista está vazia.");
        }
        else {
            System.out.println("--------------Lista de bicicletas--------------");
            while (atual != null) {
                System.out.println(atual);
                atual = atual.prox;
            }
        }
    }

    public Bicicleta getById (int id){
        NoBicicleta atual = primeiro;
        if (atual == null) {
            System.out.println("A lista está vazia.");
            return null;
        }
        while (atual != null){
            if (atual.dado.getId() == id){
                return atual.dado;
            }
            atual = atual.prox;
        }

        return null;
    }

    public void deleteById (int id){
        NoBicicleta atual = primeiro;
        if (atual == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        while (atual != null){
            if (atual.dado.getId() == id){
                if (atual.ant == null){
                    primeiro = atual.prox;
                    if (primeiro != null){
                        primeiro.ant = null;
                    }
                }
                else if (atual.prox == null){
                    atual.ant.prox =null;
                }
                else{
                    atual.ant.prox = atual.prox;
                    atual.prox.ant = atual.ant;
                }
                System.out.println("Bicicleta removida com sucesso");
                tamanho--;
                return;
            }
            atual = atual.prox;
        }
        System.out.println("Bicicleta com id " + id + " não encontrada.");
    }

    public void ordenaPorId (){
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        if (primeiro.prox == null){
            System.out.println("A lista só tem um elemento, logo já está ordenada.");
            return;
        }

        boolean trocou;

        do{
            trocou = false;
            NoBicicleta atual = primeiro;

            while(atual.prox != null){
                if (atual.dado.getId() > atual.prox.dado.getId()){
                    Bicicleta temp = atual.dado;
                    atual.dado = atual.prox.dado;
                    atual.prox.dado = temp;

                    trocou = true;
                }
            }

        }while (trocou);
    }






    public NoBicicleta getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoBicicleta primeiro) {
        this.primeiro = primeiro;//mudar
    }

    public NoBicicleta getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoBicicleta ultimo) {
        this.ultimo = ultimo;//mudar
    }

    public int getTamanho() {
        return tamanho;
    }
}
