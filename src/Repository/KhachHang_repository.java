/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KhachHang_model;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class KhachHang_repository {
    public static List<KhachHang_model> selectKhach() {
        List<KhachHang_model> khach = new ArrayList<>();
        String sql = "select * from khachHang";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                khach.add(new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5),rs.getString(6), rs.getInt(7)));
            }
            return khach;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static List<KhachHang_model> searchKhach(String key) {
        List<KhachHang_model> khach = new ArrayList<>();
        String sql = "select * from khachHang where sdt like concat ('%',?,'%') or hoten like concat ('%',?,'%')";
        ResultSet rs = JDBC_Helper.selectTQ(sql,key,key);
        try {
            while (rs.next()) {
                khach.add(new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5),rs.getString(6), rs.getInt(7)));
            }
            return khach;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KhachHang_model selectByID(String id) {
        KhachHang_model khach = null;
        String sql = "select * from khachHang where sdt = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                khach = (new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5),rs.getString(6),rs.getInt(7)));
            }
            return khach;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int addKhach(KhachHang_model khach){
        String sql = "INSERT INTO khachHang (sdt,HoTen,Mail,TienTichLuy,DiaChi,NgaySinh,GioiTinh) VALUES (?,?,?,?,?,?,?)";
        return JDBC_Helper.UpdateTQ(sql, khach.getSDT(),khach.getHoTen(),khach.getMail(),khach.getTienTichLuy(),khach.getDiaChi(),khach.getNgaySing(),khach.getGioiTinh());
    }
    public static int updateKhach(KhachHang_model khach){
        String sql = "update khachHang set sdt = ?, hoTen = ?, mail = ?, tienTichLuy = ?, diaChi = ?,ngaySinh = ?,gioiTinh = ?  where sdt = ?";
        return JDBC_Helper.UpdateTQ(sql,khach.getSDT(), khach.getHoTen(),khach.getMail(),khach.getTienTichLuy(),khach.getDiaChi(),khach.getNgaySing(),khach.getGioiTinh(),khach.getSDT());
    }
    public static int deleteKhach(String sdt){
        String sql = "DELETE FROM khachHang where sdt = ?";
        return JDBC_Helper.UpdateTQ(sql, sdt);
    }
    public static void main(String[] args) {
//        KhachHang_model kh = selectByID(0);
//        System.out.println(kh);
    }
}
