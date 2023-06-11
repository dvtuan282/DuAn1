/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.MauSac_model;
import Repository.MauSac_repository;
import Service_impl.MauSac_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class MauSac_Service implements MauSac_impl{
    MauSac_repository mauSac_repo;

    public MauSac_Service() {
        mauSac_repo = new MauSac_repository();
    }

    @Override
    public List<MauSac_model> selectMau() {
        return mauSac_repo.selectMau();
    }

    @Override
    public MauSac_model selectByID(int id) {
        return mauSac_repo.selectByID(id);
    }

    @Override
    public int addMau(MauSac_model mau) {
        return mauSac_repo.addMau(mau);
    }

    @Override
    public int updateMau(MauSac_model mau) {
        return mauSac_repo.updateMau(mau);
    }

    @Override
    public int deleteDM(String id) {
        return mauSac_repo.deleteDM(id);
    }
    
    
}
