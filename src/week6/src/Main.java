import interfaces.MecanicaDoJogo;
import mecanicas.JogoFacil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var palavras = Arrays.asList(
                "caminhao", "computador", "java", "futebol", "praia", "musica", "copo",
                "mesa", "cadeira", "janela", "porta", "carro", "bicicleta", "aviao",
                "telefone", "livro", "lapis", "relogio", "sapato", "chave"
        );

        MecanicaDoJogo jogo = new JogoFacil(palavras);
        while (!jogo.acabou()) {
            System.out.println("Adivinhe a palavra: " + jogo.getPalavra());
            String tentativa = new Scanner(System.in).nextLine();
            if (jogo.acertou(tentativa)) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou.");
            }
        }
        System.out.println("Fim do jogo. Sua pontuação foi: " + jogo.getPontuacao());
    }
}
