// Devolve o codificador com o nivel de seguranca mais proximo do pedido.
// Para registrar uma implementacao nova, basta adiciona-la no array abaixo.
public class CodificadorFactory {

    public static Codificador[] getCodificadores() {
        return new Codificador[] {
            new CodificadorSimples(),
            new CodificadorVigenere(),
            new CodificadorMorse()
        };
    }

    public static Codificador getCodificador(int nivelDesejado) {
        Codificador escolhido = null;
        int menorDistancia = Integer.MAX_VALUE;

        for (Codificador candidato : getCodificadores()) {
            int distancia = Math.abs(candidato.getNivelSeguranca() - nivelDesejado);

            // em caso de empate fica o mais seguro
            if (distancia <= menorDistancia) {
                escolhido = candidato;
                menorDistancia = distancia;
            }
        }

        return escolhido;
    }
}