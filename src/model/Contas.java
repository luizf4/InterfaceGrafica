package model;

/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 ADS - EAD SOROCABA
 */

public class Contas {

    private double num1;
    private double num2;

    public Contas() {

        this(0, 0);

    }

    public Contas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String soma() {

        return "A soma é: " + (getNum1() + getNum2());
    }

    public String subtracao() {

        return "A subtração é : " + (getNum1() - getNum2());

    }

    public String multiplicacao() {

        return "A multiplicação é: " + (getNum1() * getNum2());

    }

    public String divisao() {

        if (getNum2() != 0) {

            return "A divisão e´: " + (getNum1() / getNum2());

        } else {

            return "Não é possível divisão por 0!";
        }

    }

}
