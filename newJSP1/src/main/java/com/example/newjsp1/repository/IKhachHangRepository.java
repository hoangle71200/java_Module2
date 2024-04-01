package com.example.newjsp1.repository;

import com.example.newjsp1.model.KhachHang;

import java.util.List;

public interface IKhachHangRepository {
    List<KhachHang> findAll();
    void save(KhachHang khachHang);
}
