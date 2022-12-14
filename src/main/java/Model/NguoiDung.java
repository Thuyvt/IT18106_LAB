/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ThuyVT
 */
public class NguoiDung implements Serializable {

    private String tenTaiKhoan;
    private String matKhau;
    private String email;
    private int quyen; // 1- nguoi dung; 2: admin
    private boolean trangThai;
    private String gioiTinh;
    private String viTriCV;

    public NguoiDung() {
    }

    public NguoiDung(String tenTaiKhoan, String matKhau, String email, int quyen, boolean trangThai, String gioiTinh, String viTriCV) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.email = email;
        this.quyen = quyen;
        this.trangThai = trangThai;
        this.gioiTinh = gioiTinh;
        this.viTriCV = viTriCV;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getViTriCV() {
        return viTriCV;
    }

    public void setViTriCV(String viTriCV) {
        this.viTriCV = viTriCV;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NguoiDung other = (NguoiDung) obj;
        if (this.quyen != other.quyen) {
            return false;
        }
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.tenTaiKhoan, other.tenTaiKhoan)) {
            return false;
        }
        if (!Objects.equals(this.matKhau, other.matKhau)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.gioiTinh, other.gioiTinh)) {
            return false;
        }
        return Objects.equals(this.viTriCV, other.viTriCV);
    }

//    @Override
//    public int compareTo(NguoiDung o) {
//        return this.getTenTaiKhoan().compareTo(o.getTenTaiKhoan());
//    }

}
