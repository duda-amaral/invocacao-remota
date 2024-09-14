package br.ldamd;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {

    // Operações Aritméticas Básicas
    double somar(double num1, double num2) throws RemoteException;
    double subtrair(double num1, double num2) throws RemoteException;
    double multiplicar(double num1, double num2) throws RemoteException;
    double dividir(double num1, double num2) throws RemoteException;

    // Operações Aritméticas Avançadas
    double exponenciacao(double base, double expoente) throws RemoteException;
    double radiciacao(double num, double indice) throws RemoteException;
    double modulo(double num1, double num2) throws RemoteException;

    // Operações Lógicas e Comparativas
    boolean maior(double num1, double num2) throws RemoteException;
    boolean menor(double num1, double num2) throws RemoteException;
    boolean igual(double num1, double num2) throws RemoteException;
    boolean diferente(double num1, double num2) throws RemoteException;

    // Outras Operações Matemáticas
    double minimo(double num1, double num2) throws RemoteException;
    double maximo(double num1, double num2) throws RemoteException;

    // Operações de Cálculo de Juros
    double jurosSimples(double capital, double taxa, double tempo) throws RemoteException;
    double jurosComposto(double capital, double taxa, double tempo) throws RemoteException;
    double calcularTaxaDeJuros(double juros, double capital, double tempo) throws RemoteException;

    // Operações para Amortização e Financiamentos
    double parcelaSistemaPrice(double capital, double taxa, double tempo) throws RemoteException;
    double amortizacaoSAC(double capital, double tempo) throws RemoteException;
}
