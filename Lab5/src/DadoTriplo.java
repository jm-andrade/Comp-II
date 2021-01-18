public class DadoTriplo extends  Dado implements  Sorteador{
    public int jogarTresDados (){
        int resultado =0;
        for (int i=0; i<3; i++){
            resultado+= sortear();
        }
        return resultado;

    }
}
