package lop;
import java.io.*;
import java.util.*;
public class SanPhamDao {
	public void ghiFile(ArrayList<SanPham> dssp) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
        	
            fout = new FileOutputStream("d:\\dshp2.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(dssp);
            System.out.println("Ghi vào file thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public ArrayList<SanPham> docFile(String filename) {
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            dssp = (ArrayList<SanPham>) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return dssp;
    }
}
