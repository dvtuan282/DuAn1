/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.DanhMuc_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class DanhMuc_repository {

    public static List<DanhMuc_model> selectDM() {
        List<DanhMuc_model> danhMuc = new ArrayList<>();
        String sql = "select * from danhMuc";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                danhMuc.add(new DanhMuc_model(rs.getInt(1), rs.getString(2)));
            }
            return danhMuc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static List<DanhMuc_model> search(String keyWord) {
        List<DanhMuc_model> danhMuc = new ArrayList<>();
        String sql = "SELECT * FROM danhMuc where id like concat('%',?,'%')\n" +
        "or TenDanhMuc like concat('%',?,'%')";
        ResultSet rs = JDBC_Helper.selectTQ(sql, keyWord,keyWord);
        try {
            while (rs.next()) {
                danhMuc.add(new DanhMuc_model(rs.getInt(1), rs.getString(2)));
            }
            return danhMuc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static DanhMuc_model selectByID(int id) {
        DanhMuc_model danhMuc = null;
        String sql = "select * from danhMuc where id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                danhMuc = new DanhMuc_model(rs.getInt(1), rs.getString(2));
            }
            return danhMuc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int addDM(DanhMuc_model dm){
        String sql = "INSERT INTO danhMuc (tenDanhMuc) VALUES (?)";
        return JDBC_Helper.UpdateTQ(sql,dm.getTenDanhMuc());
    }
    public static int updateDM(DanhMuc_model dm){
        String sql = "update danhMuc set tenDanhMuc = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql, dm.getTenDanhMuc(), dm.getMaDanhMuc());
    }
    public static int deleteDM(String id){
        String sql = "DELETE FROM danhMuc where id = ? ";
        return JDBC_Helper.UpdateTQ(sql, id);
    }
    public static void main(String[] args) {
        DanhMuc_model dm = selectByID(7);
        System.out.println(dm.toString());
    }
}
