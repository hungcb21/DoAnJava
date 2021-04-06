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
public class Xe {
    String maXe,tenXe, loai;

    public Xe(String maXe, String tenXe, String loai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.loai = loai;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

 
}
