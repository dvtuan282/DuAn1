/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class KhuyenMai_model {
    private int id;
    private String tenKhuyenMai;
    private String ngayBD,ngayKT;
    private Loai_model loai;
    private int trangThai;

    public KhuyenMai_model() {
    }

    public KhuyenMai_model(int id, String tenKhuyenMai, String ngayBD, String ngayKT, Loai_model loai, int trangThai) {
        this.id = id;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.loai = loai;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public Loai_model getLoai() {
        return loai;
    }

    public void setLoai(Loai_model loai) {
        this.loai = loai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhuyenMai_model{" + "id=" + id + ", tenKhuyenMai=" + tenKhuyenMai + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + ", loai=" + loai + ", trangThai=" + trangThai + '}';
    }
    
    
}
