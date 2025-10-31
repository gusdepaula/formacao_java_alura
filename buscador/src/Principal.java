import javax.imageio.IIOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.println("Digite o CEP que deseja consultar:");
        String cepInput = leitura.nextLine();

        try {
            Endereco endereco = consultaCEP.buscarEnderecoPorCEP(cepInput);
            System.out.println(endereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.gerarArquivo(endereco);
        } catch (Exception e) {
            System.out.println("Erro ao buscar o CEP: " + e.getMessage());
            System.out.println("Verifique se o CEP informado é válido.");
        }
    }
}
