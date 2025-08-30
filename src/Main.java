//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Vetor
        Vetor v = new Vetor(10);

        int[] data = {2,7,9,12,16,21,27,33,42,54};

        for (int d : data) v.adicionar(d);

        System.out.println("Busca binária (valor 21): index " + v.buscaBinaria(21));
        v.inserirNoInicio(99);
        System.out.println("Elemento na posição 0 após inserir no início: " + v.elementos[0]);

        // Lista duplamente encdeada
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserirNoFinal(1);
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(3);
        System.out.println("Tamanho da lista antes: " + lista.getTamanho());
        lista.inserirApos(2, 99);
        System.out.println("Tamanho após inserir: " + lista.getTamanho());


        // Iterator
        ListaDuplamenteEncadeada listaIterator = new ListaDuplamenteEncadeada();
        listaIterator.inserirNoFinal(10);
        listaIterator.inserirNoFinal(20);
        listaIterator.inserirNoFinal(30);

        Iterator it = new Iterator(listaIterator.getInicio());

        // inserir depois do atual (10 → 15 → 20 → 30)
        it.inserirDepois(15);

        // andar para frente (agora atual = 20)
        it.moverParaProximo();

        // inserir antes do atual (10 → 15 → 18 → 20 → 30)
        it.inserirAntes(18);

        // remover depois do atual (remove 30, fica 10,15,18,20)
        it.removerDepois();

        // imprimir lista final
        No atual = listaIterator.getInicio();
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
    }
}