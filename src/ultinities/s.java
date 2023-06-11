/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultinities;

/**
 *
 * @author tuan0
 */
public class s {
    private static int id;
    private String ten;

    public s() {
    id++;
    }
    
    public s(String ten) {
        this.ten = ten;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        s.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String xuta(){
        return id +" " + ten;
    }
    
    
    
    
    
}
