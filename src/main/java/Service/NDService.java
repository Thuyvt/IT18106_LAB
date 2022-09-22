/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class NDService {
    List<NguoiDung> listNguoiDung = new ArrayList<>();

    public NDService() {
//        Khoi tao 4 doi tuong nguoi dung
           NguoiDung nd1 = new NguoiDung("thuyvt66", "123456", 
                   "thuyvt66@fpt.edu.vn", 2, true, "Nu", "Giang vien");
           NguoiDung nd2 = new NguoiDung("loantt", "123456", 
                   "loantt@fpt.edu.vn", 2, true, "Nu", "Giang vien");
           NguoiDung nd3 = new NguoiDung("thienth3", "123456", 
                   "thienth3@fpt.edu.vn", 2, true, "Nam", "Nhan vien");
           NguoiDung nd4 = new NguoiDung("giangdtt", "123456", 
                   "giangdtt@fpt.edu.vn", 1, true, "Nu", "Sinh vien");
          
//           Them doi tuong vao listNguoiDung
            listNguoiDung.add(nd1);
            listNguoiDung.add(nd2);
            listNguoiDung.add(nd3);
            listNguoiDung.add(nd4);
            
    }
    // Lay ra danh sach nguoi dung
    public List<NguoiDung> getList() {
        return listNguoiDung;
    }
    
    public void add(NguoiDung nd) {
        listNguoiDung.add(nd);
    }
}
