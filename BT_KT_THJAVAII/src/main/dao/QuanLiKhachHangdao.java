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
import main.model.QuanLiKhachHang;
/**
 *
 * @author K2001
 */
public class QuanLiKhachHangdao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<QuanLiKhachHang> getAll() {
        List<QuanLiKhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM tblKhachHang";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new QuanLiKhachHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getInt(6),rs.getString(7)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(QuanLiKhachHang quanLiKhachHang) {
        String sql = "EXECUTE spInsert_tblKhachHang1 ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, quanLiKhachHang.getHoten());
            ps.setString(2, quanLiKhachHang.getGioiTinh());
            ps.setString(3, quanLiKhachHang.getNgaySinh());
            ps.setString(4, quanLiKhachHang.getDiaChi());
            ps.setInt(5, quanLiKhachHang.getSDT());
            ps.setString(6, quanLiKhachHang.getNgayDK());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(QuanLiKhachHang quanLiKhachHang) {
        String sql = "Update tblKhachHang SET HoTenKH = ?, GioiTinh = ?, NguoiNhan = ?, NgaySinh = ?, DiaChi = ?, SDT = ?, NgayDK = ? WHERE MaKh = ?";
        PreparedStatement ps = null;
        try {
             ps = con.prepareStatement(sql);
            ps.setString(1, quanLiKhachHang.getHoten());
            ps.setString(2, quanLiKhachHang.getGioiTinh());
            ps.setString(3, quanLiKhachHang.getNgaySinh());
            ps.setString(4, quanLiKhachHang.getDiaChi());
            ps.setInt(5, quanLiKhachHang.getSDT());
            ps.setString(6, quanLiKhachHang.getNgayDK());
            ps.setString(7, quanLiKhachHang.getMaKH());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maNH) {
        String sql = "DELETE FROM tblNhapHang WHERE MaKh = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maNH);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
