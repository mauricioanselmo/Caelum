class Conta{
    String titular;
    double saldo;
    int numero;
    String agencia;
    String dataDeAbertura;

    void deposita(double valor){
        saldo += valor;
    }

    boolean saca(double valor){
        if(saldo >= valor){
        saldo -= valor;
        return true;
    }else{
        return false;
        }
    }
    double calculaRendimento(){
        return this.saldo*0.1;
    }
}
