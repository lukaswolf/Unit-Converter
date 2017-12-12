package pl.lukaszwilk.UnitConverter.models.dao.impl;

import pl.lukaszwilk.UnitConverter.models.MySQLConnector;
import pl.lukaszwilk.UnitConverter.models.Utils;
import pl.lukaszwilk.UnitConverter.models.dao.UserDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
  private MySQLConnector connector = MySQLConnector.getInstance();


    @Override
    public boolean login(String name, String password) {
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT * FROM userUnitConverter WHERE username =? "
            );
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
           if (!resultSet.next()){
               return false;
           }
            return resultSet.getString("password").equals(Utils.shaHash(password));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean register(String name, String password) {
        try {

            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "SELECT * FROM userUnitConverter WHERE username =? "
            );
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return false;
            }


            PreparedStatement preparedStatementInsert = connector.getConnection().prepareStatement(
                    "INSERT INTO userUnitConverter VALUES(?,?,?)"
            );
            preparedStatementInsert.setInt(1,0);
            preparedStatementInsert.setString(2,name);
            preparedStatementInsert.setString(3, Utils.shaHash(password));
            preparedStatementInsert.execute();
            preparedStatement.close();
            preparedStatementInsert.close();
           return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
return false;
    }

    @Override
    public void removeUser(int id) {
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                    "DELETE  FROM userUnitConverter WHERE id =?"
            );
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
