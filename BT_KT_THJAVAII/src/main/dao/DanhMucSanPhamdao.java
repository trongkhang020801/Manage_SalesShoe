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
import main.model.DanhMucSanPham;
/**
 *
 * @author K2001
 */
public class DanhMucSanPhamdao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<DanhMucSanPham> getAll() {
        List<DanhMucSanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM tblDanhMuc";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new DanhMucSanPham(rs.getString(1),rs.getString(2)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(DanhMucSanPham danhMucSanPham) {
        String sql = "EXECUTE spInsert_tblNhapHang1 ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, danhMucSanPham.getTenDM());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(DanhMucSanPham danhMucSanPham) {
        String sql = "Update tblDanhMuc SET TenDanhMuc = ? WHERE MaDanhMuc = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, danhMucSanPham.getTenDM());
            ps.setString(2, danhMucSanPham.getMaDM());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maDM) {
        String sql = "DELETE FROM tblNhapHang WHERE MaDanhMuc = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maDM);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
