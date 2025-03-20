/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;


import co.edu.sena.examplejdbc.bd.DBKey;


import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 *
 * @author Nicolle
 */
public class TestKey {
    public static void main(String[] args) {
        DBKey dbKey = new DBKey();
        //insertar
        Key key = new Key(15, "BICENTENARIO AMBIENTE 05", "Sala 202", 3 , "Sala 206");
        dbKey.insert(key);

                //actualizar
//        key.setId(2);
//        key.setName("SENNOVAA");
//        key.setRoom("RINRIN");
//        key.setCount(6);
//        key.setObservation("LLAVERO CON TRES LLAVES");
//        dbKey.update(key);
        //eliminar
        dbKey.delete(5);
        //consultar todos
        List<Key> listKey = dbKey.findAll();
        for (Key e : listKey) {
            System.out.println("id: " + e.getId() + " name: " + e.getName() + " room: " + e.getRoom() + " count: " + e.getCount() + " observation: " + e.getObservation());
        }

//        //consultar por id
        System.out.println("**************************");
        Key key2 = dbKey.findById(2);
        if(key2 != null){
        System.out.println("id: " + key2.getId() + " name: " + key2.getName() + " room: " + key2.getRoom() + " count: " + key2.getCount() + " observation: " + key2.getObservation());
        }
        else{
            System.out.println("No existe el Key con ese id");
        }
    }
}
    
