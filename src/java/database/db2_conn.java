/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tyleryork
 */
public class db2_conn {
    public static Connection getConnection() {
        Connection db2con = null;
        String jdbcDriver = "com.ibm.db2.jcc.DB2Driver";
        //Need to Import: db2java.zip, db2jcc.jar, db2jcc_license_cisuz.jar into WebContent/Web-INF/lib
        String dbURL = "jdbc:db2://zos.kctr.marist.edu:5030/DALLASA";
        try {
            Class.forName(jdbcDriver);
            
            db2con = DriverManager.getConnection(dbURL,"kc02511","FALL2019");
        } catch (Exception e) {
            System.out.println(e);
        }
        return db2con;
    }
    
}
