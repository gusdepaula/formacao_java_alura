import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o limite do cartão de crédito: R$");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair =  1;
        while (sair != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = leitura.next();
            System.out.print("Digite o valor da compra: R$");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 pra sair ou 1 para continuar.");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente para realizar a compra.");
                sair = 0;
            }

        }

        System.out.println("*******************************");
        System.out.println("Compras realizadas: \n");

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - R$" + c.getValor());
        }

        System.out.println("*******************************");
        System.out.println("Limite do cartão: R$" + cartao.getLimite());
        System.out.println("Saldo devedor: R$" + cartao.getSaldoDevedor());
        leitura.close();
    }
}
