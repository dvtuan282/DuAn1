/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien_model;
import Repository.NhanVien_repository;
import Service_impl.NhanVien_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class NhanVien_service implements NhanVien_impl{

    NhanVien_repository nhanVien_repol;

    public NhanVien_service() {
        nhanVien_repol = new NhanVien_repository();
    }

    @Override
    public List<NhanVien_model> selectNhanVien() {
        return nhanVien_repol.selectNhanVien();
    }

    @Override
    public List<NhanVien_model> searchNhanVien(String keyWord) {
        return nhanVien_repol.searchNhanVien(keyWord);
    }

    @Override
    public NhanVien_model selectByID(String sdt) {
        return nhanVien_repol.selectByID(sdt);
    }

    @Override
    public int addNhanVien(NhanVien_model nv) {
        return nhanVien_repol.addNhanVien(nv);
    }

    @Override
    public int updateNhanVien(NhanVien_model nv) {
        return nhanVien_repol.updateNhanVien(nv);
    }

    @Override
    public int deleteNhanVien(String sdt) {
        return nhanVien_repol.deleteNhanVien(sdt);
    }

    @Override
    public NhanVien_model loginNV(String sdt, String ma) {
        return nhanVien_repol.loginNV(sdt, ma);
    }

}
