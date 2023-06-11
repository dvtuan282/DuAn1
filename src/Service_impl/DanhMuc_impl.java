/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.DanhMuc_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface DanhMuc_impl {

    List<DanhMuc_model> selectDM();

    DanhMuc_model selectByID(int id);

    int addDM(DanhMuc_model dm);

    int updateDM(DanhMuc_model dm);

    int deleteDM(String id);
    
    List<DanhMuc_model> search(String keyWord);
}
