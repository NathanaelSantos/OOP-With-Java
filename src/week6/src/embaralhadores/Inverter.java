package embaralhadores;

import interfaces.Embaralhador;

public class Inverter implements Embaralhador {
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}