package com.example.newjsp1.service;

import com.example.newjsp1.model.KhachHang;
import com.example.newjsp1.repository.IKhachHangRepository;
import com.example.newjsp1.repository.KhachHangRepositoryImpl;

import java.util.List;

public class KhachHangServiceImpl implements IKhachHangService{
    private IKhachHangRepository repository = new KhachHangRepositoryImpl();
    @Override
    public List<KhachHang> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {
        repository.save(khachHang);
    }
}
