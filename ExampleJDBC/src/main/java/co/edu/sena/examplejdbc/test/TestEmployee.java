package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import java.util.List;

/**
 * Fecha: 19/03/2025
 *
 * @author Juan Diego Orrego Vargas Objetivo: probar consultas/transacciones en
 * la tabla de employee
 */
public class TestEmployee {

    public static void main(String[] args) {
        DBEmployee dbe = new DBEmployee();
        // Insertar
        EmployeeType typeId = new EmployeeType(); // Se crea typeId para el empleado insertado
        typeId.setId(4); // Guarda

        Employee employee = new Employee(6844, "ELSA BROSON", "Cra 28B 30", "31054548", typeId);
//      dbe.insert(employee);

//      dbe.update(employee);

//        dbe.delete(6844);
        
        // Consultar todos
        System.out.println("****************************************");
        List<Employee> listEmployees = dbe.findAll();
        for (Employee e : listEmployees) {
            System.out.println("document: " + e.getDocument()
                    + "\nfullname: " + e.getFullname()
                    + "\ndireccion: " + e.getAddress()
                    + "\ntelefono: " + e.getPhone()
                    + "\ntype: " + e.getEmployeeType().getDescript());
            System.out.println("------------");
        }
        
        // Consultar por id
        System.out.println("****************************************");
        Employee employee1 = dbe.findById(6818);
        System.out.println("document: " + employee1.getDocument() +
                           "\nfullname: " + employee1.getFullname() +
                           "\ndireccion: " + employee1.getAddress() +
                           "\ntelefono: " + employee1.getPhone() +
                           "\ntype: " + employee1.getEmployeeType().getDescript());
    }
}
