package qust.webdemo.test;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//加载JDBC驱动
       Class.forName ("com.mysql.cj.jdbc.Driver");
        String username="root";String password="1535926365";
String url="jdbc:mysql://localhost:3306/students?serverTimezone=UTC&useSSL=false";
    Connection conn= DriverManager.getConnection(url, username , password);//获得语句对象
        String sql="select sno , sname , age from Student";
        PreparedStatement stmt=conn.prepareStatement(sql);//获得结果集对象
        ResultSet rs=stmt.executeQuery();//遍历结果集，输出
        while (rs.next()){
            System.out.print(rs.getString("sno" ));System.out.print(rs.getString(  "sname"));System.out.println(rs.getInt(  "age" ));
        }
//释放对象
 rs.close();
        stmt.close();
        conn.close();

    }}
