/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mteste;

/**
 *
 * @author jairb
 */
public class Calculadora {

    public double mult(double v1, double v2) {
        return v1 * v2;
    }

    public Double soma(double v1, double v2) {
        return v1 + v2;
    }

    public Double sub(double v1, double v2) {
        return v1 - v2;
    }

    public Double div(double v1, double v2) {
        return v1 / v2;
    }

    public Boolean numPar(int n) {
        return n % 2 == 0;
    }

    public int areaQ(int lado) {
        return lado * lado;
    }

    public int raiz(int radicando, int indice) {
//        double i = (double) 1 / indice;
        return (int) Math.pow(radicando, (double) 1 / indice);
    }

    public int exp(int v, int exp) {
        return (int) Math.pow((double) v, (double) exp);
    }
}
