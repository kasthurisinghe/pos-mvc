/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.sql.Connection;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;
import pos.mvc.modle.ItemModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ItemController {

    public ArrayList<ItemModel> getAllItems() throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT*FROM item";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rst = statement.executeQuery();
        ArrayList<ItemModel> itemModels = new ArrayList<>();
        while (rst.next()) {
            ItemModel item = new ItemModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
            itemModels.add(item);
        }
        return itemModels;
    }
}
