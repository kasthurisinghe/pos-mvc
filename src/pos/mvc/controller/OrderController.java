/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.util.ArrayList;
import pos.mvc.db.DBConnection;
import pos.mvc.modle.OrderDetailModle;
import pos.mvc.modle.OrderModle;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class OrderController {

    public String placeOrder(OrderModle orderModle, ArrayList<OrderDetailModle> orderdetailModels) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            String orderQuery = "INSERT INTO Orders VALUES(?,?,?)";

            PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
            statementForOrder.setString(1, orderModle.getOrderId());
            statementForOrder.setString(2, orderModle.getOrderDate());
            statementForOrder.setString(3, orderModle.getCustomerId());

            if (statementForOrder.executeUpdate() > 0) {

                boolean isOrderDetailSaved = true;
                String orderDetailQuery = "INSERT INTO orderdetail VALUES(?,?,?,?)";

                for (OrderDetailModle orderDetailModel : orderdetailModels) {
                    PreparedStatement statementForOrderDetail = connection.prepareStatement(orderDetailQuery);
                    statementForOrderDetail.setString(1, orderModle.getOrderId());
                    statementForOrderDetail.setString(2, orderDetailModel.getItemCode());
                    statementForOrderDetail.setInt(3, orderDetailModel.getQty());
                    statementForOrderDetail.setDouble(4, orderDetailModel.getDiscount());

                    if (!(statementForOrderDetail.executeUpdate() > 0)) {
                        isOrderDetailSaved = false;
                    }

                }

                if (isOrderDetailSaved) {
                    boolean isItemUpdated = true;
                    String itemQuery = "UPDATE Item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                    for (OrderDetailModle orderDetailModel : orderdetailModels) {
                        PreparedStatement statmentForItem = connection.prepareStatement(itemQuery);
                        statmentForItem.setInt(1, orderDetailModel.getQty());
                        statmentForItem.setString(2, orderDetailModel.getItemCode());
                        if (!(statmentForItem.executeUpdate() >= 0)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }

                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }

    }
}
