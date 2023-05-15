/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author ASUS
 */
public class PerisaiDiri extends IPSI {
    public PerisaiDiri (String pendiri,String lokasi,int tahun)
    {
        super(pendiri,lokasi, tahun);
    }
    
    public void cetak(){
    
    System.out.println("-------------------------------------------");
    System.out.println("Perisai Diri");
    System.out.println("Pendiri       :"+pendiri);
    System.out.println("didirikan di   : "+lokasi);
    System.out.println("Tahun Berdiri : "+tahun);
    System.out.println("");
    }
    }
    
