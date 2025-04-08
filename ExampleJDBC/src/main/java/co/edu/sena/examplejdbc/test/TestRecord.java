package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Record;
import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Fecha: 20/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: probar consultas/transacciones en la tabla de record
 */

public class TestRecord {

    public static void main(String[] args) {
        DBEmployee dbe = new DBEmployee();
        DBRecord dbr = new DBRecord();
        DBKey dBKey = new DBKey();
        Employee employee_id = dbe.findById(6835); // Obtener el ID del empleado
        Key key_id = dBKey.findById(2); // Obtener el id de la key

        // Insertar
        Record record = new Record(0, "2025-03-20", "10:00", "10:10", employee_id, key_id, "ENTREGADO");
//        dbr.insert(record);

        // Actualizar
//        Record record = new Record(4, "2025-03-20", "12:00", null, employee_id, key_id, "PENDIENTE");
//        dbr.update(record);
        // Eliminar
//        dbr.delete(3);

        // Consultar todos
        System.out.println("**************** GENERAL ************************");
        List<Record> listRecords = dbr.findAll();
        for (Record e : listRecords) {
            System.out.println("id: " + e.getId()
                    + "\ndate_record: " + e.getDateRecord()
                    + "\nstart_time: " + e.getStartTime()
                    + "\nend_time: " + e.getEndTime()
                    + "\nemployee_id: " + e.getEmployeeId().getDocument()
                    + "\nkey_id: " + e.getKeyId().getId()
                    + "\nstatus: " + e.getStatus());
            System.out.println("------------");
        }

        // Consultar por id
        System.out.println("****************** POR ID **********************");
        Record recById = dbr.findById(11);
        System.out.println("id: " + recById.getId()
                + "\ndate_record: " + recById.getDateRecord()
                + "\nstart_time: " + recById.getStartTime()
                + "\nend_time: " + recById.getEndTime()
                + "\nemployee_id: " + recById.getEmployeeId().getDocument()
                + "\nkey_id: " + recById.getKeyId().getId()
                + "\nstatus: " + recById.getStatus());
        System.out.println("------------");
    }
}
