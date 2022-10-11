/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class NDService {

    List<NguoiDung> listNguoiDung = new ArrayList<>();

    public NDService() {
        NguoiDung nd1 = new NguoiDung("thuyvt66", "123456",
                "thuyvt66@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        NguoiDung nd2 = new NguoiDung("loantt", "123456",
                "loantt@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        NguoiDung nd3 = new NguoiDung("thienth3", "123456",
                "thienth3@fpt.edu.vn", 2, true, "Nam", "Nhan vien");
        NguoiDung nd4 = new NguoiDung("giangdtt", "123456",
                "giangdtt@fpt.edu.vn", 1, true, "Nu", "Sinh vien");
        //          Them doi tuong vao listNguoiDung
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);

    }

    // Lay ra danh sach nguoi dung
    public List<NguoiDung> getList() {

//  
        return listNguoiDung;
    }

    public void add(NguoiDung nd) {
        listNguoiDung.add(nd);
    }

    public void update(NguoiDung item, int index) {
        listNguoiDung.set(index, item);
    }

    public void delete(int index) {
        listNguoiDung.remove(index);
    }
    
    public boolean ghi() {
        try {
            FileOutputStream fos = new FileOutputStream("ghiFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(listNguoiDung);
            oos.close();
            fos.close();
            
            return true;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean doc() {
        try {
            FileInputStream fis = new FileInputStream("ghiFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            listNguoiDung = (List<NguoiDung>) ois.readObject();
            ois.close();
            fis.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NDService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
