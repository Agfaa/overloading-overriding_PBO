/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author ASUS
 */
public class IPSI {
    String pendiri;
    String lokasi;
    int tahun;
    public IPSI (String pendiri, String lokasi, int tahun)
    {
        this.pendiri = pendiri;
        this.lokasi = lokasi;
        this.tahun = tahun;
    }
    
    public void cetak()
    {
        System.out.println("Ikatan Pencak Silat Indonesia (IPSI)");
        System.out.println("Merupakan wadah organisasi pencak silat bagi seluruh jajaran pencak silat Indonesia");
        System.out.println("didirikan oleh : "+pendiri);
        System.out.println("didirikan di   : "+lokasi);
        System.out.println("Pada tahun     : "+tahun);
        System.out.println("=======================================================================================");
        
    }
    
}
