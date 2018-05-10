class Programa{
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        Conta novaConta = new Conta("Mau");
        Cliente c = new Cliente();


        minhaConta.setTitular("Maurício");
        System.out.println(minhaConta.getTitular());
        System.out.println(minhaConta.getSaldo());

        minhaConta.deposita(500);
        if (minhaConta.saca(1200)){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saldo Insuficiente");
        };
        System.out.println(minhaConta.getSaldo());
        System.out.println(novaConta.getSaldo());
        System.out.println(novaConta.getTitular());

        minhaConta.transfere(novaConta, 50);
        System.out.println(minhaConta.getSaldo());
        System.out.println(novaConta.getSaldo());

    }
}
