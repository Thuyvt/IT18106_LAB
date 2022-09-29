/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class CollectionsExam {

    public static void main(String[] args) {
        // LIST LƯU TRU PHAN TU THEO THU TU THEM VAO
        // Lam viec voi list thong qua index
        List<Double> listDouble = new ArrayList<>();
        listDouble.add(12.5);
        listDouble.add(17.5);
        listDouble.add(20.5);
        listDouble.add(15.5);
        listDouble.add(12.5);
        System.out.println(listDouble);
        // SET LOAI BO PHAN TU CO GIA TRI TRUNG LAP
        // Hash set chi loai bo trung lap
        Set<Double> setDouble = new HashSet<>();
        setDouble.add(12.5);
        setDouble.add(17.5);
        setDouble.add(20.5);
        setDouble.add(15.5);
        setDouble.add(12.5);
        System.out.println("Hash set :" + setDouble);
        // Tree set sap xep phan tu theo thu tu tang dan
        Set<Double> treeSetDouble = new TreeSet<>();
        treeSetDouble.add(12.5);
        treeSetDouble.add(17.5);
        treeSetDouble.add(20.5);
        treeSetDouble.add(15.5);
        treeSetDouble.add(12.5);
        System.out.println("Tree set: " + treeSetDouble);
        // PHUONG THUC DUNG CHUNG
        // add, size, remove
        // Đêm kich thuoc cua danh sach co bao nhieu phan tu
        System.out.println("Kich thuoc List: " + listDouble.size());
        System.out.println("Kich thuoc Set: " + setDouble.size());
        // List có the lay phan tu tu index
        System.out.println(listDouble.get(2));
        // Xoa voi index chi lam viec duoc voi list
        System.out.println("Xoa phan tu tai vi tri :" + listDouble.remove(2));
        System.out.println("DS sau khi xoa: " + listDouble);
        // Voi set chi xoa duoc phan tu bang gia tri cua phan tu do
        System.out.println("Xoa phan tu bang gia tri:" + setDouble.remove(17.5));
        System.out.println("Hash sau khi xoa: " + setDouble);

        List<NguoiDung> listNguoiDung = new ArrayList<>();
        NguoiDung nd1 = new NguoiDung("thuyvt66", "123456",
                "thuyvt66@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        NguoiDung nd2 = new NguoiDung("loantt", "123456",
                "loantt@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        NguoiDung nd3 = new NguoiDung("thienth3", "123456",
                "thienth3@fpt.edu.vn", 2, true, "Nam", "Nhan vien");
        NguoiDung nd4 = new NguoiDung("giangdtt", "123456",
                "giangdtt@fpt.edu.vn", 1, true, "Nu", "Sinh vien");
        NguoiDung nd5 = new NguoiDung("thuyvt66", "123456",
                "thuyvt66@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        //  Them doi tuong vao listNguoiDung
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);

        NguoiDung removeItem = new NguoiDung("thuyvt66", "123456",
                "thuyvt66@fpt.edu.vn", 2, true, "Nu", "Giang vien");
        // xoa doi tuong index = 4
        // listNguoiDung.remove(4);
//        listNguoiDung.remove(removeItem);
        // C1: Tao danh sach de xoa tat ca doi tuong co gia tri = removeItem
//        List<NguoiDung> listRemove = new ArrayList<>();
//        listRemove.add(removeItem);
//        listNguoiDung.removeAll(listRemove);

        // C2: Su dung removeIf()
//        listNguoiDung.removeIf(item -> Objects.equals(item, removeItem));
        // C3: su dung vong lap
//        while(listNguoiDung.remove(removeItem));
//        System.out.println(removeItem.hashCode());
//        System.out.println(nd5.hashCode());
//        System.out.println(nd1.hashCode());
        // SAP XEP
        // C1: Su dung Comparator
        // Sap xep tang dan - ASC
        Collections.sort(listNguoiDung, new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o1.getTenTaiKhoan().compareTo(o2.getTenTaiKhoan());
            }
        });
        // Sap xep giam gian - DESC
        Collections.sort(listNguoiDung, new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o2.getTenTaiKhoan().compareTo(o1.getTenTaiKhoan());
            }
        });
        // C2: Su dung interface Comparable
        // Implement Inteface Comparable bên class cua doi tuong nguoi dung
        // Sap xep tang dan - ASC
        Collections.sort(listNguoiDung);
        // Săp xep nguoc - DESC
        Collections.reverse(listNguoiDung);

        // C3: interface sort()
        // Sap xep tang dan - ASC
        listNguoiDung.sort(Comparator.comparing(NguoiDung::getTenTaiKhoan));
        // Săp xep nguoc - DESC
        listNguoiDung.sort(Comparator.comparing(NguoiDung::getTenTaiKhoan).reversed());
        
        // C4: su dung stream()
        listNguoiDung.stream().sorted(Comparator.comparing(NguoiDung::getTenTaiKhoan))
                .collect(Collectors.toList());
        for (NguoiDung nd : listNguoiDung) {
            System.out.println("tk: " + nd.getTenTaiKhoan() + " - email: " + nd.getEmail());
        }
    }
}
