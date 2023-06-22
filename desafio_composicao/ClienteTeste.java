package desafio_composicao;

import java.lang.reflect.Method;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alisson");
        
        ClienteFilho clienteFilho = new ClienteFilho("Alisson");
        
        clienteFilho.obterValorTotal();

        Produto produto1 = new Produto("alicate", 25.99);
        Produto produto2 = new Produto("tesoura", 5.99);

        Item item1 = new Item(produto1, 2);
        Item item2 = new Item(produto2, 3);

        Compra compra1 = new Compra();
        compra1.items.add(item1);
        compra1.items.add(item2);

        cliente.compras.add(compra1);
        
        Method[] metodos = cliente.getClass().getDeclaredMethods();
        
        String[] methodNames = new String[1];
        
        for (Method m: metodos) {
            methodNames[0] = m.getName();
        }
        
        System.out.println(methodNames.toString());
        
    } 
}
