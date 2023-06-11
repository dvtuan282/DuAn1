/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Size_model;
import Repository.MauSac_repository;
import Repository.Size_repository;
import Service_impl.Size_impl;
import java.util.List;

/**
 *
 * @author tuan0
 */
public class Size_Service implements Size_impl {

    Size_repository size_repo;

    public Size_Service() {
        size_repo = new Size_repository();
    }

    @Override
    public List<Size_model> selectSize() {
        return size_repo.selectSize();
    }

    @Override
    public Size_model selectByID(int id) {
        return size_repo.selectByID(id);
    }

    @Override
    public int addSize(Size_model size) {
        return size_repo.addSize(size);
    }

    @Override
    public int updateSize(Size_model size) {
        return size_repo.updateSize(size);
    }

    @Override
    public int deleteSize(String id) {
        return size_repo.deleteSize(id);
    }

}
