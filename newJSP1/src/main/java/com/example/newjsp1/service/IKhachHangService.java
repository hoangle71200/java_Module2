package com.example.newjsp1.service;

import com.example.newjsp1.model.KhachHang;

import java.util.List;

public interface IKhachHangService {
    //CRUD - sort - search
    //Validate

    List<KhachHang> findAll();

    void save(KhachHang khachHang);
}
