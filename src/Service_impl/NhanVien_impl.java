/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.NhanVien_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface NhanVien_impl {

    List<NhanVien_model> selectNhanVien();

    List<NhanVien_model> searchNhanVien(String keyWord);

    NhanVien_model selectByID(String sdt);

    int addNhanVien(NhanVien_model nv);

    int updateNhanVien(NhanVien_model nv);

    int deleteNhanVien(String sdt);

    NhanVien_model loginNV(String sdt, String ma);
}
