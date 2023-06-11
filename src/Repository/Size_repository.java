/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Model.Size_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class Size_repository {
      public static List<Size_model> selectSize() {
        List<Size_model> size = new ArrayList<>();
        String sql = "select * from Size";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                size.add(new Size_model(rs.getInt(1), rs.getString(2)));
            }
            return size;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Size_model selectByID(int id) {
        Size_model size = null;
        String sql = "select * from size where id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, id);
        try {
            while (rs.next()) {
                size = new Size_model(rs.getInt(1), rs.getString(2));
            }
            return size;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int addSize(Size_model size){
        String sql = "INSERT INTO size (id,tenSize) VALUES (?,?)";
        return JDBC_Helper.UpdateTQ(sql, size.getId(),size.getSoSize());
    }
    public static int updateSize(Size_model size){
        String sql = "update size set tenSize = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql,size.getSoSize(),size.getId());
    }
    public static int deleteSize(String id){
        String sql = "DELETE FROM size where id = ?";
        return JDBC_Helper.UpdateTQ(sql, id);
    }
    public static void main(String[] args) {
        Size_model dm = selectByID(2);
        System.out.println(dm.toString());
    }

}
