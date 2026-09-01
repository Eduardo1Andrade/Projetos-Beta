package net.edu;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema Inicializado!"); // BOot do sistema

        Estacao e1 = new Estacao(); // declaração de objeto estaçãp
        e1.nome = "Raimundo Neto";
        e1.tarifa = 15;
        e1.bibicletaDisponivel = 30;
        
        Pessoa p1 = new Pessoa(); //declaração de objeto pessoa: não sei ser era pra fazer.


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de sua matricula: "); //Input
        p1.matricula = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o tempo estimado: "); //Input
        p1.tempoEstimado = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o seu destino: "); //Input
        p1.destino = leitor.nextLine();

        leitor.close(); // fechar o scanner.

        System.out.println("---RECIBO----");
        System.out.println("matricula = " + p1.matricula + ", Estação =" + p1.destino + ", tempo estimado =" + p1.tempoEstimado);
        System.out.println("gasto estimado = " + String.format("%.2f" ,p1.tempoEstimado * e1.tarifa) + "R$");
    }
}