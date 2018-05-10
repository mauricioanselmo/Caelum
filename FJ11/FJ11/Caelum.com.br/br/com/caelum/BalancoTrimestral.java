package br.com.caelum;


class BalancoTrimestral{
    public static void main(String[]args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
    double mediaMensal = gastoTrimestral /3;
    System.out.println("Gasto do trimestre "+ gastoTrimestral);
    System.out.println("Média de gastos "+ mediaMensal);
    }

}
