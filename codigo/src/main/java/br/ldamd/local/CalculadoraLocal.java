package br.ldamd.local;

import java.rmi.RemoteException;

public class CalculadoraLocal {

    public double somar(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) throws RemoteException {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws RemoteException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return num1 / num2;
    }

    public double exponenciacao(double base, double expoente) throws RemoteException {
        return Math.pow(base, expoente);
    }

    public double radiciacao(double num, double indice) throws RemoteException {
        if (indice <= 0) {
            throw new ArithmeticException("Índice da raiz deve ser maior que zero.");
        }

        return Math.pow(num, 1 / indice);
    }

    public double modulo(double num1, double num2) throws RemoteException {
        return num1 % num2;
    }

    public boolean maior(double num1, double num2) throws RemoteException {
        return num1 > num2;
    }

    public boolean menor(double num1, double num2) throws RemoteException {
        return num1 < num2;
    }

    public boolean igual(double num1, double num2) throws RemoteException {
        return num1 == num2;
    }

    public boolean diferente(double num1, double num2) throws RemoteException {
        return num1 != num2;
    }

    public double minimo(double num1, double num2) throws RemoteException {
        return Math.min(num1, num2);
    }

    public double maximo(double num1, double num2) throws RemoteException {
        return Math.max(num1, num2);
    }

    public double jurosSimples(double capital, double taxa, double tempo) throws RemoteException {
        return capital * taxa * tempo;
    }

    public double jurosComposto(double capital, double taxa, double tempo) throws RemoteException {
        return capital * Math.pow((1 + taxa), tempo);
    }

    public double calcularTaxaDeJuros(double juros, double capital, double tempo) throws RemoteException {
        if (capital == 0 || tempo == 0) {
            throw new ArithmeticException("Capital e tempo devem ser maiores que zero.");
        }
        return juros / (capital * tempo);
    }

    public double parcelaSistemaPrice(double capital, double taxa, double tempo) throws RemoteException {
        if (taxa == 0 || tempo == 0) {
            throw new ArithmeticException("Taxa e tempo devem ser maiores que zero.");
        }
        return capital * (taxa * Math.pow(1 + taxa, tempo)) / (Math.pow(1 + taxa, tempo) - 1);
    }

    public double amortizacaoSAC(double capital, double tempo) throws RemoteException {
        if (tempo == 0) {
            throw new ArithmeticException("Tempo deve ser maior que zero.");
        }
        return capital / tempo;
    }
}
