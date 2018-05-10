public class Conta{
    int numero;
    private double saldo;
    Cliente titular = new Cliente();
/*    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular.nome = titular;
    }
*/
    public double getSaldo(){
        return this.saldo;
    }
    boolean saca(double valor){
        if (this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    void deposita(double valor){
        this.saldo += valor;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (retirou == false){
            //não deu pra sacar
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }
    public Conta(String string){

    }

    String recuperaDadosParaImpressao(){
        String dados = "titular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        //imprima aqui os atributos...
        //também pode imprimir  this.calculaRendimentos()
        return dados;
    }
/*    public Conta(String titular){
        this.titular = titular;
    }*/
}
