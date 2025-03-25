/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.model;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Representa la tabla employee.
 */

public class Employee {
    private long document;
    private String fullname;
    private String address;
    private String phone;
    private EmployeeType employeeType;
    
    public Employee() {
    }

    public Employee(long document, String fullname, String direction, String telephone, EmployeeType type_id) {
        this.document = document;
        this.fullname = fullname;
        this.address = direction;
        this.phone = telephone;
        this.employeeType = type_id;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public long getDocument() {
        return document;
    }

    public void setDocument(long document) {
        this.document = document;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
