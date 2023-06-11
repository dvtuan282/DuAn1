/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.MauSac_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface MauSac_impl {

    List<MauSac_model> selectMau();

    MauSac_model selectByID(int id);

    int addMau(MauSac_model mau);

    int updateMau(MauSac_model mau);

    int deleteDM(String id);
}
