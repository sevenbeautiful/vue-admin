/**
 * @(#)UserDAO.java
 *
 *
 * @author
 * @version 1.00 2009/5/30
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JDBCUtils;

public class UserDAO {

    

    public boolean findByIDAndPassword(
            String userId, String password) {
        //建立连接对象
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            String sql = "select * from user"
                    + "  where userId=? and password=?"
                    + "  ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
           

            rs = pstmt.executeQuery();
            if (rs.next()) {
                    result =true;
            } 

        } catch (Exception e) {
            //System.out.println("数据库操作错误");
            System.out.println(e.getMessage());
        } finally {
            JDBCUtils.close(conn, pstmt, rs);
        }
        return result;
    }
    

    

    public boolean updatePassword(String userId, String pass) {
        String sql = "UPDATE user set password=? where userId=? ";
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement pstmt = null;
        boolean updateSuccessFlag = false;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pass);
            pstmt.setString(2, userId);

            int i = pstmt.executeUpdate();
            if (i == 1) {
                // 如果插入成功，则肯定能执行到此段代码
                updateSuccessFlag = true;
            }

        } catch (SQLException e) {
            System.out.println("更新操作中出现错误！！！");
            System.out.println(e);
        }finally {
            JDBCUtils.close(conn, pstmt, null);
        }
        return updateSuccessFlag;
    }
    
    
}