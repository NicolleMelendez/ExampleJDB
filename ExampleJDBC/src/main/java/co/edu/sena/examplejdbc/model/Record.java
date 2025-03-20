/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.model;

import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author Nicolle
 */
public class Record {
    private int id;
    private Date date_record;
    private Time start_time;
    private Time end_time;
    private int employee_id;
    private int key_id;
    private String status;

    public Record() {
    }

    public Record(int id, Date date_record, Time start_time, Time end_time, int employee_id, int key_id, String status) {
        this.id = id;
        this.date_record = date_record;
        this.start_time = start_time;
        this.end_time = end_time;
        this.employee_id = employee_id;
        this.key_id = key_id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_record() {
        return date_record;
    }

    public void setDate_record(Date date_record) {
        this.date_record = date_record;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getKey_id() {
        return key_id;
    }

    public void setKey_id(int key_id) {
        this.key_id = key_id;
    }
    
    
}
