public class Principal {

    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano de Tal", 12345678);
        fulano.setEndereco("Rua BlaBLaBla, numero tal");

        Agencia agencia = new Agencia();;
        ContaCorrente minhaConta = new ContaCorrente(1, fulano, agencia);
        ContaCorrente minhaConta2 = new ContaCorrente(2, fulano, agencia);
        System.out.println("saldo: ");
        System.out.println(minhaConta.getSaldoEmReais());
        // deposito de 5k
        minhaConta.depositar(5000);
        System.out.println("Deposito: ");
        System.out.println("Saldo"+ minhaConta.getSaldoEmReais());
        System.out.println("saldo: ");

        System.out.println(minhaConta.getSaldoEmReais());


        boolean o = minhaConta.GetSaque(2000);
        if (o==true)
            System.out.println("Saque efetuado de 2k!");
        else
            System.out.println("Saldo insuficiente");
        System.out.println("saldo: ");
        System.out.println(minhaConta.getSaldoEmReais());
        // tansferencia
        boolean a = minhaConta.transferir(200,  minhaConta2);
        if (a == false){
            System.out.println("O valor da tansferencia é insuficiente");
            System.out.println("saldo" +minhaConta.getSaldoEmReais());
        }
        else
            System.out.println("seu saldo é: " + minhaConta.getSaldoEmReais());

        System.out.println(fulano);
    }
}