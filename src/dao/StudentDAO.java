/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.JDBCUtils;
import vo.Student;

/**
 *
 * @author Administrator
 */
public class StudentDAO {

    /**
     * 删除一条记录
     *
     *
     */
    public boolean delete(String no) {
        Connection conn = null;
        PreparedStatement pstmt = null;//语句
        boolean flag = false;
        try {
            //conn=test.JDBCUtils.getConnection();
            conn = JDBCUtils.getConnection();
            String deleteString = "delete from student "
                    + "where no=?";
            pstmt = conn.prepareStatement(deleteString);
            pstmt.setString(1, no);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                flag = true;
            } 

        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
            System.out.println("数据库错误");
        } finally {
            JDBCUtils.close(conn, pstmt, null);
        }
        return flag;
    } 

    public boolean save(String no, String name,
            int age, String birthday) {
        String sql = "INSERT INTO student("
                + "no,name,"
                + "age,birthday"
                + " ) VALUES(?,?,?,?)";
        //得到连接对象
        Connection conn = JDBCUtils.getConnection();
        //定义预编译语句对象，此对象可执行动态sql命令。
        PreparedStatement pstmt = null;
        boolean insertSuccessFlag = false;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, no);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setString(4, birthday);

            int i = pstmt.executeUpdate();
            if (i == 1) {
                insertSuccessFlag = true;
            }
        } catch (SQLException e) {
            System.out.println("插入操作中出现错误！！！");
            System.out.println(e);
        } finally {
            JDBCUtils.close(conn, pstmt, null);
        }
        return insertSuccessFlag;
    }

    public boolean update(String no, String name,
            int age, String birthday) {
        String updateString = "update student set name=?,age=?,"
                + "birthday=?"
                + " where no=?";
        //得到连接对象
        Connection conn = JDBCUtils.getConnection();
        //定义预编译语句对象，此对象可执行动态sql命令。
        PreparedStatement pstmt = null;
        boolean insertSuccessFlag = false;
        try {
            pstmt = conn.prepareStatement(updateString);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, birthday);
            pstmt.setString(4, no);

            int i = pstmt.executeUpdate();
            if (i == 1) {
                // 如果插入成功，则肯定能执行到此段代码
                insertSuccessFlag = true;
            }
        } catch (SQLException e) {
            System.out.println("修改操作中出现错误！！！");
            System.out.println(e);
        } finally {
            JDBCUtils.close(conn, pstmt, null);
        }
        return insertSuccessFlag;
    }

    public Student getStudent(String no) {
        Student student = null;
        String sql = "SELECT no,name,age,birthday "
                + "from student  where no=?";
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, no);
            rs = pstmt.executeQuery();
            //此处为什么不用while,用while可不可以
            if (rs.next()) {
                student = new Student(rs.getString(1),
                        rs.getString(2), rs.getInt(3),
                        rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("操作中出现错误！！！");
        } finally {
            JDBCUtils.close(conn, pstmt, rs);
        }
        return student;
    }

    /**
     * 显示全部记录
     *
     * @return
     */
    public ArrayList<Student> list() {
        ArrayList<Student> all = new ArrayList<Student>();
        Student student = null;
        String sql = "SELECT no,name,age,birthday "
                + "from student ";
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
           
            while (rs.next()) {
                student = new Student( rs.getString(1),
                        rs.getString(2), rs.getInt(3),
                        rs.getString(4));
                all.add(student);
            }

        } catch (SQLException e) {
            System.out.println("操作中出现错误！！！");
            System.out.println(e.getMessage());
        } finally {
            JDBCUtils.close(conn, pstmt, rs);
        }
        return all;
    }

}
