package wastefoodHALAL;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Makanan")
public class Makanan {
    
    private int no;
    private String namaResto;
    private String namaMakanan;
    private int stock;
    

    public Makanan(int no, String namaResto, String namaMakanan, int stock) {
        this.no = no;
        this.namaResto = namaResto;
        this.namaMakanan = namaMakanan;
        this.stock = stock;    
    }

    public int getNo(){
        return no;
    }

    public String getNamaResto(){
        return namaResto;
    }
    
    public String getNamaMakanan() {
        return namaMakanan;
    }
    public int getStock() {
        return stock;
    }

    public void seNo(int no) {
        this.no = no;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Makanan> getStockMakananList() {
        return null;
    }
    
}