package tarea;

import java.util.Scanner;

public class AbundanteClase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR SI UN NUMERO ES ABUNDANTE");
        int n2= 0;
        int acomulador= 0;
        int contador = 1;
        System.out.println("ingrese un numero: ");
        int numero = teclado.nextInt();
        while (numero>contador){
            n2=n2+1;
            if(numero%n2==0){
                acomulador=acomulador+n2;
            }
            contador=contador+1;
        }
        if (numero<acomulador){
            System.out.println("Es un numero Abundante: "+acomulador);
        }else{
            System.out.println("No es un numero abundante: "+acomulador);
        }
    }
}