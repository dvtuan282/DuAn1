/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DanhMuc_model;
import Repository.DanhMuc_repository;
import Service_impl.DanhMuc_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class DanhMuc_Service implements DanhMuc_impl{
    DanhMuc_repository danhMuc_Repo;
    public DanhMuc_Service() {
        danhMuc_Repo = new DanhMuc_repository();
    }

    @Override
    public List<DanhMuc_model> selectDM() {
        return danhMuc_Repo.selectDM();
    }

    @Override
    public DanhMuc_model selectByID(int id) {
        return danhMuc_Repo.selectByID(id);
    }

    @Override
    public int addDM(DanhMuc_model dm) {
        return danhMuc_Repo.addDM(dm);
    }

    @Override
    public int updateDM(DanhMuc_model dm) {
        return danhMuc_Repo.updateDM(dm);
    }

    @Override
    public int deleteDM(String id) {
        return danhMuc_Repo.deleteDM(id);
    }

    @Override
    public List<DanhMuc_model> search(String keyWord) {
        return danhMuc_Repo.search(keyWord);
    }
    
}
