/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service_impl;

import Model.HoaDon_model;
import java.util.List;

/**
 *
 * @author tuan0
 */
public interface HoaDon_impl {

    List<HoaDon_model> selectHoaDon();

    int addHoaDon(HoaDon_model hd);

    HoaDon_model selectHoaDonByID(String id);

    int updatetHD(HoaDon_model hd);
    
    int updatetTrangThaiHD(HoaDon_model hd);

}
