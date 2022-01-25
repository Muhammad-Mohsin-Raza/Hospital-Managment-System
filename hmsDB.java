/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS;
import java.sql.*;
/**
 *
 * @author mohsi
 */
public class hmsDB {
     Connection myConn;
    private Statement myStmt;
    private ResultSet myRs;
    public hmsDB(){
        myConn=null;
        myStmt=null;
        myRs=null;  
    }
    
    public Statement getStatment(){
        String dburl="jdbc:mysql://localhost:3306/myhmsdb";
        String user="root";
        String pass="";
        try{
            // 1- get a connection
            myConn=DriverManager.getConnection(dburl,user,pass);
            //2- create statment
            myStmt=myConn.createStatement();
            
            return myStmt;
            
        }
        catch(Exception ex){
        System.out.println(ex);
        return myStmt;
        }
    }
   
    
}
