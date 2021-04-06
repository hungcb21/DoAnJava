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
public class NhanVien {
    String MaNV,TenNV,DiaChi,SDT,GT,LUONG;

    public NhanVien(String MaNV, String TenNV, String DiaChi, String SDT, String GT, String LUONG) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.GT = GT;
        this.LUONG = LUONG;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getLUONG() {
        return LUONG;
    }

    public void setLUONG(String LUONG) {
        this.LUONG = LUONG;
    }
    
}
