public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private  int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaAvaliacoes =  somaAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
