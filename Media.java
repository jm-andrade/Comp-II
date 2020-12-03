import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {


        // while que vai receber as notas
        long dre = 0; // inicializando variavel
        float media = 0;// inicializando variavel
        int i = 0;// quantidade de notas
        float mediaTurma =0;
        float max=0;

        while (media >= 0) {
            System.out.println("Digite a sua media, caso não  tenha mais media.digite um valor <0");

            //declarando o scanner
            Scanner scanner = new Scanner(System.in);
            media = scanner.nextFloat();

            // testando se e negativo
            if (media<0)
            {
                break;
            }

            // descobrimdo qual a maior nota
            if (media>max)
            {
              max = media;
            }
            mediaTurma = mediaTurma + media;
            i++;
        }
''
        System.out.println("A quantidade de aljnos é " + i);
        System.out.println("a media da turma é: "+ mediaTurma /i);
        System.out.println("A maior nota é: " + max);
    }
}
