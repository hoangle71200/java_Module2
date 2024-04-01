package com.example.newjsp1.model;

import java.time.LocalDate;
import java.util.Date;

public class KhachHang {
    private int id;
    private String name;
    private String ngaysinh;
    private String diachi;
    private String anh;

    public KhachHang() {
    }

    public KhachHang(int id, String name, String ngaysinh, String diachi, String anh) {
        this.id = id;
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.anh = anh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
