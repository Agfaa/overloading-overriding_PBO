/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

import java.util.Scanner;

public class Overriding {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pil;
        System.out.println("Program Overriding Anggota IPSI");
        IPSI ip = new IPSI ("Wongsonegoro","Surakarta", 1948);
        ip.cetak();
        System.out.println("berikut daftar anggota IPSI");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Perguruan Pencak Silat : ");
        System.out.println("1. Tapak Suci Putra Muhammadiyah");
        System.out.println("2. Persaudaraan Setia Hati Teratai");
        System.out.println("3. Perisai Diri");
        System.out.println("silakan pilih : ");
        pil = input.nextInt();
        
        switch (pil){
        case 1 : 
        Tapaksuci ts = new Tapaksuci ("Barrie Irsyad","Yogyakarta", 1963);
        ts.cetak();
        break;
        
        case 2 :
        PSHT ht = new PSHT ("Ki Hadjar Hardjo Oetomo","Madiun", 1922);
        ht.cetak();
        break;
        
        case 3 :
        PerisaiDiri pd = new PerisaiDiri ("R. M. Soebandiman Dirdjoatmodjo","Surabaya", 1983);
        pd.cetak();
        break;
        
        default :
                System.out.println("Menu yang anda pilih salah, silahkan coba lagi");
        }
        
       input.close();
    
}
}
