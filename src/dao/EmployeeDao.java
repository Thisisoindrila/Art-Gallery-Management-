/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Employee;

/**
 *
 * @author Admin
 */
public class EmployeeDao {
    
     public static void save(Employee employee){
        String query = "insert into Employee(employee_name,nid,salary) values('"+employee.getEmployee_name()+"','"+employee.getNid()+"','"+employee.getSalary()+"')";
        DbOperations.setDataorDelete(query,"Employee added successfully");
    }
     public static ArrayList<Employee> getAllRecords(){
       ArrayList<Employee> arrayList = new ArrayList<>();
       
       try{
           ResultSet rs = DbOperations.getData("select *from Employee");
           while(rs.next()){
               Employee employee = new Employee();
               employee.setId(rs.getInt("id"));
               employee.setEmployee_name(rs.getString("employee_name"));
               employee.setSalary(rs.getString("salary"));
               employee.setNid(rs.getString("nid"));
               arrayList.add(employee);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       
       return arrayList;
    }
     public static void update(Employee employee){
         String query = "update employee set employee_name ='"+employee.getEmployee_name()+"',salary='"+employee.getSalary()+"',nid='"+employee.getNid()+"' where id = '"+employee.getId()+"'";
         DbOperations.setDataorDelete(query,"Employe updated successfully`");
     }   
     
     public static void delete(String id){
         String query = "delete from artwork where id = '"+id+"'";
         DbOperations.setDataorDelete(query,"Employee deleted successfully");
     }
}
