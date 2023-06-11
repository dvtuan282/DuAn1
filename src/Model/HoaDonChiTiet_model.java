/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class HoaDonChiTiet_model {
    private int id;
    private HoaDon_model maHD;
    private SanPham_model sanPham;
    private int soLuong;
    private float tienHang;

    public HoaDonChiTiet_model() {
    }

    public HoaDonChiTiet_model(int id, int soLuong, float tienHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.tienHang = tienHang;
    }
    
    

    public HoaDonChiTiet_model(int id, HoaDon_model maHD, SanPham_model sanPham, int soLuong, float tienHang) {
        this.id = id;
        this.maHD = maHD;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.tienHang = tienHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HoaDon_model getMaHD() {
        return maHD;
    }

    public void setMaHD(HoaDon_model maHD) {
        this.maHD = maHD;
    }

    public SanPham_model getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_model sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getTienHang() {
        return tienHang;
    }

    public void setTienHang(float tienHang) {
        this.tienHang = tienHang;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet_model{" + "id=" + id + ", maHD=" + maHD + ", sanPham=" + sanPham + ", soLuong=" + soLuong + ", tienHang=" + tienHang + '}';
    }
    
    
}