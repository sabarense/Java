package oo.heranca.Desafio;
public class Carro {

    int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            VELOCIDADE_MAXIMA = velocidadeAtual;
        }
        velocidadeAtual += getDelta();
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
