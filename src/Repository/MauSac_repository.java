/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Model.MauSac_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class MauSac_repository {
      public static List<MauSac_model> selectMau() {
        List<MauSac_model> mau = new ArrayList<>();
        String sql = "select * from Mau";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                mau.add(new MauSac_model(rs.getInt(1), rs.getString(2)));
            }
            return mau;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static MauSac_model selectByID(int id) {
        MauSac_model mau = null;
        String sql = "select * from mau where id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                mau = new MauSac_model(rs.getInt(1), rs.getString(2));
            }
            return mau;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int addMau(MauSac_model mau){
        String sql = "INSERT INTO Mau (id,tenMau) VALUES (?,?)";
        return JDBC_Helper.UpdateTQ(sql, mau.getId(),mau.getTenMau());
    }
    public static int updateMau(MauSac_model mau){
        String sql = "update Mau set tenMau = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql, mau.getTenMau(),mau.getId());
    }
    public static int deleteDM(String id){
        String sql = "DELETE FROM Mau where id = ?";
        return JDBC_Helper.UpdateTQ(sql, id);
    }
    public static void main(String[] args) {
        MauSac_model dm = selectByID(2);
        System.out.println(dm.toString());
    }

}
