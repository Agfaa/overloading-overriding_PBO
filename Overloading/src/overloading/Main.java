/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int cho, num1, num2, num3, scal;
        System.out.println("Program Overloading PBO D081");
        System.out.println("Agfanadita Rezkia Chaurina");
        System.out.println("       ~21081010138~");
        System.out.println("=============================");
        System.out.println("Menu : ");
        System.out.println("1. Perkalian Vektor Dengan Skalar");
        System.out.println("2. Perkalian Vektor Dengan Vektor");
        System.out.println("3. Keluar Program");
        System.out.print("Masukkan Pilihan : ");
        cho = input.nextInt();

        switch (cho) {
            case 1 :
                System.out.println("Perkalian Vektor dengan Skalar");
                System.out.println("------------------------------");
                System.out.print("Input Bilangan Vektor 1 : ");
                num1 = input.nextInt();
                System.out.print("Input Bilangan Vektor 2 : ");
                num2 = input.nextInt();
                System.out.print("Input Bilangan Vektor 3 : ");
                num3 = input.nextInt();
                vector vector1 = new vector(num1, num2, num3);
                System.out.print("Vektor Yang di Input : ");
                vector1.display();

                System.out.print("Input Nilai Skalar : ");
                scal = input.nextInt();
                System.out.print("Hasil : ");
                vector1.increase(scal).display();
                break;
            
            case 2 :
                System.out.println("Perkalian Vektor dengan Vektor");
                System.out.println("------------------------------");
                System.out.print("Input Bilangan Vektor 1 : ");
                num1 = input.nextInt();
                System.out.print("Input Bilangan Vektor 2 : ");
                num2 = input.nextInt();
                System.out.print("Input Bilangan Vektor 3 : ");
                num3 = input.nextInt();
                vector vector2 = new vector(num1, num2, num3);
                System.out.print("Vektor Yang di Input : ");
                vector2.display();

                System.out.println("\nHasil : "+vector2.increase(vector2));
                break;
                
            case 3 :
                System.out.println("Program Berakhir");
                System.exit(0);
                break;
            
            default :
                System.out.println("Menu yang anda pilih salah, silahkan coba lagi");
        }
        input.close();
    }
    
}