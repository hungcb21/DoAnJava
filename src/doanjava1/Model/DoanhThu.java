/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava1.Model;

/**
 *
 * @author PC
 */
public class DoanhThu {
    String MaHD,NgayThue,Tien;

    public DoanhThu(String MaHD, String NgayThue, String Tien) {
        this.MaHD = MaHD;
        this.NgayThue = NgayThue;
        this.Tien = Tien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(String NgayThue) {
        this.NgayThue = NgayThue;
    }

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }
    
}
