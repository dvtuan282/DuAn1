/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class SanPham_model {
    private int id;
    private String tenSanPham;
    private DanhMuc_model danhMuc;
    private Loai_model loai;
    private MauSac_model mau;
    private Size_model size;
    private float giaNhap;
    private float giaBan;
    private int soLuong;
    private String anh;
    private int trangThai;

    public SanPham_model() {
    }

    public SanPham_model(int id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }
    
    public SanPham_model(int id, String tenSanPham, DanhMuc_model danhMuc, Loai_model loai, MauSac_model mau, Size_model size, float giaNhap, float giaBan, int soLuong, String anh, int trangThai) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.danhMuc = danhMuc;
        this.loai = loai;
        this.mau = mau;
        this.size = size;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.anh = anh;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public DanhMuc_model getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc_model danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Loai_model getLoai() {
        return loai;
    }

    public void setLoai(Loai_model loai) {
        this.loai = loai;
    }

    public MauSac_model getMau() {
        return mau;
    }

    public void setMau(MauSac_model mau) {
        this.mau = mau;
    }

    public Size_model getSize() {
        return size;
    }

    public void setSize(Size_model size) {
        this.size = size;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham_model{" + "id=" + id + ", tenSanPham=" + tenSanPham + ", danhMuc=" + danhMuc + ", loai=" + loai + ", mau=" + mau + ", size=" + size + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", soLuong=" + soLuong + ", anh=" + anh + ", trangThai=" + trangThai + '}';
    }
    
    
}
