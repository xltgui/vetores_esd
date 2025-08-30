public class Iterator {
    private No atual;

    public Iterator(No inicio) {
        this.atual = inicio;
    }

    public void inserirDepois(Integer valor) {
        if (atual == null) return;

        No novo = new No(valor);
        novo.proximo = atual.proximo;
        novo.anterior = atual;

        if (atual.proximo != null) {
            atual.proximo.anterior = novo;
        }
        atual.proximo = novo;
    }

    public void removerDepois() {
        if (atual == null || atual.proximo == null) return;

        No remover = atual.proximo;
        atual.proximo = remover.proximo;

        if (remover.proximo != null) {
            remover.proximo.anterior = atual;
        }
    }

    public void inserirAntes(Integer valor) {
        if (atual == null) return;

        No novo = new No(valor);
        novo.anterior = atual.anterior;
        novo.proximo = atual;

        if (atual.anterior != null) {
            atual.anterior.proximo = novo;
        }
        atual.anterior = novo;
    }

    public void removerAntes() {
        if (atual == null || atual.anterior == null) return;

        No remover = atual.anterior;
        atual.anterior = remover.anterior;

        if (remover.anterior != null) {
            remover.anterior.proximo = atual;
        }
    }

    public void moverParaProximo() {
        if (atual != null) {
            atual = atual.proximo;
        }
    }
}
