import java.time.LocalDate;

// Cifra de Vigenere: cada letra e deslocada conforme uma letra da chave,
// que se repete ao longo do texto. O que nao e letra fica normal.
public class CodificadorVigenere implements Codificador {

    private static final String CHAVE = "PUCRS";

    public String getNome() {
        return "Codificador Vigenere";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 8, 17);
    }

    public int getNivelSeguranca() {
        return 25;
    }

    public String codifica(String str) {
        return desloca(str, 1);
    }

    public String decodifica(String str) {
        return desloca(str, -1);
    }

    private String desloca(String str, int sentido) {
        StringBuilder resultado = new StringBuilder();
        int posicaoChave = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && c < 128) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int deslocamento = CHAVE.charAt(posicaoChave % CHAVE.length()) - 'A';
                resultado.append((char) (base + (c - base + sentido * deslocamento + 26) % 26));
                posicaoChave++;
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
}