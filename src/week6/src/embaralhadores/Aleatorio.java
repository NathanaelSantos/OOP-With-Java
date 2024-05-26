package embaralhadores;

import interfaces.Embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aleatorio implements Embaralhador {
    public String embaralhar(String palavra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            letras.add(c);
        }
        Collections.shuffle(letras);
        StringBuilder sb = new StringBuilder();
        for (char c : letras) {
            sb.append(c);
        }
        return sb.toString();
    }
}