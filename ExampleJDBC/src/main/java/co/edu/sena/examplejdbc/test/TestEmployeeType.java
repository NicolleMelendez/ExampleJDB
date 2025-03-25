/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployeeType;
import co.edu.sena.examplejdbc.model.EmployeeType;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: probar consultas/transacciones en la tabla de employee_type
 */

public class TestEmployeeType {
    public static void main(String[] args) {
        DBEmployeeType dbEmployeeType = new DBEmployeeType();
//        // Insertar
//        EmployeeType employeeType = new EmployeeType(6, "SUBDIRECTOR");
//        dbEmployeeType.insert(employeeType);
        
        // Actualizar
//        employeeType.setId(5);
//        employeeType.setDescript("COORDINADOR");
//        dbEmployeeType.update(employeeType);

        // Eliminar
//        dbEmployeeType.delete(5);

        // Consultar todos
        System.out.println("****************************************");
        List<EmployeeType> listEmployeeTypes = dbEmployeeType.findAll();
        for (EmployeeType e : listEmployeeTypes) {
            System.out.println("id: " + e.getId() + "\ndescript: " + e.getDescript());
            System.out.println("------------");
        }
        
        // Consultar por id
        System.out.println("****************************************");
        EmployeeType employeeType = dbEmployeeType.findById(10);
        if (employeeType != null) {
            System.out.println("id: " + employeeType.getId() + "\ndescript: " +
                                        employeeType.getDescript());    
        } else {
            System.out.println("No existe el empleado con ese id");
        }
        
    }
}
