/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class NhanVien_model {

    private String SDT;
    private String hoTen;
    private String matKhau;
    private String diaChi;
    private String Email;
    private String anh;
    private String ngaySinh;
    private int gioiTinh;
    private int vaiTro;
    private int trangThai;

    public NhanVien_model() {
    }

    public NhanVien_model(String SDT, String hoTen, String matKhau, String diaChi, String Email, String anh, String ngaySinh, int gioiTinh, int vaiTro, int trangThai) {
        this.SDT = SDT;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.Email = Email;
        this.anh = anh;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien_model{" + "SDT=" + SDT + ", hoTen=" + hoTen + ", matKhau=" + matKhau + ", diaChi=" + diaChi + ", Email=" + Email + ", anh=" + anh + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", vaiTro=" + vaiTro + ", trangThai=" + trangThai + '}';
    }

}
