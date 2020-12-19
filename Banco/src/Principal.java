import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ContaCorrente>contas=new ArrayList();
        ArrayList<Pessoa>fulano=new ArrayList();


        char s ='z';
        Scanner src = new Scanner(System.in);
        while (s!='x'){
            System.out.println("Bem vindo ao JM bank");
            System.out.println("Qual sua opção: ");
            System.out.println("(D)epositar\n" +
                    "   (S)acar\n" +
                    "   (T)ransferir\n" +
                    "   (C)onsultar saldo\n" +
                    "   Cadastrar (P)essoa como correntista\n" +
                    "   Criar (N)ova conta\n" +
                    "   (X) para sair\n" +
                    "\n"+
                    "   Opção desejada:");
            s=src.next().charAt(0);

            if (s=='d') // depositar
            {

            }
            if (s=='s')// sacar
            {

            }
            if (s=='t')// transferir
            {

            }
            if (s=='c')//consultar saldo
            {

            }
            if (s=='p')// cadastrar pessoa como correntista
            {
                System.out.println("Digite seu nome: ");
                String nome =src.nextLine();

                System.out.println("Digite seu cpf: ");
                Long cpf =src.nextLong();

                int n = fulano.size();
                for (int i=0; i<n; i++){
                    if (fulano.get(i).getCpf()==cpf)
                        System.out.println("usuario ja existe");
                    else{
                        Pessoa pessoa = new Pessoa(nome, cpf);
                        fulano.add(pessoa);
                        System.out.println("Pessoa criada");
                    }



                }
            }
            if (s=='n')// criar nova conta
            {
                System.out.println("Digite o numero da conta: ");
                long numero=src.nextLong();
            }
            else {
                System.out.println("opção  invalida");
            }
        }
    }
}