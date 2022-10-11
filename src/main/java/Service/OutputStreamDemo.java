/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class OutputStreamDemo {

    public static void main(String[] args) {
        // GHI DU LIEU DANG BYTE
        try {
            FileOutputStream fos = new FileOutputStream("D:\\FPT\\thuyvt66.txt");
            // Tao mot chuoi
            String data = "Co Thuy xinh gai nhat he mat troi";
            // Chuyen doi String ve byte
            byte[] arr = data.getBytes();
            // ghi du lieu vao file
            fos.write(arr);

            // dong luong output stream
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // GHI DU LIEU DANG NGUYEN THUY
            // Mo luong ghi file
            FileOutputStream fos = new FileOutputStream("D:\\FPT\\data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            // Ghi du lieu String
            dos.writeUTF("Hello");
            // Ghi du lieu double;
            dos.writeDouble(50.14);
            // Ghi du lieu boolean
            dos.writeBoolean(true);
            // Dong luong ghi file
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Goi phuong thuc ghi doi tuong
        ghiDoiTuong();
    }

    public static void ghiDoiTuong() {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\ghiDoiTuong.txt");
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            // TAO DANH SACH SINH VIEN
            List<SinhVien> listSv = new ArrayList<>();
            listSv.add(new SinhVien("Thuy", 18, 10, true));
            listSv.add(new SinhVien("Thien", 20, 4, false));
            listSv.add(new SinhVien("Luong", 18, 5, true));
            listSv.add(new SinhVien("Duy", 19,8, true));
            
            // ghi danh sach sv
            oss.writeObject(listSv);
            
            // dong luong ghi file
            oss.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
