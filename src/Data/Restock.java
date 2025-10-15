/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.ResultSet;

/**
 *
 * @author 313 - PC 21
 */
public class Restock {
    private String tgl_restock;
    private String string_restock;
    private int totalHarga;
    
    public Restock() {
        
    }

    public String getTgl_restock() {
        return tgl_restock;
    }

    public void setTgl_restock(String tgl_restock) {
        this.tgl_restock = tgl_restock;
    }

    public String getString_restock() {
        return string_restock;
    }

    public void setString_restock(String string_restock) {
        this.string_restock = string_restock;
        
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalAyam) {
        this.totalHarga = totalAyam;
    }
    
    public void saveRestock(){
        Database db = new Database();
        String s = "insert into restock (id_admin, tgl_restock, string_restock) values "
                + "('A01','"+this.tgl_restock+"','"+this.string_restock+"','"+this.totalHarga+"')";
        db.query(s);
    }
    
    public ResultSet getRestock(){
        ResultSet result=null;
        Database db = new Database();
        String s = "insert into restock values ('"+this.tgl_restock+"','"+this.string_restock+"',')";
        
        db.query(s);
        return result;
    }
}