public class ListaEstacoesDupEnc {
    NoEstacao primeiro;
    NoEstacao ultimo;
    int tamanho;

    ListaEstacoesDupEnc(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void append(Estacao e) {
        NoEstacao estacao = new NoEstacao(e);

        if (primeiro == null){
            primeiro = estacao;
            ultimo = estacao;
        }
        else {
            ultimo.prox = estacao;
            estacao.ant = ultimo;
            ultimo = estacao;
        }
        tamanho++;
    }

    public void imprimir(){
        NoEstacao atual = primeiro;

        if (primeiro == null) {
            System.out.println("A lista está vazia.");
        }
        else {
            System.out.println("--------------Lista de estações--------------");
            while (atual != null) {
                System.out.println(atual);
                atual = atual.prox;
            }
        }
    }

    public Estacao getById (int id){
        NoEstacao atual = primeiro;
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

    public void deleteById(int id){
        NoEstacao atual = primeiro;

        if (atual == null) {
            System.out.println("A lista está vazia.");
            return ;
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
                System.out.println("Estação removida com sucesso");
                tamanho--;
                return;
            }
            atual = atual.prox;
        }
        System.out.println("Estação com id " + id + " não encontrada.");

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
            NoEstacao atual = primeiro;

            while(atual.prox != null){
                if (atual.dado.getId() > atual.prox.dado.getId()){
                    Estacao temp = atual.dado;
                    atual.dado = atual.prox.dado;
                    atual.prox.dado = temp;

                    trocou = true;
                }
            }

        }while (trocou);
    }




    public NoEstacao getPrimeiro() {
        return primeiro;
    }
    public NoEstacao getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }
}
