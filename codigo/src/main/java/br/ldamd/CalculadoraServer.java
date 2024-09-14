package br.ldamd;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
    public CalculadoraServer(){
        try {
            // System.setProperty("java.rmi.server.hostname", "192.168.1.1"); Definindo hotname manualmente
            ICalculadora c = new Calculadora();
            LocateRegistry.createRegistry(1099); // Definindo porta
            Naming.rebind("rmi://localhost/CalculadoraService", c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new CalculadoraServer();
        System.out.println("Calculadora em Execução...");
    }
}
