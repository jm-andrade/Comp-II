public class DadosDeGamao extends Dado implements Sorteador
{
    public int jogarDoisDados(){
        // sorteando os valores dos dados
        int dado1 = sortear();
        int dado2 = sortear();
        int resultado = (dado1==dado2)? (4*dado1): (dado1+dado2);


        return resultado;
    }
}
