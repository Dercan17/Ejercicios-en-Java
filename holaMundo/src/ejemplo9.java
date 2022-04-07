import java.sql.SQLOutput;
import java.util.Scanner;
public class ejemplo9 {
    public static void main(String[] args) {

        /*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual
         en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
         La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión,
         pero tambien puede ser del tipo int.
         Si la capacidad actual es 70 litros: imprimir Estanque lleno
         Si está entre 60 y menor a 70: imprimir Estanque casi lleno
         Si está entre 40 y menor a 60: imprimir Estanque  3/4
         Si está entre 35 y menor a 40: imprimir Medio Estanque
         Si está entre 20 y menor a 35: imprimir Suficiente
         Si está entre 1 y menor a 20: imprimir Insuficiente*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la medida actual de su tanque de gasolina ");
        Double medida = s.nextDouble();

         if(medida >= 70.1 || medida <= 0.9) {
             System.out.println("Medida invalida");
         } else if(medida == 70.0){

            System.out.println("Tanque lleno");
        }else if(medida >= 60.0 && medida < 70.0){

            System.out.println("Tanque casi lleno");
        }else if(medida >= 40.0 && medida <= 59.9){
            System.out.println("Tanque 3/4");
        }else if(medida >= 35.0 && medida <= 40.0){
            System.out.println("medio tanque");
        }else if(medida >= 20.0 && medida <= 34.9){
            System.out.println("suficiente");
        }else if(medida >= 1.0 && medida <= 20.0 ){
            System.out.println("insuficiente");

        }

    }
}
