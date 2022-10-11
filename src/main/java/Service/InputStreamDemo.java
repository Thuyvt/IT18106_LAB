/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        // Doc file dang byte
        try {
            // Tao luong doc file 
            FileInputStream fis = new FileInputStream("D:\\FPT\\thuyvt66.txt");
            byte[] arr = new byte[1000];
            // Doc du lieu tu file va luu vao mang arr
            fis.read(arr);
            // Chuyen doi tu byte ve String
            String data = new String(arr);
            System.out.println(data);
            // Dong luong doc file
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // GOI PHUONG THUC DOC DU LIEU NGUYEN THUY
        docDuLieuNguyenThuy();
        
        // GOI PHUONG THUC DOC DU LIEU DOI TUONG
        docDoiTuong();
    }
    
    public static void docDuLieuNguyenThuy() {
        try {
            FileInputStream fis = new FileInputStream("D:\\FPT\\data.txt");
            DataInputStream dis = new DataInputStream(fis);
            
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            // dong luong doc file
            dis.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void docDoiTuong() {
        try {
            FileInputStream fis = new FileInputStream("D:\\ghiDoiTuong.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            List<SinhVien> lsv = (List<SinhVien>) ois.readObject();
            if (!lsv.isEmpty()) {
                for (SinhVien sv : lsv) {
                    System.out.println("Ten: " + sv.getTen());
                    System.out.println("Diem: " +sv.getDiem());
                }
            }
            
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
