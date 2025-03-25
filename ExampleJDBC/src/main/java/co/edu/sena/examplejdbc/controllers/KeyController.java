/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 *
 * @author Nicolle
 */
public class KeyController implements IKeyController{
    
    DBKey dbk = new DBKey();

    @Override
    public void insert(Key key) throws Exception {
        if(key == null){
          throw new Exception("El tipo de llave es mala");
      }  
      if("".equals(key.getName())){
          throw new Exception("El nombre es obligatoria");
      }
      if(key.getCount() < 1){
          throw new Exception("El número de llaves es obligatoria");
      }
      if("".equals(key.getCount())){
          throw new Exception("El conteo es obligatoria");
      }

      
      dbk.insert(key);
        
    }

    @Override
    public void update(Key key) throws Exception {
        if(key == null){
          throw new Exception("El tipo de llave es nula");
      }
        if(key.getId() == 0){
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(key.getName())){
          throw new Exception("El nombre es obligatoria");
        }
        if(key.getCount() < 1){
            throw new Exception("El número de llaves es obligatoria");
        }
        if("".equals(key.getCount())){
          throw new Exception("El conteo es obligatoria");
        }
        
        Key keyExists = dbk.findById(key.getId());
        if(keyExists == null){
            throw new Exception("La llave no existe");
        }
        
        dbk.update(key);
        
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0){
            throw new Exception("El Id es obligatorio");
        }
        
        Key keyExists = dbk.findById(id);
        if(keyExists == null){
            throw new Exception("La llave no existe");
        }
        dbk.delete(id);
        
    }

    @Override
    public List<Key> findAll() throws Exception {
        return dbk.findAll();
    }

    @Override
    public Key findById(int id) throws Exception {
        if(id == 0){
            throw new Exception("El Id es obligatorio");
        }
        return dbk.findById(id);    }
}
