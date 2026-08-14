import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CodificadorMorse implements Codificador{
    
    public String getNome(){
        return "Código Morse";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2026, 8, 14);
    }

    public int getNivelSeguranca(){
        return 50;
    }

    public String codifica(String msgm){
        StringBuilder codificado = new StringBuilder();
        String upperTexto = msgm.toUpperCase();

        //dicionario
        HashMap<Character, String> mapaCodigoMorse = new HashMap<>();

            {
            mapaCodigoMorse.put('A', ".- "); 
            mapaCodigoMorse.put('B', "-... ");
            mapaCodigoMorse.put('C', "-.-. "); 
            mapaCodigoMorse.put('D', "-.. ");
            mapaCodigoMorse.put('E', ". ");   
            mapaCodigoMorse.put('F', "..-. ");
            mapaCodigoMorse.put('G', "--. ");  
            mapaCodigoMorse.put('H', ".... ");
            mapaCodigoMorse.put('I', ".. ");   
            mapaCodigoMorse.put('J', ".--- ");
            mapaCodigoMorse.put('K', "-.- ");  
            mapaCodigoMorse.put('L', ".-.. ");
            mapaCodigoMorse.put('M', "-- ");   
            mapaCodigoMorse.put('N', "-. ");
            mapaCodigoMorse.put('O', "--- ");  
            mapaCodigoMorse.put('P', ".--. ");
            mapaCodigoMorse.put('Q', "--.- "); 
            mapaCodigoMorse.put('R', ".-. ");
            mapaCodigoMorse.put('S', "... ");  
            mapaCodigoMorse.put('T', "- ");
            mapaCodigoMorse.put('U', "..- ");  
            mapaCodigoMorse.put('V', "...- ");
            mapaCodigoMorse.put('W', ".-- ");  
            mapaCodigoMorse.put('X', "-..- ");
            mapaCodigoMorse.put('Y', "-.-- "); 
            mapaCodigoMorse.put('Z', "--.. ");
            mapaCodigoMorse.put(' ', "/ ");

            }

        for (char c : upperTexto.toCharArray()) {
            codificado.append((mapaCodigoMorse.get(c)));
        }

        return codificado.toString();

    }

    public String decodifica(String msgmMorse){
        StringBuilder decodificado = new StringBuilder();
        String upperTexto = msgmMorse.toUpperCase();

        HashMap<String, Character> mapaCodigoMorseRev = new HashMap<>();

            {
            mapaCodigoMorseRev.put(".-", 'A'); 
            mapaCodigoMorseRev.put("-...", 'B');
            mapaCodigoMorseRev.put("-.-.", 'C'); 
            mapaCodigoMorseRev.put("-..", 'D');
            mapaCodigoMorseRev.put(".", 'E');   
            mapaCodigoMorseRev.put("..-.", 'F');
            mapaCodigoMorseRev.put("--.", 'G');  
            mapaCodigoMorseRev.put("....", 'H');
            mapaCodigoMorseRev.put("..", 'I');   
            mapaCodigoMorseRev.put(".---", 'J');
            mapaCodigoMorseRev.put("-.-", 'K');  
            mapaCodigoMorseRev.put(".-..", 'L');
            mapaCodigoMorseRev.put("--", 'M');   
            mapaCodigoMorseRev.put("-.", 'N');
            mapaCodigoMorseRev.put("---", 'O');  
            mapaCodigoMorseRev.put(".--.", 'P');
            mapaCodigoMorseRev.put("--.-", 'Q'); 
            mapaCodigoMorseRev.put(".-.", 'R');
            mapaCodigoMorseRev.put("...", 'S');  
            mapaCodigoMorseRev.put("-", 'T');
            mapaCodigoMorseRev.put("..-", 'U');  
            mapaCodigoMorseRev.put("...-", 'V');
            mapaCodigoMorseRev.put(".--", 'W');  
            mapaCodigoMorseRev.put("-..-", 'X');
            mapaCodigoMorseRev.put("-.--", 'Y'); 
            mapaCodigoMorseRev.put("--..", 'Z');
            mapaCodigoMorseRev.put("/", ' ');
        }

        for (char c : upperTexto.toCharArray()) {
            decodificado.append((mapaCodigoMorseRev.get(c)));
        }
        return decodificado.toString();

    }

    

}
