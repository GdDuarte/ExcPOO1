import entities.Retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os valores de largura e altura de um retângulo.
        Em seguida, mostar na tela o valor de sua área, perímetro e diagonal.
        */
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();
        System.out.println("Enter rectangle width and height: ");

        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n" , retangle.area());
        System.out.printf("PERIMETER = %.2f%n" , retangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n" , retangle.diagonal());




    }
}
