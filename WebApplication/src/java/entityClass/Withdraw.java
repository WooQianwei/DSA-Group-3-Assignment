/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClass;

import adtClass.ArrList;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvRecurse;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.univocity.parsers.annotations.Parsed;
import enumClass.PaymentStatus;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ITSUKA KOTORI
 */
public class Withdraw extends AbstractEntity<Withdraw> {

    /**
     * withdraw id
     */
    @CsvBindByName
    private String withdraw_id;

    /**
     * user_id
     */
    @CsvBindByName
    private String user_id;

    /**
     * amount
     */
    @CsvBindByName
    private double amout;

    /**
     * date
     */
    @CsvBindByName
    @CsvDate("dd.MM.yyyy.hh.mm.ss")
    private Date date;

    /**
     * status
     */
    @CsvBindByName(column = "payment_status_code")
    private int status;

    /**
     * note
     */
    @CsvBindByName
    private String note;

    public Withdraw() {
    }

    public Withdraw(String withdraw_id) {
        this.withdraw_id = withdraw_id;
    }

    public Withdraw(String withdraw_id, String user_id, double amout, Date date, int status, String note) {
        this.withdraw_id = withdraw_id;
        this.user_id = user_id;
        this.amout = amout;
        this.date = date;
        this.status = status;
        this.note = note;
    }

    public String getWithdraw_id() {
        return withdraw_id;
    }

    public void setWithdraw_id(String withdraw_id) {
        this.withdraw_id = withdraw_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean isNotNull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean split(String rowData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Withdraw{" + "withdraw_id=" + withdraw_id + ", user_id=" + user_id + ", amout=" + amout + ", date=" + date + ", status=" + status + ", note=" + note + '}';
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        try {
            main2();
        } catch (IOException ex) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void testing_one() {

        Withdraw x = new Withdraw("W12334", "ASC1222", 7.80, new Date(), PaymentStatus.Completed.getCode(), "Note");

        ArrList<Withdraw> employees = new ArrList<>();

        employees.add(x);

        try {
            System.out.println(x.getStorageDir());
            try (FileOutputStream fos = new FileOutputStream(x.getStorageDir());
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(employees);
            }
            for (Withdraw w : employees) {
                //System.out.println(w);
                System.out.println(w);
            }
        } catch (IOException ex) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main2() throws IOException {

        // name of generated csv
        Withdraw x = new Withdraw("WINISBEST", "ASC1222", 7.80, new Date(), PaymentStatus.Completed.getCode(), "Note");
        Withdraw x2 = new Withdraw("HAHAAAA", "ASC1222", 7.80, new Date(), PaymentStatus.Completed.getCode(), "Note");
        
        ArrList<Withdraw> employees = new ArrList<>();
        employees.add(x);
        employees.add(x2);

        AbstractEntity.addDataToCsv(employees);
            
    } 
}
