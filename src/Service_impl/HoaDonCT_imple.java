/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.HoaDonChiTiet_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface HoaDonCT_imple {

    List<HoaDonChiTiet_model> selectHoaDon(String maHD);

    HoaDonChiTiet_model selectID(int id);

    int AddHoaDonCT(HoaDonChiTiet_model hdct);

    int UpdateHDCT(HoaDonChiTiet_model hdct);

    int DeleteHDCT(int id);
}
