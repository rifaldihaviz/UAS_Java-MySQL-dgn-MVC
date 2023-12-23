/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class KoneksiDB {

    static Connection con;

    public static Connection getConection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("uts_pemrograman2");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                System.out.println("Gagal Koneksi!"+ e.getMessage());
                e.printStackTrace();
            }

        }
        return con;
    }
}
