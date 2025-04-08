/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas 
 * Objetivo: probar consultas/transacciones en la tabla de key
 */
public class TestKey {

    public static void main(String[] args) {
        DBKey dBKey = new DBKey();
        // Insertar
//      Key key = new Key(5, "SAGRADO", "SALA 202", 4, "Llavero color rojo");
//      dBKey.insert(key);
//
        // Actualizar
//      key.setId(5);
//      key.setName("SAGRADO CORAZON");
//      dBKey.update(key);
        
        // Eliminar
//        dBKey.delete(5);
        
        // Consultar todos
        System.out.println("****************************************");
        List<Key> listKeys = dBKey.findAll();
        for (Key e : listKeys) {
            System.out.println("id: " + e.getId() +
                               "\nname: " + e.getName() +
                               "\nroom: " + e.getRoom() +
                               "\ncount: " + e.getCount() +
                               "\nobservation: " + e.getObservation());
            System.out.println("------------");
        }
        
        // Consultar por id
        System.out.println("****************************************");
        Key key = dBKey.findById(10);
        if (key != null) {
            System.out.println("id: " + key.getId() +
                               "\nname: " + key.getName() +
                               "\nroom: " + key.getRoom() +
                               "\ncount: " + key.getCount() +
                               "\nobservation: " + key.getObservation());    
        } else {
            System.out.println("No existe el empleado con ese id");
        }
    }
}
