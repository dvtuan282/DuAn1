/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Loai_model;
import Repository.Loai_repository;
import Service_impl.Loai_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class Loai_Service implements Loai_impl{
    Loai_repository loai_repo;

    public Loai_Service() {
        loai_repo = new Loai_repository();
    }

    @Override
    public List<Loai_model> selectLoai() {
        return loai_repo.selectLoai();
    }

    @Override
    public Loai_model selectByID(int id) {
        return loai_repo.selectByID(id);
    }

    @Override
    public int addLoai(Loai_model loai) {
        return loai_repo.addLoai(loai);
    }

    @Override
    public int updateLoai(Loai_model loai) {
        return loai_repo.updateLoai(loai);
    }

    @Override
    public int deleteLoai(String id) {
        return loai_repo.deleteLoai(id);
    }
    
}

