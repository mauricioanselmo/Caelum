class TestaConta{
    public static void main(String[]args){
        Conta contaNiko = new Conta();
        contaNiko.titular = "Nikolai";
        contaNiko.numero = 104;
        contaNiko.saldo = 5000.5;

        Conta contaJef = new Conta();
        contaJef.titular = "Jeferson";
        contaJef.numero = 568;
        contaJef.saldo = 3000;

        Conta c1 = new Conta();
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "04/06/2017";

        c1.deposita(100.0);
        System.out.println("Saldo Atual " + c1.saldo);
        System.out.println("rendimento mensal " + c1.calculaRendimento());

        Cliente joao = new Cliente();
        joao.nome = "joao";
        joao.cpf = "200567";

        Conta contaJoao = new Conta();
        contaJoao.saldo = 600;
        contaJoao.titular = joao;
        


        /* if(contaNiko == contaJef){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

        contaNiko.saldo = contaJef.saldo;
*/
        //contaNiko = contaJef;
        contaJef.titular = "Silva";
        System.out.println("Saldo conta Niko " + contaNiko.saldo);
        contaNiko.deposita(400);
        System.out.println("Saldo conta Niko " + contaNiko.saldo);
        System.out.println(contaNiko.titular);
        System.out.println("Saldo conta Niko " + contaNiko.saldo);
        System.out.println("Saldo conta Jefferson " + contaJef.saldo);

        boolean sacou = contaNiko.saca(20000);
        if(sacou){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saldo Insuficiente");
        }
        System.out.println("Saldo conta Niko " + contaNiko.saldo);
    }
}
