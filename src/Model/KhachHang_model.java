/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class KhachHang_model {

    private String SDT;
    private String hoTen;
    private String mail;
    private float tienTichLuy;
    private String diaChi;
    private String ngaySing;
    private int gioiTinh;

    public KhachHang_model() {
    }

    public KhachHang_model(String SDT, String hoTen, String mail, float tienTichLuy, String diaChi, String ngaySinh, int gioiTinh) {
        this.SDT = SDT;
        this.hoTen = hoTen;
        this.mail = mail;
        this.tienTichLuy = tienTichLuy;
        this.diaChi = diaChi;
        this.ngaySing = ngaySinh;
        this.gioiTinh = gioiTinh;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public float getTienTichLuy() {
        return tienTichLuy;
    }

    public void setTienTichLuy(float tienTichLuy) {
        this.tienTichLuy = tienTichLuy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(String ngaySing) {
        this.ngaySing = ngaySing;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "KhachHang_model{" + "SDT=" + SDT + ", hoTen=" + hoTen + ", mail=" + mail + ", tienTichLuy=" + tienTichLuy + ", diaChi=" + diaChi + ", ngaySing=" + ngaySing + ", gioiTinh=" + gioiTinh + '}';
    }
    
}
