package desafio_composicao;

import java.util.ArrayList;

public class Cliente {

    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();
    
    public Cliente(String nome) {
        this.nome = nome;
    }

    protected Double obterValorTotal() {
        Double total = 0.0;
        for (Compra compra: compras) {
            for (Item item: compra.items) {
                total += item.produto.preco * item.quantidade;
            }
        }
        return total;
    }
}
