/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.ArrList;
import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author ITSUKA KOTORI
 */
public class Chats extends AbstractEntity{
    
    @CsvBindByName
    private String chats_id;
    
    @CsvBindByName
    private ArrList<String> chats_details_id;

    public String getChats_id() {
        return chats_id;
    }

    public void setChats_id(String chats_id) {
        this.chats_id = chats_id;
    }

    public ArrList<String> getChats_details_id() {
        return chats_details_id;
    }

    public void setChats_details_id(ArrList<String> chats_details_id) {
        this.chats_details_id = chats_details_id;
    }

    @Override
    public boolean isNotNull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean id_equals(Object obj) {
        return this.chats_id.equals(((Chats)obj).chats_id);
    }

    @Override
    public String toString() {
        return "Chats{" + "chats_id=" + chats_id + ", chats_details_id=" + chats_details_id + '}';
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
