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
public class DanhMucSanPham {
    private String maDM;
    private String tenDM;

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public DanhMucSanPham(String maDM, String tenDM) {
        this.maDM = maDM;
        this.tenDM = tenDM;
    }
    
    
}
