package mecanicas;

import embaralhadores.Aleatorio;
import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;
import java.util.List;
import java.util.Random;

public class JogoFacil implements MecanicaDoJogo {
    private int errosPermitidos = 3;
    private int erros = 0;
    private List<String> palavras;
    private String palavraAtual;
    private Embaralhador embaralhador = new Aleatorio();
    private Random random = new Random();

    public JogoFacil(List<String> palavras) {
        this.palavras = palavras;
        this.palavraAtual = getNovaPalavra();
    }

    private String getNovaPalavra() {
        return palavras.get(random.nextInt(palavras.size()));
    }

    public boolean acabou() {
        return erros >= errosPermitidos;
    }

    public boolean acertou(String tentativa) {
        if (tentativa.equals(palavraAtual)) {
            palavraAtual = getNovaPalavra();  
            return true;
        } else {
            erros++;
            return false;
        }
    }

    public int getPontuacao() {
        return palavraAtual.length() - erros;
    }

    public String getPalavra() {
        return embaralhador.embaralhar(palavraAtual);
    }
}