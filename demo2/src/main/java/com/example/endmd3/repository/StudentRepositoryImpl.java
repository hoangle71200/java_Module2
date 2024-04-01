package com.example.endmd3.repository;

import com.example.endmd3.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IObjectRepository<Student>{
    private static final String SELECT_ALL_STUDENT = "select * from tblstudent";
    @Override
    public List<Student> findAll() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null; //nạp lệnh SQL
        ResultSet resultSet = null; //nhận kq trả về từ DB
        List<Student> studentList = new ArrayList<>();

        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_ALL_STUDENT);
                resultSet = statement.executeQuery();

                Student student = null;
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString("name");
                    String birthday = resultSet.getString("birthday");
                    String email = resultSet.getString("email");
                    String address = resultSet.getString("address");
                    String phone = resultSet.getString("phone");
                    String classroom = resultSet.getString("classroom");

                    student = new Student(id, name, birthday, email, address, phone, classroom);
                    studentList.add(student);
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

        return studentList;
    }

    @Override
    public void save(Student student) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null; //nạp lệnh SQL

        if (connection != null) {
            try {
                statement = connection.prepareStatement("insert into tblstudent(id, name, birthday, email, address, phone, classroom) " +
                        "value (?, ?, ?, ?, ?, ?, ?) ");
                statement.setInt(1, student.getId());
                statement.setString(2, student.getName());
                statement.setString(3, student.getBirthday());
                statement.setString(4, student.getEmail());
                statement.setString(5, student.getAddress());
                statement.setString(6, student.getPhone());
                statement.setString(7, student.getClassroom());
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

    @Override
    public void update(int id, Student student) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement("update tblstudent set name=?, birthday=?, email=?, address=?, phone=?, classroom=? " +
                        "where id=?");
                statement.setString(1, student.getName());
                statement.setString(2, student.getBirthday());
                statement.setString(3, student.getEmail());
                statement.setString(4, student.getAddress());
                statement.setString(5, student.getPhone());
                statement.setString(6, student.getClassroom());
                statement.setInt(7, id);
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

    @Override
    public void remove(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null; //nạp lệnh SQL
        if (connection != null) {
            try {
                statement = connection.prepareStatement("delete from tblstudent where id=?");
                statement.setInt(1, id);
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

    @Override
    public Student findById(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Student student = null;

        if (connection != null) {
            try {
                statement = connection.prepareStatement("select * from tblstudent where id=?");
                statement.setInt(1, id);
                resultSet = statement.executeQuery();
                resultSet.next();
                int studentId = resultSet.getInt(1);
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classroom = resultSet.getString("classroom");
                student = new Student(studentId, name, birthday, email, address, phone, classroom);

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

        return student;
    }
}
