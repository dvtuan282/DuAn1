/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien_model;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class NhanVien_repository {

    public static List<NhanVien_model> selectNhanVien() {
        List<NhanVien_model> nhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                nhanVien.add(new NhanVien_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10)));
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<NhanVien_model> searchNhanVien(String keyWord) {
        List<NhanVien_model> nhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN where sdt like concat ('%',?,'%') or hoTen like concat ('%',?,'%')";
        ResultSet rs = JDBC_Helper.selectTQ(sql, keyWord);
        try {
            while (rs.next()) {
                nhanVien.add(new NhanVien_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10)));
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

     public static NhanVien_model selectByID(String id) {
        NhanVien_model nv = null;
        String sql = "select * from nhanVien where sdt = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                nv = new NhanVien_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static NhanVien_model loginNV(String sdt,String ma) {
        NhanVien_model nhanVien = null;
        String sql = "SELECT * FROM NHANVIEN where sdt = ? and matKhau = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, sdt,ma);
        try {
            while (rs.next()) {
                nhanVien  = new NhanVien_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int addNhanVien(NhanVien_model nv) {
        String sql = "INSERT INTO NHANVIEN(SDT,HOTEN,MATKHAU,DIACHI,EMAIL,ANH,NGAYSINH,GIOITINH,VAITRO,TRANGTHAI) VALUES(?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.UpdateTQ(sql, nv.getSDT(), nv.getHoTen(), nv.getMatKhau(), nv.getDiaChi(), nv.getEmail(), nv.getAnh(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getVaiTro(), nv.getTrangThai());
    }

    public static int updateNhanVien(NhanVien_model nv) {
        String sql = "UPDATE NHANVIEN SET SDT=?,HOTEN=?,MATKHAU=?,DIACHI=?,EMAIL=?,ANH=?,NGAYSINH=?,GIOITINH=?,VAITRO=?,TRANGTHAI=? WHERE SDT = ?";
        return JDBC_Helper.UpdateTQ(sql, nv.getSDT(), nv.getHoTen(), nv.getMatKhau(), nv.getDiaChi(), nv.getEmail(), nv.getAnh(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getVaiTro(), nv.getTrangThai(), nv.getSDT());
    }

    public static int deleteNhanVien(String sdt) {
        String sql = "DELETE FROM NHANVIEN WHERE SDT = ?";
        return JDBC_Helper.UpdateTQ(sql, sdt);
    }

    public static void main(String[] args) {
        NhanVien_model nv = selectByID("12");
        System.out.println(nv);
    }
}
