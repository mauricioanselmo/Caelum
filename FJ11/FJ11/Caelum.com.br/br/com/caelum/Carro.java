class Carro{
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    //liga o Carro
    void liga(){
        System.out.println("O carro foi ligado!");
    }

    //acelera uma certa quantidade
    void acelera(double quantidade){
        this.velocidadeAtual += quantidade;
    }

    //devolve a marcha
    int pegaMarcha(){
        if(this.velocidadeAtual < 0){
            return -1;
        }
        if (this.velocidadeAtual < 40){
            return 1;
        }
        if (this.velocidadeAtual < 80){
            return 2;
        }
    return 3;
    }
}
