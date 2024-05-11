/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lelang;


/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        
        Masyarakat masyarakat = new Masyarakat();
        Barang barang = new Barang();
        Lelang lelang = new Lelang();
        
        lelang.mulai();
        lelang.mulai(masyarakat,barang);
    }

}

