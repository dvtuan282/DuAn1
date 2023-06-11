/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultinities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tuan0
 */
public class JDBC_Helper {
    public static ResultSet selectTQ(String sql, Object... parmas) {
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = DBConnect.getConnection();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < parmas.length; i++) {
                pstm.setObject(i + 1, parmas[i]);
            }
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            close(con, rs, pstm);
            return null;
        }
    }

    public static int UpdateTQ(String sql, Object... parmas) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = DBConnect.getConnection();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < parmas.length; i++) {
                pstm.setObject(i + 1, parmas[i]);
            }

            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            close(con, pstm);

            return 0;
        }
    }

    public static void close(Connection con, ResultSet rs, PreparedStatement pstm) {
        try {
            con.close();
            rs.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con, PreparedStatement pstm) {
        try {
            con.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
