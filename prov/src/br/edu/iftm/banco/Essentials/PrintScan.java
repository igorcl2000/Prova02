package br.edu.iftm.banco.Essentials;
import java.util.Scanner;

/**
 * PrintScan
 */
public class PrintScan {

    public static Scanner leitor = new Scanner(System.in);

    public static int getInt(String texto) {
        
        System.out.println(texto);
        return Integer.parseInt(PrintScan.leitor.nextLine());

    }

    public static String getString(String texto) {
        
        System.out.println(texto);
        return PrintScan.leitor.nextLine();
        
    }

    public static Float getFloat(String texto) {
        
        System.out.println(texto);
        return Float.parseFloat(PrintScan.leitor.nextLine());
        
    }

    public static Double getDouble(String texto) {
        
        System.out.println(texto);
        return Double.parseDouble(PrintScan.leitor.nextLine());
        
    }
}