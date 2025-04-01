package teste;

import java.util.Scanner;

public class TestaOlaMundo {
    public static void main(String[] args) {
        //<nome classe> <nome do objeto> new <nome classe>//
        OlaMundo xyz = new OlaMundo();
        xyz.imprimirDados();
        xyz.imprimir("Lucas", 43);

        String nome;

        Scanner leDados = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = leDados.nextLine();

        System.out.print("Digite sua idade: ");
        int valor = leDados.nextInt();

        xyz.imprimir(nome, valor);

    }
}
