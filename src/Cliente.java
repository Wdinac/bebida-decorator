public class Cliente {
    public static void main(String[] args) {
        // Quando você cria um new Cafe(),
        // ele tem um custo fixo, por exemplo R$3,00.
        Bebida pedido = new Cafe();
        
        // Bebida pedido = new Leite(new Cafe());
        pedido = new Leite(pedido);
        // O Leite recebe dentro dele um Cafe.
        // Quando o cliente chama pedido.custo():
        // O Leite.custo() chama internamente o Cafe.custo() (3,00)
        // e adiciona +1,00 -> 4,00.
        
        // Bebida pedido = new Chocolate(new Leite(new Cafe()));
        pedido = new Chocolate(pedido);
        // Quando chamar pedido.custo():
        // Chocolate.custo() chama Leite.custo(),
        // que por sua vez chama Cafe.custo().
        // Os retornos vão sendo somados em cadeia:
        // Café Simples -> 3,00
        // Leite adiciona -> +1,00 -> 4,00
        // Chocolate adiciona -> +2,00 -> 6,00
        
        // O mesmo vale para o getDescrição: Café Simples, Leite, Chocolate
        System.out.println(pedido.getDescricao() + " custa R$ " + pedido.getCusto());
    }
}