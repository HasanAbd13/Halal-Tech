package wastefoodHALAL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class ArrayMakan {
    ArrayList<Makanan> array = new ArrayList<>();

    public static void simpan(ArrayList<Makanan> arrays) {
        XStream xStream = new XStream(new StaxDriver());
        String sxml = xStream.toXML(arrays);
        FileOutputStream fileOutput;
        
        try{
            byte[] bytes = sxml.getBytes("UTF-8");
            fileOutput = new FileOutputStream("src/wastefoodHALAL/Makanan.xml");
            fileOutput.write(bytes);
            fileOutput.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStockMakanan(int no, String namaResto, String namaMakanan, int stock) {
        array.add(new Makanan(no, namaResto, namaMakanan, stock));
        simpan(array);
    }

    public Makanan getStock(int index) {
        return array.get(index);
    }

    public ArrayList<Makanan> getStockMakananList() {
        return array;
    }

    public void Array(){
        array = baca(array);
    }

    private static ArrayList<Makanan> baca(ArrayList<Makanan> arrays) {
        XStream xStream = new XStream(new StaxDriver());
        xStream.addPermission(AnyTypePermission.ANY);
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream("src/wastefoodHALAL/Makanan.xml");

            String sxml = "";
            int isi;
            char c;
            while((isi = fileInput.read()) != -1) {
                c = (char) isi;
                sxml += c;
            }

            arrays = (ArrayList<Makanan>) xStream.fromXML(sxml);
            fileInput.close();
            return arrays;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return arrays;
        }
    }
}
