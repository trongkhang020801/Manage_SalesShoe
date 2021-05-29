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
public class BanHang {
    private String maDH;
    private String hotenKH;
    private String tenSP;
    private int gia;
    private int soLuong;
    private String size;
    private String NgayBan;
    private int tongTien;

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    
    public BanHang(String maDH, String hotenKH, String tenSP, int gia, int soLuong, String size,String ngayBan, int tongTien) {
        this.maDH = maDH;
        this.hotenKH = hotenKH;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.size = size;
        this.tongTien = tongTien;
        this.NgayBan = ngayBan;
    }
    
}
