/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDonChiTiet_model;
import Repository.HoaDonChiTiet_repository;
import Service_impl.HoaDonCT_imple;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class HoaDonCT_service implements HoaDonCT_imple{
    HoaDonChiTiet_repository hdct_repo;

    public HoaDonCT_service() {
        hdct_repo = new HoaDonChiTiet_repository();
    }

    @Override
    public List<HoaDonChiTiet_model> selectHoaDon(String maHD) {
        return hdct_repo.selectHoaDon(maHD);
    }

    public HoaDonChiTiet_model selectID(int id) {
        
        return hdct_repo.selectID(id);
    }

    @Override
    public int AddHoaDonCT(HoaDonChiTiet_model hdct) {
        return hdct_repo.AddHoaDonCT(hdct);
    }

    @Override
    public int UpdateHDCT(HoaDonChiTiet_model hdct1) {
        return hdct_repo.UpdateHDCT(hdct1);
    }

    @Override
    public int DeleteHDCT(int id) {
        return hdct_repo.DeleteHDCT(id);
    }

//   

}
