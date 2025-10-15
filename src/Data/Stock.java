/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 313 - PC 21
 */
public class Stock {
    private String stringRestock;
    private int stock_12;
    private int stock_13;
    private int stock_14;
    private int stock_15;
    private int stock_fill_dada;
    private int stock_fill_paha;
    
    public Stock(){
        
    }    

    public String getStringRestock() {
        return stringRestock;
    }

    public void setStringRestock(String stringRestock) {
        this.stringRestock = stringRestock;
    }
    
    public int getStock_12() {
        return stock_12;
    }

    public void setStock_12(int stock_12) {
        this.stock_12 = stock_12;
    }

    public int getStock_13() {
        return stock_13;
    }

    public void setStock_13(int stock_13) {
        this.stock_13 = stock_13;
    }

    public int getStock_14() {
        return stock_14;
    }

    public void setStock_14(int stock_14) {
        this.stock_14 = stock_14;
    }

    public int getStock_15() {
        return stock_15;
    }

    public void setStock_15(int stock_15) {
        this.stock_15 = stock_15;
    }

    public int getStock_fill_dada() {
        return stock_fill_dada;
    }

    public void setStock_fill_dada(int stock_fill_dada) {
        this.stock_fill_dada = stock_fill_dada;
    }

    public int getStock_fill_paha() {
        return stock_fill_paha;
    }

    public void setStock_fill_paha(int stock_fill_paha) {
        this.stock_fill_paha = stock_fill_paha;
    }
    
    public void savestock(){
        Database db = new Database();
        ResultSet rs = null;
        String s = "";
        
        try {
            rs = db.getData("select id_restock from restock where string_restock = '"+this.stringRestock+"'");
            
            while(rs.next()) {
                s = "insert into stock "
                        + "(id_restock, string_restock, stock_12, stock_13, "
                        + "stock_14, stock_15, stock_fill_dada, stock_fill_paha)"
                + "values ('"+rs+"','"
                        +this.stringRestock+"','"
                        +this.stock_12+"','"
                        +this.stock_13+"','"
                        +this.stock_14+"','"
                        +this.stock_15+"','"
                        +this.stock_fill_dada+"','"
                        +this.stock_fill_paha+"',')";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        db.query(s);
    }
    
    public ResultSet getStock(){
        ResultSet result=null;
        Database db = new Database();
        String s = "insert into buku values ('"+this.stock_12+"','"+this.stock_13+"','"+this.stock_14+"','"+this.stock_15+"','"+this.stock_fill_dada+"','"+this.stock_fill_paha+"',')";
        
        db.query(s);
        return result;
    }
}