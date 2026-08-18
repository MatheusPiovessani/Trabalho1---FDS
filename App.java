// testando e praticando factory e interface
public class App {

    //texto a ser codificado e decodificado
    private static final String TEXTO = "Este e o string a ser codificado";

    public static void main(String[] args) throws Exception {

        //percorre todas os codificadores registrados no factory
        System.out.println("=== Implementacoes disponiveis ===");

        for (Codificador cod : CodificadorFactory.getCodificadores()) {
            demonstra(cod);
        }

        //percorre o factory escolhendo pelo nivel de seguranca pedido
        System.out.println("=== Escolha por nivel de seguranca ===");

        for (int nivel : new int[] { 1, 10, 30, 50, 100 }) {
            Codificador cod = CodificadorFactory.getCodificador(nivel);
            System.out.println("Nivel pedido: " + nivel
                    + " -> " + cod.getNome()
                    + " (nivel real: " + cod.getNivelSeguranca() + ")");
        }
    }

    //metodo para a visualizacao do resultado da codificacao e decodificacao
    private static void demonstra(Codificador cod) {
        String codificado = cod.codifica(TEXTO);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Codificador: " + cod.getNome());
        System.out.println("Versao: " + cod.getDataCriacao());
        System.out.println("Nivel de seguranca: " + cod.getNivelSeguranca());
        System.out.println("Texto original: " + TEXTO);
        System.out.println("Texto codificado: " + codificado);
        System.out.println("Texto decodificado: " + decodificado);
        System.out.println("Decodificacao confere: " + decodificado.equals(TEXTO));
        System.out.println();
    }
}