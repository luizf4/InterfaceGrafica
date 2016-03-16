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

        return Double.toString(getNum1() + getNum2());
    }

    public String subtracao() {

        return Double.toString(getNum1() - getNum2());

    }

    public String multiplicacao() {

        return Double.toString(getNum1() * getNum2());

    }

    public String divisao() {

        if (getNum2() != 0) {

            return Double.toString(getNum1() / getNum2());

        } else {

            return "Impossivel por 0";
        }

    }

}
