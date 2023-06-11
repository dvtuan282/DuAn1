/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhachHang_model;
import Repository.KhachHang_repository;
import Service_impl.khachHang_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class KhachHang_service implements khachHang_impl{
    KhachHang_repository khachHang_repo;

    public KhachHang_service() {
    khachHang_repo = new KhachHang_repository();
    }

    @Override
    public List<KhachHang_model> selectKhach() {
        return khachHang_repo.selectKhach();
    }

    @Override
    public KhachHang_model selectByID(String id) {
        return khachHang_repo.selectByID(id);
    }

    @Override
    public int addKhach(KhachHang_model khach) {
        return khachHang_repo.addKhach(khach);
    }

    @Override
    public int updateKhach(KhachHang_model khach) {
        return khachHang_repo.updateKhach(khach);
    }

    @Override
    public int deleteKhach(String sdt) {
        return khachHang_repo.deleteKhach(sdt);
    }

    @Override
    public List<KhachHang_model> searchKhach(String key) {
        return khachHang_repo.searchKhach(key);
    }
    
}
