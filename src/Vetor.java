public class Vetor {

    Integer[] elementos;
    int tamanho;
    int capacidade;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(Integer valor) {
        if (this.tamanho == this.capacidade) {
            System.out.println("o vetor está cheio");
            return;
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public void aumentarCapacidade() {
        int novaCapacidade = this.capacidade * 2;

        Integer[] novosElementos = new Integer[novaCapacidade];
        for (int i = 0; i < this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.capacidade = novaCapacidade;
        this.elementos = novosElementos;
    }

    public void remover(Integer valor) {
        int posicao = encontrarPosicaoValor(valor);
        if (posicao == -1) {
            System.out.println("valor não encontrado");
            return;
        }

        for (int i = posicao; i <= this.tamanho; i++) {
            if (i == this.tamanho) {
                this.elementos[i] = null;
                break;
            }

            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    public int encontrarPosicaoValor(Integer valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                return i;
            }
        }

        return -1;
    }


    public int buscaBinaria(Integer valor) {
        int inicio = 0;
        int fim = this.tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (this.elementos[meio].equals(valor)) {
                return meio;
            } else if (valor < this.elementos[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }


    public void inserirNoInicio(Integer valor) {
        if (this.tamanho == this.capacidade) {
            aumentarCapacidade();
        }

        for (int i = this.tamanho; i > 0; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }

        this.elementos[0] = valor;
        this.tamanho++;
    }


}
