package com.qust.qustwebdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();try{

            Class.forName ("com.mysql.cj.jdbc.Driver");
            String username="root";String password="1535926365";
            String url="jdbc:mysql://localhost:3306/students?serverTimezone=UTC&useSSL=false";
            Connection conn= DriverManager.getConnection(url, username , password);//获得语句对象
            String sql="select sno , sname , age from Student" ;
            PreparedStatement stmt=conn.prepareStatement(sql);//获得结果集对象
            ResultSet rs=stmt.executeQuery() ;//遍历结果集，存储到ArrayList对象中students=new ArrayList<>();
            while (rs.next()){
                Student student=new Student();
                student.setSno(rs.getString(  "sno" ));
                student.setSname(rs.getString( "sname"));
                student.setAge(rs.getInt ( "age"));

//加到ArrayList中
                students.add(student);
            }
//释放对象
rs.close();stmt.close();
conn.close();
        }catch (Exception e){}
            return students;
        }

    }
