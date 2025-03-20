/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.BDEmployee;
import co.edu.sena.examplejdbc.bd.DBEmployeeType;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import java.util.List;





/**
 * Fecha: 20/03/2025
 * @author Nicolle
 * Objetivo:
 */
public class TestEmployee {
    public static void main(String[] args) {
        BDEmployee dbe = new BDEmployee();
        DBEmployeeType dbet = new DBEmployeeType();
        //insertar
        EmployeeType employeeType = dbet.findById(1);
        Employee employee = new Employee(111625896, "ELSA BROSÓN", "Av Sa", "310", employeeType);
        //dbe.insert(employee);
        //modificar
        employee.setFullname("ELTON TITO");
        employeeType = dbet.findById(2); //FK
        employee.setEmployeeType(employeeType);
        dbe.update(employee);
        //eliminar
        //dbe.delete(1000000001);
        //consultar todos
        List<Employee> employees = dbe.findAll();
        for (Employee e : employees) {
            System.out.println("document: " +  e.getDocument() + " fullname: " + e.getFullname() + " direccion: " + e.getAddress() + " phone: " + e.getPhone() + "  type: " + e.getEmployeeType().getDescript());
        }
        //consultar por id
        System.out.println("**************************");
        Employee employee2 = dbe.findById(2);
        if(employee2 != null){
        System.out.println("document: " +  employee2.getDocument() + " fullname: " + employee2.getFullname() + " direccion: " + employee2.getAddress() + " phone: " + employee2.getPhone() + "  type: " + employee2.getEmployeeType().getDescript());
        }
        else{
            System.out.println("No existe el EmployeeType con ese id");
        }
    }
}
