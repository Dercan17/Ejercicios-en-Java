import java.util.Scanner;
public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombre = new String[5];
        Double[] sueldo = new Double[5];
        double mayorSueldo = 0;
        String nombreMayor = "";
        int i = 0;
        System.out.println("ingrese el nombre de la persona # "+(i+1 ));
        nombre[i] = sc.nextLine();

        System.out.println("Sueldo ");
        sueldo[i] = sc.nextDouble();

        mayorSueldo = sueldo[i];
        nombreMayor = nombre[i];

    for(i = 1; i < nombre.length; i++){
        sc.nextLine();
        System.out.println("ingrese el nombre de la persona # "+(i+1 ));
        nombre[i] = sc.nextLine();


        System.out.println("Sueldo " );
        sueldo[i] = sc.nextDouble();




        if(sueldo[i] > mayorSueldo){
            mayorSueldo = sueldo[i];
            nombreMayor = nombre[i];
       }
    }
        System.out.println("El empleado con un sueldo mayor es:");
        System.out.println(nombreMayor+" con un sueldo de: "+mayorSueldo);

        System.out.println("Todos los empleados");
        for(int j = 0; j < nombre.length;j++){
        System.out.println("nombre: "+nombre[j]);
        System.out.println("Sueldo: "+sueldo[j]);
            System.out.println("______________________");

    }

  }
}
