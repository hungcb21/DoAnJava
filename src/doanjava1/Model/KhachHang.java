/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava1.Model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class KhachHang {
    String maKH,tenKH,diachi,sdt,cmnd;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String dmnd) {
        this.cmnd = dmnd;
    }

    public KhachHang(String maKH, String tenKH, String diachi, String sdt, String cmnd) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diachi = diachi;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

   

    
}
