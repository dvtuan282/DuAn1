/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class MauSac_model {
   private int id;
   private String tenMau;

    public MauSac_model() {
    }

    public MauSac_model(int id, String tenMau) {
        this.id = id;
        this.tenMau = tenMau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    @Override
    public String toString() {
        return "MauSac_model{" + "id=" + id + ", tenMau=" + tenMau + '}';
    }
   
   
   
}
