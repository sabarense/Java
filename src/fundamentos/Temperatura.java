package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

         final double MULTIPLICACAO = 5.0/9.0;
         final double AJUSTE = 32.0;

         final double FAHRENHEIT = 86.0;

         double conversaoGrausCelsius = (FAHRENHEIT - AJUSTE) * MULTIPLICACAO;

       System.out.println("O resultado da conversão é " + conversaoGrausCelsius + "°C.");
    }
}
