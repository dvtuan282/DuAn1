/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KhuyenMai_model;
import Model.Loai_model;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class KhuyenMai_repository {

    public static List<KhuyenMai_model> selectKhuyenMai() {
        List<KhuyenMai_model> khuyenMai = new ArrayList<>();
        String sql = "SELECT khuyenmai.ID,KHUYENMAI.TENKHUYENMAI,khuyenmai.NGAYBD,khuyenmai.NGAYKT,LOAI.ID,LOAI.TENlOAI, khuyenmai.TRANGTHAI FROM khuyenmai left JOIN LOAI ON KHUYENMAI.LOAI = LOAI.ID";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                khuyenMai.add(new KhuyenMai_model(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), loai, rs.getInt(7)));
            }
            return khuyenMai;
        } catch (SQLException ex) {
            return null;
        }
    }
    public static KhuyenMai_model selectByID(int id) {
        KhuyenMai_model km = null;
        String sql = "SELECT khuyenmai.ID,KHUYENMAI.TENKHUYENMAI,khuyenmai.NGAYBD,khuyenmai.NGAYKT,LOAI.ID,LOAI.TENlOAI, khuyenmai.TRANGTHAI FROM khuyenmai left JOIN LOAI ON KHUYENMAI.LOAI = LOAI.ID where id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                km =new KhuyenMai_model(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), loai, rs.getInt(7));
            }
            return km;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static void main(String[] args) {
        List<KhuyenMai_model> lisst = selectKhuyenMai();
        for (KhuyenMai_model khuyenMai_model : lisst) {
            System.out.println(khuyenMai_model.toString());
        }
        }
}
