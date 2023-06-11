/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class HoaDon_model {

    private String maHD;
    private KhachHang_model khachHang;
    private NhanVien_model nhanVien;
    private String ngayTao;
    private float tongTien;
    private float tienChietKhau;
    private float tienThuong;
    private float tienThanhToan;
    private int trangThai;

    public HoaDon_model() {
    }

    public HoaDon_model(String maHD, KhachHang_model khachHang, NhanVien_model nhanVien, String ngayTao, float tongTien, float tienChietKhau, float tienThuong, float tienThanhToan, int trangThai) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.tienChietKhau = tienChietKhau;
        this.tienThuong = tienThuong;
        this.tienThanhToan = tienThanhToan;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public KhachHang_model getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang_model khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien_model getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien_model nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTienChietKhau() {
        return tienChietKhau;
    }

    public void setTienChietKhau(float tienChietKhau) {
        this.tienChietKhau = tienChietKhau;
    }

    public float getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(float tienThuong) {
        this.tienThuong = tienThuong;
    }

    public float getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(float tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDon_model{" + "maHD=" + maHD + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", ngayTao=" + ngayTao + ", tongTien=" + tongTien + ", tienChietKhau=" + tienChietKhau + ", tienThuong=" + tienThuong + ", tienThanhToan=" + tienThanhToan + ", trangThai=" + trangThai + '}';
    }

   
}
