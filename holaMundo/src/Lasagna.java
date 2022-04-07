
import java.util.Scanner;

public class Lasagna {


    public static void main(String[] args) {


        Lasagna lasagna1 = new Lasagna();
       int tiempoEsperado = lasagna1.tiempoEsperadoEnELHorno();
       int tiempoQueLleva = lasagna1.tiempoQueLlevaEnElHorno();
       int tiempoQueFalta = tiempoEsperado - tiempoQueLleva ;
       int totalMinutosPreparando = lasagna1.tiempoDePreparacion();
       int tiempoTotalEnMinutos = lasagna1.tiempoTotalEnMinutos(totalMinutosPreparando,tiempoQueLleva);


        System.out.println("el tiempo que le falta en el horno es: "+tiempoQueFalta+" minutos");
        System.out.println("_____________________");
        System.out.println("Usted se demoro "+totalMinutosPreparando+" minutos preparando la lasaña");
        System.out.println("_____________________");
        System.out.println("El tiempo total empleado para tener lista la lasagna es de "+tiempoTotalEnMinutos+" minutos");

    }

    public static int tiempoDePreparacion() {
        Scanner s = new Scanner(System.in);

        System.out.println("Cuantas capas agrego");
        int capas = s.nextInt();

        int totalMinutosPreparando = capas * 2;
        return totalMinutosPreparando;

    }

    public static int tiempoTotalEnMinutos(int capas,int tiempoQueLleva){

    int tiempoTotalEmpleado = capas + tiempoQueLleva;
    return tiempoTotalEmpleado;
    }
    public static int tiempoEsperadoEnELHorno(){
        int tiempoEsperado = 40;
        return tiempoEsperado;
    }

    public static int tiempoQueLlevaEnElHorno(){

        int tiempoQueLleva = 30 ;
        return tiempoQueLleva;
    }
}
