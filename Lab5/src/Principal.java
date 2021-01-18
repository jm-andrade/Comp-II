public class Principal {
    public static void main(String[] args) {

        DadosDeGamao dadosDeGamao = new DadosDeGamao();
        DadoTriplo dadosTriplos = new DadoTriplo();

        for(int i = 1; i <= 100; i++) {
            JogoMalucoComSorteadores jogo = new JogoMalucoComSorteadores(
                    "dadinhos",
                    "João",
                    "Pedro",
                    i,
                    dadosDeGamao,
                    dadosTriplos);

            String resultado = jogo.jogar();
            System.out.println(resultado);
        }

    }
}