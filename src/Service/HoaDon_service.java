/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon_model;
import Repository.HoaDon_repository;
import Service_impl.HoaDon_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class HoaDon_service implements HoaDon_impl{
    HoaDon_repository hoaDon_repo;

    public HoaDon_service() {
        hoaDon_repo = new HoaDon_repository();
    }

    @Override
    public List<HoaDon_model> selectHoaDon() {
        return hoaDon_repo.selectHoaDon();
    }

    @Override
    public int addHoaDon(HoaDon_model hd) {
        return hoaDon_repo.addHoaDon(hd);
    }

    @Override
    public HoaDon_model selectHoaDonByID(String id) {
        return hoaDon_repo.selectHoaDonByID(id);
    }

    @Override
    public int updatetHD(HoaDon_model hd) {
        return  hoaDon_repo.updatetHD(hd);
   }

    @Override
    public int updatetTrangThaiHD(HoaDon_model hd) {
        return hoaDon_repo.updatetTrangThaiHD(hd);
    }
    
}
