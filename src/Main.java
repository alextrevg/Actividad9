import java.util.Scanner;


public class Main {

    public static void main(String[]args){
        boolean salir = false;
    do {
        System.out.println( "\nBienvenidos a Poker!");
        System.out.println("Selecciona una opción");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");

        Deck dck = new Deck();
        dck.deck();
        final int numero = dck.numero;


        if(numero == 0){
            salir = true;
        }

    }while(!salir);


    }




}
