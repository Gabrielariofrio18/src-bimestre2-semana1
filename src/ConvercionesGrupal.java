package tarea;

import java.util.Scanner;

public class ConvercionesGrupal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1= teclado.nextInt();
        int numero_conversion= 1024;
        int interruptor =1;
        if (interruptor==1){
            System.out.println("Digite opcion1 para convertir valor de MB a KB: ");
            System.out.println("Digite opcion2 para convertir valor de KB a MB: ");
            System.out.println("Digite opcion3 para convertir valor de MB a bits: ");
            System.out.println("Digite opcion4 para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Opcion 1");
                    double a=n1*numero_conversion;
                    System.out.println("El valor de MB a KB es: "+a+"KB");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    double b=(n1/numero_conversion);
                    System. out. println("La división es: "+b);
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    double c=n1*numero_conversion*numero_conversion*8;
                    System.out.println("El valor de MB a bits es: "+c+"bits");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    System.out.println("Salir");
                    interruptor=0;
                    break;
                default:
                    System.out.println("Es incorrecta");
            }

        }
    }
}