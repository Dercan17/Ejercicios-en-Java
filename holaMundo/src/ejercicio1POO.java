import java.util.Random;
import java.util.Scanner;

public class ejercicio1POO {
    public static void main(String[] args) {


        int opJugador[] = new int[3];
        int opMaquina[] = new int[3];
        String mensaje = "";
        Scanner s = new Scanner(System.in);
        System.out.println("================== BIENVENIDO A PIEDRA, PAPEL O TIJERA ===================");

        System.out.println("ingrese su apodo");
        String apodo = s.nextLine();

        System.out.println("ingrese su correo");
        String correo = s.nextLine();




             opJugador = optJugador();
             opMaquina = optMaquina();
            mensaje = validation(opJugador, opMaquina, apodo);


        System.out.println(mensaje);


    }


    public static int[] optJugador() {

        int[] opJugador = new int[3];


            for(int i = 0; i < 3;i++){
            Scanner s = new Scanner(System.in);
            System.out.println("por favor seleccione una opcion: ");
            System.out.println("0 = piedra, 1 = papel, 2 = tijera");
            int opcion = s.nextInt();
            opJugador[i] = opcion;

            }
        return opJugador;



    }

    public static int[] optMaquina() {
        int opMaquina[] = new int[3];

        for (int i = 0; i < 2;i++) {
            Random ram = new Random();
            opMaquina[i] =  ram.nextInt(0, 3);

        }
        return opMaquina;
    }

    public static String validation(int[] opJugador, int[] opMaquina, String apodo) {
        int puntosMaquina = 0;
        int puntosJugador = 0;
        String mensaje = "";
        for (int i = 0; i < 3; i++) {


            if (opJugador[i] == 0) {
                System.out.println("el jugador escogio piedra");
            } else if (opJugador[i] == 1) {
                System.out.println("el jugador escogio papel");
            } else if (opJugador[i] == 2) {
                System.out.println("el jugador escogio tijera");
            }


            if (opMaquina[i]== 0) {
                System.out.println("La maquina escogio piedra");
            } else if (opMaquina[i] == 1) {
                System.out.println("La maquina escogio papel");
            } else if (opMaquina[i] == 2) {
                System.out.println("La maquina escogio tijera");
            }


            if (opMaquina[i] == 0 && opJugador[i] == 1) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opMaquina[i] == 1 && opJugador[i] == 0) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");
            } else if (opMaquina[i] == 0 && opJugador[i] == 2) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");

            } else if (opMaquina[i] == 2 && opJugador[i] == 0) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opMaquina[i] == 1 && opJugador[i] == 2) {
                puntosJugador += 1;
                System.out.println("punto para jugador");
            } else if (opMaquina[i] == 2 && opJugador[i] == 1) {
                puntosMaquina += 1;
                System.out.println("punto para maquina");

            } else if (opMaquina[i] == 1 && opJugador[i] == 1) {
                System.out.println("EMPATE");
            } else if (opMaquina[i] == 2 && opJugador[i] == 2) {
                System.out.println("EMPATE");
            } else if (opMaquina[i] == 0 && opJugador[i] == 0) {
                System.out.println("EMPATE");
            }
            System.out.println("__________________________________________");

        }

        if (puntosJugador == puntosMaquina) {
            return mensaje = "ES UN EMPATE";
        } else if (puntosMaquina > puntosJugador) {
            return mensaje = "el ganador es la maquina con " + puntosMaquina + " puntos";
        } else {
            return mensaje = "el ganador es: " + apodo + " con " + puntosJugador + " puntos";
        }


    }}
