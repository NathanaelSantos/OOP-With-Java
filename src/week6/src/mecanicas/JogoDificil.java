package mecanicas;

import embaralhadores.Inverter;
import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;
import java.util.List;
import java.util.Random;

public class JogoDificil implements MecanicaDoJogo {
    private int errosPermitidos = 1;
    private int erros = 0;
    private List<String> palavras;
    private String palavraAtual;
    private Embaralhador embaralhador = new Inverter();
    private Random random = new Random();

    public JogoDificil(List<String> palavras) {
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
        return palavraAtual.length() - erros * 2;
    }

    public String getPalavra() {
        return embaralhador.embaralhar(palavraAtual);
    }
}
