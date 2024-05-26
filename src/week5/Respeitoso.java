public class Respeitoso implements FormatadorNome {
    private boolean masculino;

    public Respeitoso(boolean masculino) {
        this.masculino = masculino;
    }

    public String formatarNome(String nome, String sobrenome) {
        return (masculino ? "Sr. " : "Sra. ") + sobrenome;
    }
}