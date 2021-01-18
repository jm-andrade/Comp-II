public class JogoMalucoComSorteadores extends JogoDeDoisJogadores {

    private Sorteador sorteador1;
    private Sorteador sorteador2;

    public JogoMalucoComSorteadores(String nomeJogo, String nomeJogador1, String nomeJogador2, int numeroDeRodadas, Sorteador sorteador1, Sorteador sorteador2) {
        super(nomeJogo, nomeJogador1, nomeJogador2, numeroDeRodadas);
        this.sorteador1 = sorteador1;
        this.sorteador2 = sorteador2;
    }

    @Override
    protected int executarRodadaDeJogo() {
        int numeroJogador1 = sorteador1.sortear();
        int numeroJogador2 = sorteador2.sortear();

        if(numeroJogador1 > numeroJogador2)
            return 1;
        else if(numeroJogador1 < numeroJogador2)
            return 2;
        else
            return 0;
    }
}