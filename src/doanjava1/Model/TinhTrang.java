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
public class TinhTrang {
    String MaHD,MaKH,TenKH,MaXe,NgayLap,SoNgay,Tien;

    public TinhTrang(String MaHD, String MaKH, String TenKH, String MaXe, String NgayLap, String SoNgay, String Tien) {
        this.MaHD = MaHD;
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.MaXe = MaXe;
        this.NgayLap = NgayLap;
        this.SoNgay = SoNgay;
        this.Tien = Tien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(String SoNgay) {
        this.SoNgay = SoNgay;
    }

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }
    
}
