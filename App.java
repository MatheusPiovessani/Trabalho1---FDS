public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        Codificador codMorse = new CodificadorMorse();

        System.out.println("Codificador: "+codMorse.getNome());
        System.out.println("Versao: "+codMorse.getDataCriacao());
        System.out.println("Nivel de segurança: "+codMorse.getNivelSeguranca());
        
        String textoCodMorse = "Este e o string a ser codificado";
        String codificadoCodMorse = codMorse.codifica(textoCodMorse);
        String decodificadoCodMorse = codMorse.decodifica(codificadoCodMorse);

        System.out.println("Texto original: "+textoCodMorse);
        System.out.println("Texto codificado: "+codificadoCodMorse);
        System.out.println("Texto decodificado: "+decodificadoCodMorse);
    }
}
