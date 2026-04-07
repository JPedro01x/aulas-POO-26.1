public class Main {
    public static void main(String[] args) {

        // 1. Criar o cliente
        Cliente cliente = new Cliente("Mariana Silva", 5);

        // 2. Criar os 3 pedidos
        Pedido pedido1 = new Pedido("Pizza Grande", 45.00, 1);
        Pedido pedido2 = new Pedido("Refrigerante", 8.00, 2);
        Pedido pedido3 = new Pedido("Sobremesa", 18.00, 1);

        // 3. Criar a conta do restaurante
        ContaRestaurante conta = new ContaRestaurante(cliente, pedido1, pedido2, pedido3);

        // 4. Exibir o relatório final
        conta.exibirRelatorio();
    }
}