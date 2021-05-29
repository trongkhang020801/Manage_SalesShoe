/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author K2001
 */
public class NhapHang {
    private String maNH;
    private String tenSP;
    private String tenDM;
    private String nguoiNhan;
    private int gia;
    private int soLuong;
    private String nhaPhanPhoi;
    private String nguoiGiao;
    private String ngayNhap;
    private int tongTien;

    

   


    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaPhanPhoi() {
        return nhaPhanPhoi;
    }

    public void setNhaPhanPhoi(String nhaPhanPhoi) {
        this.nhaPhanPhoi = nhaPhanPhoi;
    }

    public String getNguoiGiao() {
        return nguoiGiao;
    }

    public void setNguoiGiao(String nguoiGiao) {
        this.nguoiGiao = nguoiGiao;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
     public NhapHang(String maNH, String tenSP, String tenDM, String nguoiNhan, int gia, int soLuong, String nhaPhanPhoi, String nguoiGiao, String ngayNhap, int tongTien) {
        this.maNH = maNH;
        this.tenSP = tenSP;
        this.tenDM = tenDM;
        this.nguoiNhan = nguoiNhan;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nhaPhanPhoi = nhaPhanPhoi;
        this.nguoiGiao = nguoiGiao;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }

}
