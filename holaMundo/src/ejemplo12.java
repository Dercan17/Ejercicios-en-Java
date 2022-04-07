import javax.swing.*;

public class ejemplo12 {
    public static void main(String[] args) {
        String n1;
        String n2;
        String n3;

        n1= JOptionPane.showInputDialog("Ingrese el nombre numero 1");
        n2=JOptionPane.showInputDialog("Ingrese el nombre numero 2");
        n3=JOptionPane.showInputDialog("Ingrese el nombre numero 1");

        String[] nom1 = n1.split(" ");
        String[] nom2 = n2.split(" ");
        String[] nom3 = n3.split(" ");

        String max = (nom1[0].length() > nom2[0].length())? nom1[0]:nom2[0];
        max = (max.length() > nom3[0].length())? max:nom3[0];

        JOptionPane.showMessageDialog(null, max + " es el nombre mas largo");
    }
}


