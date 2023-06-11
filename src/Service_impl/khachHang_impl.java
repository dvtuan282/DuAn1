/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.KhachHang_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface khachHang_impl {

    List<KhachHang_model> selectKhach();

    KhachHang_model selectByID(String id);

    int addKhach(KhachHang_model khach);

    int updateKhach(KhachHang_model khach);

    int deleteKhach(String sdt);

    List<KhachHang_model> searchKhach(String key);
}
