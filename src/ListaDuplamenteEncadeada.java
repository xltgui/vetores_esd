public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    public void inserirNoFinal(Integer valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirApos(Integer valorProcurado, Integer novoValor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valorProcurado)) {
                No novo = new No(novoValor);
                novo.proximo = atual.proximo;
                novo.anterior = atual;

                if (atual.proximo != null) {
                    atual.proximo.anterior = novo;
                } else {
                    fim = novo;
                }

                atual.proximo = novo;
                tamanho++;
                return;
            }
            atual = atual.proximo;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public No getInicio() {
        return inicio;
    }
}

