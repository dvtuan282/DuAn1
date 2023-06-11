/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Loai_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class Loai_repository {

    public static List<Loai_model> selectLoai() {
        List<Loai_model> loai = new ArrayList<>();
        String sql = "select * from loai";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                loai.add(new Loai_model(rs.getInt(1), rs.getString(2)));
            }
            return loai;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Loai_model selectByID(int id) {
        Loai_model loai = null;
        String sql = "select * from loai where id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                loai = new Loai_model(rs.getInt(1), rs.getString(2));
            }
            return loai;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int addLoai(Loai_model loai){
        String sql = "INSERT INTO Loai (id,tenLoai) VALUES (?,?)";
        return JDBC_Helper.UpdateTQ(sql, loai.getId(),loai.getTenLoai());
    }
    public static int updateLoai(Loai_model loai){
        String sql = "update loai set tenLoai = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql,loai.getTenLoai(), loai.getId());
    }
    public static int deleteLoai(String id){
        String sql = "DELETE FROM Loai where id = ?";
        return JDBC_Helper.UpdateTQ(sql, id);
    }
    public static void main(String[] args) {
        List<Loai_model> list = selectLoai();
        for (Loai_model loai_model : list) {
            System.out.println(loai_model.toString());
        }
    }
}
