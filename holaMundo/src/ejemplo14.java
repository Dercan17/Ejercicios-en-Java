import java.sql.SQLOutput;
import java.util.Scanner;

public class ejemplo14 {
    public static void main(String[] args) {
        /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
         Mostrar el promedio de las notas mayores a 5,
        promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
         los cálculos (contadores, sumas).
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error
        finalizando el programa.
        */
        Scanner sc = new Scanner(System.in);
        Double contador1 = 0.0;
        Double contador2 = 0.0;
        Double contador4 = 0.0;

        int j=0,k=0,r=0;
        int n=0;
        Double nota= 0.0;
        Double[] ok = new Double[20];


        for (int i = 0; i < 20;i++){
            System.out.println("Ingrese la nota: "+(i+1));
             nota = sc.nextDouble();
             ok[i] = nota;
            contador4 = contador4 + nota;

            n = (nota==1)? j+=1:n+0;
            ok[i] = nota;

            if (nota == 0){

                break;
            }else if(nota > 7.1){

                break;
            }else if(nota >= 5.0 && nota <= 7.0){
                contador1 = contador1 + nota;
                 k+=1;
            }else if(nota<=4.0){
                contador2 = contador2 + nota;
                r+=1;
            }

        }


        
        if(nota == 0.0 || nota >= 7.1){

            System.out.println("INGRESASTE UNA NOTA INVALIDA!!!!");
        }else {
                Double promedioSup = contador1 / k;
                Double promedioInf = contador2 / r;
                Double promedioTotal = contador4 / 20;


               for (int i = 0; i < ok.length; i++){
                   System.out.print("{"+ok[i]+"}");
               }
                System.out.println("");
                System.out.println("El promedio de los notas mayores o iguales a 5 es: " + promedioSup);
                System.out.println("El promedio de las notas iguales o inferiores a 4 es: " + promedioInf);
                System.out.println("el promedio de todas las notas ingresadas es: " + promedioTotal);
                System.out.println("El numero de notas ingresadas que son igual a 1 es: " + n);
            }
        }
}
