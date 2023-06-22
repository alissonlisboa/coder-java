package desafio_composicao;

public class Item {
    
    Produto produto;
    Integer quantidade;
    
    Item(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
