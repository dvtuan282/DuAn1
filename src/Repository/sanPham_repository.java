/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.DanhMuc_model;
import Model.Loai_model;
import Model.MauSac_model;
import Model.SanPham_model;
import Model.Size_model;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ultinities.JDBC_Helper;

/**
 *
 * @author tuan0
 */
public class sanPham_repository {

    public static List<SanPham_model> selectSP() {
        List<SanPham_model> sanPham = new ArrayList<>();
        String sql = "SELECT sanpham.id, sanpham.tensanpham,danhmuc.id,danhmuc.TENDANHMUC,loai.id, loai.TENLOAI, mau.id, mau.TENMAU, size.id, size.TENSIZE,sanpham.giaNhap,sanpham.giaban,sanpham.soluong,sanpham.anh,sanpham.trangthai from sanPham  left join danhmuc on sanpham.danhmuc = danhmuc.id left join loai on sanpham.loai = loai.id left join mau  on sanpham.mau = mau.id left join size on sanpham.size = size.id ";
        ResultSet rs = JDBC_Helper.selectTQ(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                DanhMuc_model danhmuc = new DanhMuc_model(rs.getInt(3), rs.getString(4));
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                MauSac_model mau = new MauSac_model(rs.getInt(7), rs.getString(8));
                Size_model size = new Size_model(rs.getInt(9), rs.getString(10));
                sanPham.add(new SanPham_model(id, ten, danhmuc, loai, mau, size, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15)));
            }
            return sanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static List<SanPham_model> selectSPM(float a, float b) {
        List<SanPham_model> sanPham = new ArrayList<>();
        String sql = "SELECT sanpham.id, sanpham.tensanpham,danhmuc.id,danhmuc.TENDANHMUC,loai.id, loai.TENLOAI, mau.id, mau.TENMAU, size.id, size.TENSIZE,sanpham.giaNhap,sanpham.giaban,sanpham.soluong,sanpham.anh,sanpham.trangthai from sanPham  left join danhmuc on sanpham.danhmuc = danhmuc.id left join loai on sanpham.loai = loai.id left join mau  on sanpham.mau = mau.id left join size on sanpham.size = size.id where giaNhap between ?  and ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql,a,b);
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                DanhMuc_model danhmuc = new DanhMuc_model(rs.getInt(3), rs.getString(4));
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                MauSac_model mau = new MauSac_model(rs.getInt(7), rs.getString(8));
                Size_model size = new Size_model(rs.getInt(9), rs.getString(10));
                sanPham.add(new SanPham_model(id, ten, danhmuc, loai, mau, size, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15)));
            }
            return sanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<SanPham_model> searchSanPham(String keyWord) {
        List<SanPham_model> sanPham = new ArrayList<>();
        String sql = "SELECT sanpham.id, sanpham.tensanpham,danhmuc.id,danhmuc.TENDANHMUC,loai.id, loai.TENLOAI, mau.id, mau.TENMAU, size.id, size.TENSIZE,sanpham.giaNhap,sanpham.giaban,sanpham.soluong,sanpham.anh,sanpham.trangthai from sanPham  left join danhmuc on sanpham.danhmuc = danhmuc.id left join loai on sanpham.loai = loai.id left join mau  on sanpham.mau = mau.id left join size on sanpham.size = size.id where sanpham.tensanpham like concat('%',?,'%')";
        ResultSet rs = JDBC_Helper.selectTQ(sql, keyWord);
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                DanhMuc_model danhmuc = new DanhMuc_model(rs.getInt(3), rs.getString(4));
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                MauSac_model mau = new MauSac_model(rs.getInt(7), rs.getString(8));
                Size_model size = new Size_model(rs.getInt(9), rs.getString(10));
                sanPham.add(new SanPham_model(id, ten, danhmuc, loai, mau, size, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15)));
            }
            return sanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<SanPham_model> searchSanPhamByChiTiet(String danhMucS) {
        List<SanPham_model> sanPham = new ArrayList<>();
        String sql = "SELECT sanpham.id, sanpham.tensanpham,danhmuc.id,danhmuc.TENDANHMUC,loai.id, loai.TENLOAI, mau.id, mau.TENMAU, size.id, size.TENSIZE,sanpham.giaNhap,sanpham.giaban,sanpham.soluong,sanpham.anh,sanpham.trangthai from sanPham  left join danhmuc on sanpham.danhmuc = danhmuc.id left join loai on sanpham.loai = loai.id left join mau  on sanpham.mau = mau.id left join size on sanpham.size = size.id where danhmuc.TENDANHMUC =?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, danhMucS);

        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                DanhMuc_model danhmuc = new DanhMuc_model(rs.getInt(3), rs.getString(4));
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                MauSac_model mau = new MauSac_model(rs.getInt(7), rs.getString(8));
                Size_model size = new Size_model(rs.getInt(9), rs.getString(10));
                sanPham.add(new SanPham_model(id, ten, danhmuc, loai, mau, size, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15)));
            }
            return sanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static SanPham_model selectByID(int idSP) {
        SanPham_model sanPham = null;
        String sql = "SELECT sanpham.id, sanpham.tensanpham,danhmuc.id,danhmuc.TENDANHMUC,loai.id, loai.TENLOAI, mau.id, mau.TENMAU, size.id, size.TENSIZE,sanpham.giaNhap,sanpham.giaban,sanpham.soluong,sanpham.anh,sanpham.trangthai from sanPham  left join danhmuc on sanpham.danhmuc = danhmuc.id left join loai on sanpham.loai = loai.id left join mau  on sanpham.mau = mau.id left join size on sanpham.size = size.id where sanpham.id = ?";
        ResultSet rs = JDBC_Helper.selectTQ(sql, idSP);
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                DanhMuc_model danhmuc = new DanhMuc_model(rs.getInt(3), rs.getString(4));
                Loai_model loai = new Loai_model(rs.getInt(5), rs.getString(6));
                MauSac_model mau = new MauSac_model(rs.getInt(7), rs.getString(8));
                Size_model size = new Size_model(rs.getInt(9), rs.getString(10));
                sanPham = new SanPham_model(id, ten, danhmuc, loai, mau, size, rs.getFloat(11), rs.getFloat(12), rs.getInt(13), rs.getString(14), rs.getInt(15));
            }
            return sanPham;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int addSanPham(SanPham_model sp) {
        String sql = "INSERT INTO sanpham (ID, TENSANPHAM, DANHMUC,LOAI,MAU,SIZE,GIANHAP,GIABAN,SOLUONG,ANH,TRANGTHAI) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.UpdateTQ(sql, sp.getId(), sp.getTenSanPham(), sp.getDanhMuc().getMaDanhMuc(), sp.getLoai().getId(), sp.getMau().getId(), sp.getSize().getId(), sp.getGiaNhap(), sp.getGiaBan(), sp.getSoLuong(), sp.getAnh(), sp.getTrangThai());
    }

    public static int updateDM(SanPham_model sp) {
        String sql = "update sanPham set tenSanPham = ?, danhmuc = ?, loai = ?, mau = ?, size = ?, giaNhap = ?, giaBan = ?, soLuong = ?, anh = ?, trangthai = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql, sp.getTenSanPham(), sp.getDanhMuc().getMaDanhMuc(), sp.getLoai().getId(), sp.getMau().getId(), sp.getSize().getId(), sp.getGiaNhap(), sp.getGiaBan(), sp.getSoLuong(), sp.getAnh(), sp.getTrangThai(), sp.getId());
    }

    public static int updateSL(SanPham_model sp) {
        String sql = "update sanPham set soLuong = ? where id = ?";
        return JDBC_Helper.UpdateTQ(sql, sp.getSoLuong(), sp.getId());
    }

    public static int deleteDM(String id) {
        String sql = "DELETE FROM sanPham where id = ? ";
        return JDBC_Helper.UpdateTQ(sql, id);
    }

    public static void main(String[] args) {
       List<SanPham_model> sp = selectSPM(1, 4);
        for (SanPham_model sanPham_model : sp) {
            System.out.println(sanPham_model.toString());
        }
    }
}
