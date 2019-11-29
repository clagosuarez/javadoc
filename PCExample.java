/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *  Main class PCExample
 * @author clagosuarez
 */
public class PCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type: ");
        String type = sc.nextLine();
        System.out.println("Mark: ");
        String brand = sc.nextLine();
        System.out.println("Inches: ");
        float inches = sc.nextFloat();
        System.out.println("Speed: ");
        int speed = sc.nextInt();
        System.out.println("Memory: ");
        int memory = sc.nextInt();
        
        PC asus = new PC(new Mouse(type), new Screen(brand, inches), new Cpu(speed, memory));
        // asus.amosar();
        System.out.println(asus);
    }
    
}
