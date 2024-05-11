/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lelang;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaBarang = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    private ArrayList<Integer> maxBarang = new ArrayList<Integer>();
    private int index;

    public Barang() {
        add(0, "?", 0, false, 0);
        add(1, "Pengalaman", 1000000, true, 2500000);
        add(2, "Waktu\t", 5000000, false, 0);
        add(3, "Perasaan", 2000000, true, 4000000);
        add(4, "Ketenaran", 1500000, true, 3500000);
        add(5, "Kebahagiaan", 5000000, false, 0);
        addNew();
    }

    public void add(int id, String nama, int harga, boolean status, int max) {
        setHargaBarang(harga);
        setId(id);
        setNama(nama);
        setStatus(status);
        setMaxBarang(max);
    }

    public void addNew() {
        setTerbaru(this.namaBarang.size());
    }

    public String getNama(int id) {
        return this.namaBarang.get(id);
    }

    public void setNama(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public int getId(int id) {
        return this.idBarang.get(id);
    }

    public void setId(int id) {
        this.idBarang.add(id);
    }

    public int getHargaBarang(int id) {
        return this.hargaBarang.get(id);
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang.add(hargaBarang);
    }

    public boolean getStatus(int id) {
        return this.status.get(id);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public int getMaxBarang(int id) {
        return this.maxBarang.get(id);
    }

    public void setMaxBarang(int maxBarang) {
        this.maxBarang.add(maxBarang);
    }

    public void setTerbaru(int penambahan) {
        this.index = penambahan;
    }
    
    public int getTerbaru(){
        return this.index;
    }
}
