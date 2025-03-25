/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Permite consultas y transacciones en la tabla employee_type
 */

public class DBEmployeeType extends DBConnection {
    public void insert (EmployeeType employeeType) {
        try {
            connect();
            String sql = "INSERT INTO employee_type (descript) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employeeType.getDescript());
            preparedStatement.executeUpdate();
            preparedStatement.close();
                    
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar el tipo de empleado " + 
                                          e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void update (EmployeeType employeeType) {
        try {
            connect();
            String sql = "UPDATE employee_type SET descript = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employeeType.getDescript());
            preparedStatement.setInt(2, employeeType.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
                    
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al actualizar el tipo de empleado " + 
                                          e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void delete (int id) {
        try {
            connect();
            String sql = "DELETE FROM employee_type WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
                    
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al eliminar el tipo de empleado " + 
                                          e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public List<EmployeeType> findAll() {
        List<EmployeeType> results = new ArrayList<>();
        
        try {
            connect();
            String sql = "SELECT * FROM employee_type";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            // .next para recorrer todos los resultados
            while (resultSet.next()) {
                EmployeeType employeeType = new EmployeeType();
                employeeType.setId(resultSet.getInt("id"));
                employeeType.setDescript(resultSet.getString("descript"));
                
                results.add(employeeType);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipos de empleados " 
                                          + e.getMessage());
        } finally {
            disconnect();
        }
        
        return results;
    }
    
    
    public EmployeeType findById(int id) {
        
        EmployeeType employeeType = null;
        
        try {
            connect();
            String sql = "SELECT * FROM employee_type WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // .next para recorrer todos los resultados
            if (resultSet.next()) {
                employeeType = new EmployeeType();
                employeeType.setId(resultSet.getInt("id"));
                employeeType.setDescript(resultSet.getString("descript"));
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipo de empleados " 
                                          + e.getMessage());
        } finally {
            disconnect();
        }
        
        return employeeType;
    }
}
