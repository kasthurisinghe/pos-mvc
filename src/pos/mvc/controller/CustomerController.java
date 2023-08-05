/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.db.DBConnection;
import pos.mvc.modle.CutomerModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CustomerController {

    public String saveCustomer(CutomerModel customer) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customer.getCustId());
        preparedStatement.setString(2, customer.getTitle());
        preparedStatement.setString(3, customer.getName());
        preparedStatement.setString(4, customer.getDob());
        preparedStatement.setDouble(5, customer.getSalary());
        preparedStatement.setString(6, customer.getAddress());
        preparedStatement.setString(7, customer.getCity());
        preparedStatement.setString(8, customer.getProvince());
        preparedStatement.setString(9, customer.getZip());
        if (preparedStatement.executeUpdate() > 0) {
            return "Sucess";
        } else {
            return "Failure";
        }
    }

    public ArrayList<CutomerModel> getAllCustomers() throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT*FROM customer";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rst = statement.executeQuery();
        ArrayList<CutomerModel> customerModels = new ArrayList<>();
        while (rst.next()) {
            CutomerModel cm = new CutomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            customerModels.add(cm);
        }
        return customerModels;
    }

    public CutomerModel getCustomer(String custId) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String query = "SELECT*FROM customer WHERE custId=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, custId);

        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            CutomerModel cm = new CutomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            return cm;
        }
        return null;
    }

    public String updateCustomer(CutomerModel customerModel) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String query = "UPDATE customer SET CustTitle=?,CustName=?,DOB=?,Salary=?,CustAddress=?,City=?,Province=?, PostalCode=? WHERE CustId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        
        preparedStatement.setString(9, customerModel.getCustId());
        preparedStatement.setString(1, customerModel.getTitle());
        preparedStatement.setString(2, customerModel.getName());
        preparedStatement.setString(3, customerModel.getDob());
        preparedStatement.setDouble(4, customerModel.getSalary());
        preparedStatement.setString(5, customerModel.getAddress());
        preparedStatement.setString(6, customerModel.getCity());
        preparedStatement.setString(7, customerModel.getProvince());
        preparedStatement.setString(8, customerModel.getZip());
        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
