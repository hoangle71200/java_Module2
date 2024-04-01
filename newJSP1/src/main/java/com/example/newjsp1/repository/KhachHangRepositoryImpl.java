package com.example.newjsp1.repository;

import com.example.newjsp1.model.KhachHang;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangRepositoryImpl implements IKhachHangRepository{
    private static final String SELECT_ALL_CUSTOMER = "select * from tblkhachhang";

    @Override
    public List<KhachHang> findAll() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null; //nạp lệnh SQL
        ResultSet resultSet = null; //nhận kq trả về từ DB
        List<KhachHang> khachHangList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                resultSet = statement.executeQuery();
                KhachHang khachHang = null;
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString("name");
                    String ngaysinh = resultSet.getString("birthday");
                    String diachi = resultSet.getString("address");
                    String anh = resultSet.getString("image");

                    khachHang = new KhachHang(id, name, ngaysinh, diachi, anh);
                    khachHangList.add(khachHang);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                DBConnection.close();
            }
        }
        return khachHangList;
    }

    @Override
    public void save(KhachHang khachHang) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null; //nạp lệnh SQL

        if (connection != null) {
            try {
                statement = connection.prepareStatement("insert into tblkhachhang(id, name, birthday, address, image) " +
                        "value (?, ?, ?, ?, ?) ");
                statement.setInt(1, khachHang.getId());
                statement.setString(2, khachHang.getName());
                statement.setString(3, khachHang.getNgaysinh());
                statement.setString(4, khachHang.getDiachi());
                statement.setString(5, khachHang.getAnh());
                statement.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                DBConnection.close();
            }
        }
    }
}
