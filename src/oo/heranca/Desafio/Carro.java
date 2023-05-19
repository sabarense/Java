package oo.heranca.Desafio;
public class Carro {

    int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;
    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            VELOCIDADE_MAXIMA = velocidadeAtual;
        }
        velocidadeAtual += delta;
    }
    void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
    public String toString(){
        return "Velocidade atual = " + velocidadeAtual + "Km/h.";
    }
}
