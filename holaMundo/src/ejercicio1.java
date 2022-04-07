import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        /* Desarrollar un programa que le permita a una persona jugar a piedra papel tijera contra el computador.
           Las jugadas se deben manejar por números de la siguiente manera:
           0: Piedra, 1: Papel, 2: Tijera
           El usuario ingresa su jugada por teclado, para las jugadas del computador, el sistema debe generar
           un número aleatorio de 0 a 2.
           El juego se compone de 3 ronda el ganador del juego es el que haya ganado más rondas.
                    Reglas de Juego
                        Piedra gana a Tijera
                            Papel gana a piedra
                                Tijera gana a papel
            Si la jugada del computador y la persona es la misma, hay empate.
            El sistema comienza pidiéndole al usuario que ingrese por teclado un alias y el correo electrónico. Estos
            datos se le piden una sola vez.
            Después, se le solicita al usuario que ingrese la jugada. El sistema debe imprimir en texto la jugada del
            jugador y del computador en cada turno, en caso que haya empate, se debe mostrar un mensaje.
            Al finalizar las rondas, se muestra quien fue el ganador total del juego y el número de aciertos (rondas
            ganadas) */

        Scanner s = new Scanner(System.in);

        int puntosMaquina = 0;
        int puntosJugador = 0;
        int opcionJugador = 0;
        int opcionMaquina = 0;

        System.out.println("==========BIENVENIDO A PIEDRA PAPEL O TIJERA==========");
        System.out.println("ingrese su apodo");
        String apodo = s.nextLine();

        System.out.println("ingrese su correo");
        String correo = s.nextLine();




        for (int i = 0; i <= 3; i++) {



            System.out.println("por favor seleccione una opcion: ");
            System.out.println("0 = piedra, 1 = papel, 2 = tijera");
            opcionJugador = s.nextInt();


            if (opcionJugador == 0) {
                System.out.println("el jugador escogio piedra");
            } else if (opcionJugador == 1) {
                System.out.println("el jugador escogio papel");
            } else if (opcionJugador == 2) {
                System.out.println("el jugadorescogio tijera");
            }

            if (opcionMaquina == 0) {
                System.out.println("La maquina escogio piedra");
            } else if (opcionMaquina == 1) {
                System.out.println("La maquina escogio papel");
            } else if (opcionMaquina == 2) {
                System.out.println("La maquina escogio tijera");
            }


            if (opcionMaquina == 0 && opcionJugador == 1) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opcionMaquina == 1 && opcionJugador == 0) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");
            }  else if (opcionMaquina == 0 && opcionJugador == 2) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");

            } else if (opcionMaquina == 2 && opcionJugador == 0) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opcionMaquina == 1 && opcionJugador == 2) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opcionMaquina == 2 && opcionJugador == 1) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");

            }else if(opcionMaquina == 1 && opcionJugador == 1){
                System.out.println("EMPATE");
            }else if(opcionMaquina==2 && opcionJugador==2){
                System.out.println("EMPATE");
            }else if (puntosMaquina == 0 && puntosJugador == 0) {
                System.out.println("EMPATE");
            }
            System.out.println("__________________________________________");

        }


        if(puntosJugador == puntosMaquina){
            System.out.println("ES UN EMPATE");
        }else if(puntosMaquina > puntosJugador){
            System.out.println("el ganador es la maquina con "+puntosMaquina+" puntos");
        }else{
            System.out.println( "el ganador es: "+apodo+" con "+puntosJugador+" puntos");
        }




    }

}
