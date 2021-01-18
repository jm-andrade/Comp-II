import java.util.Random;

public class Dado implements Sorteador{
    public int sortear (){
        return new Random().nextInt(6)+1;
    }
}