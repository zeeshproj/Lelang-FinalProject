/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lelang;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Lelang {

 private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    private int pilih;
    private boolean detect = false;
    private String yakin;
    private boolean yakinn = false;
    private boolean tawarr;
    Scanner scanner = new Scanner(System.in);

    public void mulai() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("                       Selamat Datang");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. Beli barang");
        System.out.println("2. Jual Barang");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Pilih aksi(1/2): ");
        pilih = scanner.nextInt();
        System.out.println("-------------------------------------------------------------");
    }

    public void mulai(Masyarakat masyarakat, Barang barang) {
        if (pilih == 1) {

            while (yakinn == false) {

                System.out.println("ID\tNAMA\t\tHARGA");
                for (int i = 1; i < 6; i++) {
                    System.out.print(barang.getId(i) + "\t");
                    System.out.print(barang.getNama(i) + "\t");
                    System.out.println("Rp." + barang.getHargaBarang(i));
                }
                System.out.println("");

                while (!detect) {
                    System.out.print("Masukkan id barang yang ingin dibeli : ");
                    int id = scanner.nextInt();
                    if (id < 1 || id > 5) {
                        System.out.println("Tolong masukkan Id barang yang valid.");
                    } else if (!barang.getStatus(id)) {
                        System.out.println("Maaf barang yang anda inginkan sedang tidak tersedia");
                    } else {
                        idBarang.add(id);
                        detect = true;
                    }
                }

                System.out.println("-------------------------------------------------------------");
                System.out.println("                         INFO BARANG");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Nama Barang : " + barang.getNama(idBarang.get(0)));
                System.out.println("Harga Barang : " + barang.getHargaBarang(idBarang.get(0)));
                System.out.println("Penawaran tertinggi saat ini : Rp." + barang.getMaxBarang(idBarang.get(0)));
                System.out.println("-------------------------------------------------------------");
                System.out.print("Apakah yakin membeli barang ini?(Y/N) : ");
                yakin = scanner.next();
                if (yakin.equals("Y")) {
                    yakinn = true;
                }
            }

            System.out.print("Masukkan Id anda : ");
            idPenawar.add(scanner.nextInt());
            System.out.println("-------------------------------------------------------------");
            System.out.println("                         Data Diri");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nama\t:" + masyarakat.getNama(idPenawar.get(0)));
            System.out.println("Alamat\t:" + masyarakat.getAlamat(idPenawar.get(0)));
            System.out.println("Telefon\t:" + masyarakat.getTelepon(idPenawar.get(0)));
            System.out.println("-------------------------------------------------------------");

            while (tawarr == false) {
                System.out.print("Masukkan penawaran anda : ");
                hargaTawar.add(scanner.nextInt());
                if (hargaTawar.get(0) < barang.getHargaBarang(idBarang.get(0))) {
                    System.out.println("Tolong Masukkan jumlah yang lebih besar dari harga awal");
                } else if (hargaTawar.get(0) < barang.getMaxBarang(idBarang.get(0))) {
                    System.out.println("Maaf, sudah ada tawaran yang lebih besar, silahkan isi jumalh yang lebih besar");
                } else {
                    tawarr = true;
                }
            }

            System.out.println("Terimakasih telah memberi barang ini.");
        } else if (pilih == 2) {
            System.out.print("Masukkan nama barang : ");
            barang.setNama(scanner.next());
            System.out.print("Masukkan Harga barang : ");
            barang.setHargaBarang(scanner.nextInt());
            int idTerbaru = barang.getTerbaru();
            barang.setId(idTerbaru);
            barang.addNew();

            System.out.println("-------------------------------------------------------------");
            System.out.println("                         INFO BARANG");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Id\t: " + barang.getId(idTerbaru));
            System.out.println("Nama\t: " + barang.getNama(idTerbaru));
            System.out.println("Harga\t: Rp." + barang.getHargaBarang(idTerbaru));
        }
    }

}

