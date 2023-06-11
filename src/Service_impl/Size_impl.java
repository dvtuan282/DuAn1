/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.Size_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface Size_impl {

    List<Size_model> selectSize();

    Size_model selectByID(int id);

    int addSize(Size_model size);

    int updateSize(Size_model size);

    int deleteSize(String id);
}
