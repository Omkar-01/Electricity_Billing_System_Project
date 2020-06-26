package Electricity;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///electricitybillingsystemproject","root","");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}