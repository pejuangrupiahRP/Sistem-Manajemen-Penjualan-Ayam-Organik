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
public class Penjualan {
    private String nama_pembeli;
    private String string_penjualan;
    private String tgl_penjualan;
    private int totalAyam, totalHarga;
    
    public Penjualan() {
        
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getString_penjualan() {
        return string_penjualan;
    }

    public void setString_penjualan(String string_penjualan) {
        this.string_penjualan = string_penjualan;
    }

    public String getTgl_penjualan() {
        return tgl_penjualan;
    }

    public void setTgl_penjualan(String tgl_penjualan) {
        this.tgl_penjualan = tgl_penjualan;
    }

    public int getTotalAyam() {
        return totalAyam;
    }

    public void setTotalAyam(int totalAyam) {
        this.totalAyam = totalAyam;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    
    
    
    public void savepenjualan(){
        Database db = new Database();
        String sql = "insert into penjualan"
                    + "(tgl_penjualan, nama_pembeli, string_penjualan, totalAyam, totalHarga, id_admin) "
                    + "values ('"
                    +this.tgl_penjualan+"','"
                    +this.nama_pembeli+"','"
                    +this.string_penjualan+"','"
                    +this.totalAyam+"','"
                    +this.totalHarga+"','"
                    + "A01')";
        db.query(sql);
    }
    
    public ResultSet getPenjualan(){
        ResultSet result=null;
        Database db = new Database();
        String s = "insert into penjualan values ('"+this.nama_pembeli+"','"+this.string_penjualan+"',''"+this.tgl_penjualan+"',')";
        
        db.query(s);
        return result;
    }
}

