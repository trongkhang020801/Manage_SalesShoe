/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.model.NhapHang;

/**
 *
 * @author K2001
 */
public class NhapHangdao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<NhapHang> getAll() {
        List<NhapHang> list = new ArrayList<>();
        String sql = "SELECT * FROM tblNhapHang";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NhapHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),
                        rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10)));
            }

         
        } catch (Exception e) {
            e.printStackTrace();
        }
   return list;
    }

    public void insert(NhapHang nhapHang) {
        String sql = "EXECUTE spInsert_tblNhapHang1 ?, ?, ?, ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nhapHang.getTenSP());
            ps.setString(2, nhapHang.getTenDM());
            ps.setString(3, nhapHang.getNguoiNhan());
            ps.setInt(4, nhapHang.getGia());
            ps.setInt(5, nhapHang.getSoLuong());
            ps.setString(6, nhapHang.getNhaPhanPhoi());
            ps.setString(7, nhapHang.getNguoiGiao());
            ps.setString(8, nhapHang.getNgayNhap());
            ps.setInt(9, nhapHang.getTongTien());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(NhapHang nhapHang) {
        String sql = "Update tblNhapHang SET TenSanPham = ?, TenDanhMuc = ?, NguoiNhan = ?, Gia = ?, SoLuong = ?, NhaPhanPhoi = ?, NguoiGiao = ?,"
                + "NgayNhap = ?, TongTien =? WHERE MaNhapHang = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nhapHang.getTenSP());
            ps.setString(2, nhapHang.getTenDM());
            ps.setString(3, nhapHang.getNguoiNhan());
            ps.setInt(4, nhapHang.getGia());
            ps.setInt(5, nhapHang.getSoLuong());
            ps.setString(6, nhapHang.getNhaPhanPhoi());
            ps.setString(7, nhapHang.getNguoiGiao());
            ps.setString(8, nhapHang.getNgayNhap());
            ps.setInt(9, nhapHang.getTongTien());
            ps.setString(10, nhapHang.getMaNH());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maNH) {
        String sql = "DELETE FROM tblNhapHang WHERE MaNhapHang = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maNH);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
