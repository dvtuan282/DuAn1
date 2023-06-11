/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.Loai_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface Loai_impl {

    List<Loai_model> selectLoai();

    Loai_model selectByID(int id);

    int addLoai(Loai_model loai);

    int updateLoai(Loai_model loai);

    int deleteLoai(String id);
}
