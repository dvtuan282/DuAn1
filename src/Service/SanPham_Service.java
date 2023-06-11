/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham_model;
import Repository.sanPham_repository;
import Service_impl.SanPham_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class SanPham_Service implements SanPham_impl {

    sanPham_repository sanPham_repo;

    public SanPham_Service() {
        sanPham_repo = new sanPham_repository();
    }

    @Override
    public List<SanPham_model> selectSP() {
        return sanPham_repo.selectSP();
    }

    @Override
    public List<SanPham_model> searchSanPham(String keyWord) {
        return sanPham_repo.searchSanPham(keyWord);
    }

    @Override
    public SanPham_model selectByID(int idSP) {
        return sanPham_repo.selectByID(idSP);
    }

    @Override
    public int updateDM(SanPham_model sp) {
        return sanPham_repo.updateDM(sp);
    }

    @Override
    public int deleteDM(String id) {
        return sanPham_repo.deleteDM(id);
    }

    @Override
    public int addSanPham(SanPham_model sp) {
        return sanPham_repo.addSanPham(sp);
    }

    @Override
    public int updateSL(SanPham_model sp) {
        return sanPham_repo.updateSL(sp);
    }

    @Override
    public List<SanPham_model> searchSanPhamByChiTiet(String danhMucS) {
        return sanPham_repo.searchSanPhamByChiTiet(danhMucS);

    }

}
