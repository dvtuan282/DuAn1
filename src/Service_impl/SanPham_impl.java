/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.SanPham_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface SanPham_impl {

    List<SanPham_model> selectSP();

    List<SanPham_model> searchSanPham(String keyWord);

    SanPham_model selectByID(int idSP);

    int updateDM(SanPham_model sp);

    int deleteDM(String id);

    int addSanPham(SanPham_model sp);

    int updateSL(SanPham_model sp);

    List<SanPham_model> searchSanPhamByChiTiet(String danhMucS);
    
    
}
