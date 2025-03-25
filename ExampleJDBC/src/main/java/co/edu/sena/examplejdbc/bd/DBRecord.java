package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.model.Record;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 20/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Permite consultas y transacciones en la tabla record
 */

public class DBRecord extends DBConnection {
    public void insert(Record record) {
        try {
            connect();
            String sql = "INSERT INTO record (date_record, start_time, end_time, employee_id, key_id, status)"
                       + " VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, record.getDateRecord());
            preparedStatement.setString(2, record.getStartTime());
            preparedStatement.setString(3, record.getEndTime());
            preparedStatement.setLong(4, record.getEmployeeId().getDocument());
            preparedStatement.setInt(5, record.getKeyId().getId());
            preparedStatement.setString(6, record.getStatus());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al insertar el registro " + e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void update(Record record) {
        try {
            connect();
            String sql = "UPDATE record SET date_record = ?, start_time = ?, end_time = ?,"
                    + " employee_id = ?, key_id = ?, status = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, record.getDateRecord());
            preparedStatement.setString(2, record.getStartTime());
            preparedStatement.setString(3, record.getEndTime());
            preparedStatement.setLong(4, record.getEmployeeId().getDocument());
            preparedStatement.setInt(5, record.getKeyId().getId());
            preparedStatement.setString(6, record.getStatus());
            preparedStatement.setInt(7, record.getId());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al actualizar el registro " + e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void delete (int id) {
        try {
            connect();
            String sql = "DELETE FROM record WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al eliminar el registro " + e.getMessage());
            
        } finally {
            disconnect();
        }
    }
    
    public List<Record> findAll() {
        List<Record> results = new ArrayList<>();
        DBEmployee dbe = new DBEmployee();
        DBKey dbk = new DBKey();
        
        try {
            connect();
            String sql = "SELECT * FROM record";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            // .next para recorrer todos los resultados
            while (resultSet.next()) {
                Record record = new Record();
                record.setId(resultSet.getInt("id"));
                record.setDateRecord(resultSet.getString("date_record"));
                record.setStartTime(resultSet.getString("start_time"));
                record.setEndTime(resultSet.getString("end_time"));
                
                Employee employeeId = dbe.findById(resultSet.getLong("employee_id")); // FK
                Key keyId = dbk.findById(resultSet.getInt("key_id"));
                record.setEmployeeId(employeeId);
                record.setKeyId(keyId);
                record.setStatus(resultSet.getString("status"));
                
                results.add(record);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipos de registros " 
                                          + e.getMessage());
        } finally {
            disconnect();
        }
        
        return results;
    }
    
    public Record findById(int id) {
        
        Record record = null;
        DBEmployee dbe = new DBEmployee();
        DBKey dbk = new DBKey();
        
        try {
            connect();
            String sql = "SELECT * FROM record WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // .next para recorrer todos los resultados
            if (resultSet.next()) {
                record = new Record();
                record.setId(resultSet.getInt("id"));
                record.setDateRecord(resultSet.getString("date_record"));
                record.setStartTime(resultSet.getString("start_time"));
                record.setEndTime(resultSet.getString("end_time"));
                
                Employee employeeId = dbe.findById(resultSet.getLong("employee_id")); // FK
                Key keyId = dbk.findById(resultSet.getInt("key_id"));
                record.setEmployeeId(employeeId);
                record.setKeyId(keyId);
                record.setStatus(resultSet.getString("status"));               
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipo de registros " + e.getMessage());
        } finally {
            disconnect();
        }
        
        return record;
    }
}
