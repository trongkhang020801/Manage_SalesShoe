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
import main.model.QuanLiAo;
/**
 *
 * @author K2001
 */
public class QuanLiAodao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<QuanLiAo> getAll() {
        List<QuanLiAo> list = new ArrayList<>();
        String sql = "SELECT * FROM tblAo";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new QuanLiAo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),
                        rs.getInt(6),rs.getString(7)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(QuanLiAo quanLiAo) {
        String sql = "EXECUTE spInsert_tblAo3 ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, quanLiAo.getTenSP());
            ps.setString(2, quanLiAo.getTenDM());
            ps.setString(3, quanLiAo.getSize());
            ps.setInt(4, quanLiAo.getSoLuong());
            ps.setInt(5, quanLiAo.getGiaBan());
            ps.setString(6, quanLiAo.getNgayNhap());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(QuanLiAo quanLiAo) {
        String sql = "Update tblAo SET TenSP = ?, TenDanhMuc = ?, Size = ?, SoLuongCon = ?, Giaban = ?, NgayNhap = ? WHERE MaSP = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, quanLiAo.getTenSP());
            ps.setString(2, quanLiAo.getTenDM());
            ps.setString(3, quanLiAo.getSize());
            ps.setInt(4, quanLiAo.getSoLuong());
            ps.setInt(5, quanLiAo.getGiaBan());
            ps.setString(6, quanLiAo.getNgayNhap());
            ps.setString(7, quanLiAo.getMaSP());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maNH) {
        String sql = "DELETE FROM tblAo WHERE MaSP = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maNH);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
