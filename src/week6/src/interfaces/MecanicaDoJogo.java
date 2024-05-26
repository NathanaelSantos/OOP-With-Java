package interfaces;

public interface MecanicaDoJogo {
    boolean acabou();
    boolean acertou(String palavra);
    int getPontuacao();
    String getPalavra();
}