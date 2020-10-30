/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Administrator
 */
public class JDBCUtils {
    public static Connection getConnection(){
        Connection conn=null; 
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");//���������,���Driver����
        String uname="root";
        String pass="root";
        String url="jdbc:mysql://localhost:3306/st2015?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        conn=DriverManager.getConnection(url,uname,pass);
        }catch(ClassNotFoundException e){
               System.out.println("�driver error����");
        }
        catch(SQLException e1){
                     System.out.println(e1.getMessage());
                  System.out.println("��ݿ����");
        }
        return conn;
    }
    
      public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs){
        try{
        //?判断rs 等是否为空
         //1.没有意义
         //2.如果为空会出现空指针异常
        if(rs!=null){rs.close();}
        if(pstmt!=null){pstmt.close();}
        if(conn!=null){conn.close();}

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
