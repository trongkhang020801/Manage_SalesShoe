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
import java.util.Random;
import main.model.BanHang;

/**
 *
 * @author K2001
 */
public class BanHangdao {
    private Connection con = KetNoiCSDL.getConnection();

    public List<BanHang> getAll() {
        List<BanHang> list = new ArrayList<>();
        String sql = "SELECT * FROM tblBanHang";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BanHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
                        rs.getString(6),rs.getString(7),rs.getInt(8)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(BanHang banHang) {
        String sql = "EXECUTE spInsert_tblBanHang3 ?, ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, banHang.getHotenKH());
            ps.setString(2, banHang.getTenSP());
            ps.setInt(3, banHang.getGia());
            ps.setInt(4, banHang.getSoLuong());
            ps.setString(5, banHang.getSize());
            ps.setString(6, banHang.getNgayBan());
            ps.setInt(7, banHang.getTongTien());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(BanHang banHang) {
        String sql = "Update tblBanHang SET HotenKH = ?, TenSP = ?, Gia = ?, SoLuong = ?, Size = ?, NgayBan= ?, TongTien = ? WHERE MaDH = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(8, banHang.getMaDH());
            ps.setString(6, banHang.getNgayBan());
            ps.setString(1, banHang.getHotenKH());
            ps.setString(2, banHang.getTenSP());
            ps.setInt(3, banHang.getGia());
            ps.setInt(4, banHang.getSoLuong());
            ps.setString(5, banHang.getSize());
            ps.setInt(7, banHang.getTongTien());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maDH) {
        String sql = "DELETE FROM tblBanHang WHERE MaDH = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maDH);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public List<BanHang> findByName(String name){
        List<BanHang> list = new ArrayList<>();
        String sql = "SELECT * FROM tblBanHang WHERE HotenKH LIKE CONCAT( '%',?,'%')";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new BanHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
                        rs.getString(6),rs.getString(7),rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<BanHang> findByNam(String name){
        List<BanHang> list = new ArrayList<>();
        String sql = "SELECT * FROM tblBanHang WHERE NgayBan LIKE CONCAT( '%',?,'%')";
        System.out.println(name);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new BanHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
                        rs.getString(6),rs.getString(7),rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<BanHang> findByThang(String nam, String thang ){
        List<BanHang> list = new ArrayList<>();
        Random k = new Random(100);
        int i = k.nextInt();
        String sql = 
                    "select * \n" +
                    "from tblBanHang \n" +
                    "where NgayBan in \n" +
                    "(select NgayBan from tblBanHang where NgayBan like CONCAT('%',?,'%'))\n" +
                    "and NgayBan like CONCAT('%/',?,'/%')";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nam);
            ps.setString(2, thang);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new BanHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
                        rs.getString(6),rs.getString(7),rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
