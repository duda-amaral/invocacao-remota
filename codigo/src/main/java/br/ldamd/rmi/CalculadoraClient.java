package br.ldamd.rmi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;

public class CalculadoraClient {
    public static void main(String[] args) {
            String servidor = "rmi://localhost:1099/";
            String nome = "CalculadoraService";
            DecimalFormat df = new DecimalFormat("#.##");


        try(FileWriter writer = new FileWriter("execucao_calculadora_rmi.txt", true)) {
                long inicio = System.currentTimeMillis();
                ICalculadora calc = (ICalculadora) Naming.lookup(servidor + nome);

                // Testa as operações aritméticas básicas
                System.out.println("Soma: 10 + 5 = " + df.format(calc.somar(10, 5)));
                System.out.println("Subtração: 10 - 5 = " + df.format(calc.subtrair(10, 5)));
                System.out.println("Multiplicação: 10 * 5 = " + df.format(calc.multiplicar(10, 5)));
                System.out.println("Divisão: 10 / 5 = " + df.format(calc.dividir(10, 5)));

                // Testa as operações aritméticas avançadas
                System.out.println("Exponenciação: 2^3 = " + df.format(calc.exponenciacao(2, 3)));
                System.out.println("Radiciação: Raiz cúbica de 8 = " + df.format(calc.radiciacao(8, 3)));
                System.out.println("Módulo: 10 % 3 = " + df.format(calc.modulo(10, 3)));

                // Testa as operações lógicas e comparativas
                System.out.println("Maior: 10 > 5? " + calc.maior(10, 5));
                System.out.println("Menor: 10 < 5? " + calc.menor(10, 5));
                System.out.println("Igualdade: 10 == 5? " + calc.igual(10, 5));
                System.out.println("Diferença: 10 != 5? " + calc.diferente(10, 5));

                // Testa outras operações matemáticas
                System.out.println("Mínimo entre 10 e 5: " + calc.minimo(10, 5));
                System.out.println("Máximo entre 10 e 5: " + calc.maximo(10, 5));

                // Testa operações de cálculo de juros
                System.out.println("Juros Simples (capital=1000, taxa=0.05, tempo=2): " + df.format(calc.jurosSimples(1000, 0.05, 2)));
                System.out.println("Juros Compostos (capital=1000, taxa=0.05, tempo=2): " + df.format(calc.jurosComposto(1000, 0.05, 2)));
                System.out.println("Cálculo de Taxa de Juros (juros=100, capital=1000, tempo=2): " + df.format(calc.calcularTaxaDeJuros(100, 1000, 2)));

                // Testa operações para amortização e financiamentos
                System.out.println("Parcela Sistema Price (capital=1000, taxa=0.05, tempo=12): " + df.format(calc.parcelaSistemaPrice(1000, 0.05, 12)));
                System.out.println("Amortização SAC (capital=1000, tempo=12): " + df.format(calc.amortizacaoSAC(1000, 12)));

            long fim = System.currentTimeMillis(); // Fim do tempo
            long tempoExecucao = fim - inicio;
            writer.write("Tempo de execução: " + tempoExecucao + " ms\n");
            System.out.println("Tempo de execução salvo em execucao_calculadora_rmi.txt");

        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o tempo de execução.");
            e.printStackTrace();
        }
    }
}
