
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuan0
 */
public class Size_model {
    private int id;
    private String soSize;

    public Size_model() {
    }

    public Size_model(int id, String soSize) {
        this.id = id;
        this.soSize = soSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoSize() {
        return soSize;
    }

    public void setSoSize(String soSize) {
        this.soSize = soSize;
    }

    @Override
    public String toString() {
        return "Size_model{" + "id=" + id + ", soSize=" + soSize + '}';
    }
    
    
}
