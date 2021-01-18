import java.util.ArrayList;

public abstract class JogoDeDoisJogadores {
    protected String nomeJogo;
    protected String nomeJogador1;
    protected String nomeJogador2;
    protected int numeroDeRodadas;
    protected ArrayList<Integer> historicoResultados;

    public JogoDeDoisJogadores(String nomeJogo, String nomeJogador1, String nomeJogador2, int numeroDeRodadas) {
        this.nomeJogo = nomeJogo;
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
        this.numeroDeRodadas = numeroDeRodadas;
    }
    public String getNomeJogo() { return this.nomeJogo; }

    public String getNomeJogador1() { return this.nomeJogador1; }

    public String getNomeJogador2() { return this.nomeJogador2; }

    public int getNumeroDeRodadas() { return this.numeroDeRodadas; }

    protected String jogar() {
        int vitorias_jogador1 = 0;
        int vitorias_jogador2 = 0;
        int empates = 0;

        for (int i = 0; i < this.numeroDeRodadas; i++) {
            int resultado = executarRodadaDeJogo();

            if (resultado == 1) {
                vitorias_jogador1++;
            }
            if (resultado == 2) {
                vitorias_jogador2++;
            }
            if (resultado == 0) {
                empates++;
            }
        }
        if(vitorias_jogador1>vitorias_jogador2)
            return "O jogador "+this.nomeJogador1+" venceu o jogo por "+vitorias_jogador1+" a "+vitorias_jogador2;
        else if(vitorias_jogador2>vitorias_jogador1)
            return "O jogador "+this.nomeJogador2+" venceu o jogo por "+vitorias_jogador2+" a "+vitorias_jogador1;
        else
            return "O jogo terminou em empate após "+this.numeroDeRodadas+" rodadas";
    }

    protected abstract int executarRodadaDeJogo();
}
