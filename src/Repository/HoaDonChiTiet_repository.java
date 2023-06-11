/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.HoaDonChiTiet_model;
import Model.HoaDon_model;
import Model.SanPham_model;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class HoaDonChiTiet_repository {

    public static List<HoaDonChiTiet_model> selectHoaDon(String maHD) {
        List<HoaDonChiTiet_model> hoaDonct = new ArrayList<>();
        String sql = "SELECT hoadoncṭ̣.ID, HOADON.MAHD,HOADON.NGAYTAO,HOADON.TongTien,hoadon.chietkhau,hoadon.tienthuong,hoadon.TIENTHANHTOAN,HOADON.TRANGTHAI,SANPHAM.id,SANPHAM.TENSANPHAM,SANPHAM.GIANHAP,SANPHAM.GIABAN,SANPHAM.SOLUONG,SANPHAM.ANH,SANPHAM.TRANGTHAI,hoadoncṭ̣.SOLUONG,hoadoncṭ̣.TIENHANG FROM hoadoncṭ̣ LEFT JOIN HOADON ON hoadoncṭ̣.HOADON = HOADON.MAHD LEFT JOIN SANPHAM ON hoadoncṭ̣.SANPHAM = SANPHAM.ID where hoadon.maHD = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql,maHD);
        try {
            while (rs.next()) {
                HoaDon_model hd = new HoaDon_model(rs.getString(2), null, null, rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7),rs.getInt(8));
                SanPham_model sp = new SanPham_model(rs.getInt(9), rs.getString(10), null, null, null, null, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15));
                hoaDonct.add(new HoaDonChiTiet_model(rs.getInt(1), hd, sp, rs.getInt(16), rs.getFloat(17)));
            }
            return hoaDonct;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HoaDonChiTiet_model selectID(int id) {
        HoaDonChiTiet_model hoaDon = null;
        String sql = "SELECT hoadoncṭ̣.ID, HOADON.MAHD,HOADON.NGAYTAO,HOADON.TongTien,hoadon.chietkhau,hoadon.tienthuong,hoadon.TIENTHANHTOAN,HOADON.TRANGTHAI,SANPHAM.id,SANPHAM.TENSANPHAM,SANPHAM.GIANHAP,SANPHAM.GIABAN,SANPHAM.SOLUONG,SANPHAM.ANH,SANPHAM.TRANGTHAI,hoadoncṭ̣.SOLUONG,hoadoncṭ̣.TIENHANG FROM hoadoncṭ̣ LEFT JOIN HOADON ON hoadoncṭ̣.HOADON = HOADON.MAHD LEFT JOIN SANPHAM ON hoadoncṭ̣.SANPHAM = SANPHAM.ID where hoadoncṭ̣.ID = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                HoaDon_model hd = new HoaDon_model(rs.getString(2), null, null, rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7),rs.getInt(8));
                SanPham_model sp = new SanPham_model(rs.getInt(9), rs.getString(10), null, null, null, null, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15));
                 hoaDon = new HoaDonChiTiet_model(rs.getInt(1), hd, sp, rs.getInt(16), rs.getFloat(17));

            }
            return hoaDon;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int AddHoaDonCT(HoaDonChiTiet_model hdct) {
        String sql = "INSERT INTO hoadoncṭ̣(HOADON, SANPHAM, SOLUONG,TIENHANG) VALUES (?,?,?,?);";
        return JDBC_Helper.UpdateTQ(sql,hdct.getMaHD().getMaHD(),hdct.getSanPham().getId(),hdct.getSoLuong(),hdct.getTienHang());
    }
//
    public static int UpdateHDCT(HoaDonChiTiet_model hdct1) {
        String sql = "UPDATE dua_banhang.hoadoncṭ̣ SET SOLUONG = ?, TIENHANG = ? where ID = ?";
        return JDBC_Helper.UpdateTQ(sql, hdct1.getSoLuong(),hdct1.getTienHang(),hdct1.getId());
    }
    public static int DeleteHDCT(int id) {
        String sql = "DELETE FRoM dua_banhang.hoadoncṭ̣ WHERE hoadoncṭ̣.id= ?";
        return JDBC_Helper.UpdateTQ(sql, id);
    }
//    public static int DeleteHDCTSL(int ) {
//        String sql = "DELETE FRoM dua_banhang.hoadoncṭ̣ WHERE hoadoncṭ̣.sl= 0";
//        return JDBC_Helper.UpdateTQ(sql, sl);
//    }
    public static void main(String[] args) {
        HoaDonChiTiet_model hd = selectID(27);
            System.out.println(hd);
    }

}
