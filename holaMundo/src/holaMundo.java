import java.util.Scanner;
public class holaMundo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el nombre de la factura o la descripcion");
        String nombreFactura = scanner.nextLine();

        System.out.println("ingrese el precio del primer producto");
        Double producto1 = scanner.nextDouble();

        System.out.println("ingrese el precio del segundo producto");
        Double producto2 = scanner.nextDouble();


        Double totalBruto = producto1 + producto2;
        Double impuesto= totalBruto * 0.19;
        Double total = totalBruto + impuesto;

        System.out.println("La factura: "+ nombreFactura +" tiene un total bruto de: "+totalBruto+" , con un impuesto de: "+impuesto+" y el total incluido impuesto es de: "+total);


    }
}
