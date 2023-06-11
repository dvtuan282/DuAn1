/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.HoaDon_model;
import Model.KhachHang_model;
import Model.NhanVien_model;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class HoaDon_repository {

    public static List<HoaDon_model> selectHoaDon() {
        List<HoaDon_model> hoaDon = new ArrayList<>();
        String sql = "SELECT MAHD, KHACHHANG.SDT,KHACHHANG.HOTEN,KHACHHANG.MAIL,KHACHHANG.TIENTICHLUY,KHACHHANG.DIACHI,KHACHHANG.NGAYSINH,KHACHHANG.GIOITINH,NHANVIEN.SDT,NHANVIEN.HOTEN,NHANVIEN.MATKHAU,NHANVIEN.DIACHI,NHANVIEN.EMAIL,NHANVIEN.ANH,NHANVIEN.NGAYSINH,NHANVIEN.GIOITINH,NHANVIEN.VAITRO,NHANVIEN.TRANGTHAI, NgayTao,hoadon.Tongtien,chietKhau,TienThuong,tienThanhToan, hoadon.trangThai FROM HOADON LEFT JOIN KHACHHANG ON  HOADON.KHACHHANG = KHACHHANG.SDT LEFT JOIN NHANVIEN ON HOADON.NHANVIEN = NHANVIEN.SDT ORDER BY CAST(substring(HoaDon.MaHD,3,4) AS SIGNED ) desc ";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                String maHD = rs.getString(1);
                KhachHang_model kh = new KhachHang_model(rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                NhanVien_model nv = new NhanVien_model(rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                String ngayTao = rs.getString(19);
                int trangThai = rs.getInt(24);
                hoaDon.add(new HoaDon_model(maHD, kh, nv, ngayTao, rs.getFloat(20),rs.getFloat(21), rs.getFloat(22), rs.getFloat(23), trangThai));
            }
            return hoaDon;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int updatetHD(HoaDon_model hd){
        String sql = "UPDATE dua_banhang.hoadon SET TONGTIEN = ?, CHIETKHAU = ?, TIENTHUONG = ?, TIENTHANHTOAN = ? WHERE MAHD = ?";
        return JDBC_Helper.UpdateTQ(sql, hd.getTongTien(),hd.getTienChietKhau(),hd.getTienThuong(),hd.getTienThanhToan(),hd.getMaHD());
    }
    public static int updatetTrangThaiHD(HoaDon_model hd){
        String sql = "UPDATE dua_banhang.hoadon SET TrangThai = ? WHERE MAHD = ?";
        return JDBC_Helper.UpdateTQ(sql, hd.getTrangThai(),hd.getMaHD());
    }
    public static HoaDon_model selectHoaDonByID(String id) {
        HoaDon_model hd = null;
        String sql = "SELECT MAHD, KHACHHANG.SDT,KHACHHANG.HOTEN,KHACHHANG.MAIL,KHACHHANG.TIENTICHLUY,KHACHHANG.DIACHI,KHACHHANG.NGAYSINH,KHACHHANG.GIOITINH,NHANVIEN.SDT,NHANVIEN.HOTEN,NHANVIEN.MATKHAU,NHANVIEN.DIACHI,NHANVIEN.EMAIL,NHANVIEN.ANH,NHANVIEN.NGAYSINH,NHANVIEN.GIOITINH,NHANVIEN.VAITRO,NHANVIEN.TRANGTHAI, NgayTao,hoadon.TongTien, chietKhau,TienThuong,tienThanhToan,hoadon.trangThai FROM HOADON LEFT JOIN KHACHHANG ON  HOADON.KHACHHANG = KHACHHANG.SDT LEFT JOIN NHANVIEN ON HOADON.NHANVIEN = NHANVIEN.SDT where hoadon.mahd = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                String maHD = rs.getString(1);
                KhachHang_model kh = new KhachHang_model(rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                NhanVien_model nv = new NhanVien_model(rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                String ngayTao = rs.getString(19);
                int trangThai = rs.getInt(20);
                hd = new HoaDon_model(maHD, kh, nv, ngayTao, trangThai, rs.getFloat(21), rs.getFloat(22), rs.getFloat(23),trangThai);
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int addHoaDon(HoaDon_model hd) {
        String sql = "INSERT INTO HOADON(MAHD,KHACHHANG,NHANVIEN,NGAYTAO,Tongtien,chietKhau,tienThuong,tienThanhToan,trangThai)values(?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.UpdateTQ(sql, hd.getMaHD(), hd.getKhachHang().getSDT(), hd.getNhanVien().getSDT(), hd.getNgayTao(), hd.getTongTien(), hd.getTienChietKhau(), hd.getTienThuong(), hd.getTienThanhToan(),hd.getTrangThai());
    }

    public static void main(String[] args) {
        List<HoaDon_model> hoadon = selectHoaDon();
        for (HoaDon_model hd : hoadon) {
            System.out.println(hd.toString());
        }
    }

}
