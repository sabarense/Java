package oo.heranca;
public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(0,0);

        Heroi heroi = new Heroi(2,5);

        System.out.println("Monstro tem: " + monstro.vida + " pts de vida.");
        System.out.println("Heroi tem: " + heroi.vida + " pts de vida.");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);



        System.out.println("Monstro tem: " + monstro.vida + " pts de vida.");
        System.out.println("Heroi tem: " + heroi.vida + " pts de vida.");

    }
}
