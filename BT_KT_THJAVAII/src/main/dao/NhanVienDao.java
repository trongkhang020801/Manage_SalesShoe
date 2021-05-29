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
import main.model.NhanVien;
/**
 *
 * @author K2001
 */
public class NhanVienDao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM tblNhanVien";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NhanVien(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(NhanVien nhanVien) {
        String sql = "EXECUTE spInsert_tblNhanVien1 ?, ?, ?, ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getHoTen());
            ps.setString(2, nhanVien.getGioiTinh());
            ps.setString(3, nhanVien.getNgaySinh());
            ps.setString(4, nhanVien.getDiaChi());
            ps.setString(5, nhanVien.getChuVu());
            ps.setInt(6, nhanVien.getLuongCB());
            ps.setInt(7, nhanVien.getCmnd());
            ps.setInt(8, nhanVien.getSdt());
            ps.setString(9, nhanVien.getNgayBD());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(NhanVien nhanVien) {
        String sql = "Update tblNhanVien SET HoTenNV = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, ChucVu = ?, LuongCB = ?, CMND = ?,"
                + "SDT = ?, NgaybatDau =? WHERE MaDauSach = ?";
        PreparedStatement ps = null;
        try {
              ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getHoTen());
            ps.setString(2, nhanVien.getGioiTinh());
            ps.setString(3, nhanVien.getNgaySinh());
            ps.setString(4, nhanVien.getDiaChi());
            ps.setString(5, nhanVien.getChuVu());
            ps.setInt(6, nhanVien.getLuongCB());
            ps.setInt(7, nhanVien.getCmnd());
            ps.setInt(8, nhanVien.getSdt());
            ps.setString(9, nhanVien.getNgayBD());
            ps.setString(10, nhanVien.getMaNV());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maNH) {
        String sql = "DELETE FROM tblNhapHang WHERE MaNV = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maNH);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
