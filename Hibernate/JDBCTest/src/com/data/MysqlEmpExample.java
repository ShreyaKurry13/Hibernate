package com.data;
import java.sql.*;

public class MysqlEmpExample {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/empdetails"; 
        String username = "root";
        String password = "root";

        String query = "SELECT empno, ename, job, sal FROM emp";

        if (args.length == 0) {
            try (
                Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()
            ) {
                System.out.println("EMP Table Data:");
                System.out.println("----------------------------");
                while (rs.next()) {
                    int empno = rs.getInt("empno");
                    String ename = rs.getString("ename");
                    String job = rs.getString("job");
                    double sal = rs.getDouble("sal");

                    System.out.printf("EmpNo: %d | Name: %s | Job: %s | Salary: %.2f%n",
                                      empno, ename, job, sal);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            int empnoInput = Integer.parseInt(args[0]);
            String query2 = "SELECT empno, ename, job, sal FROM emp WHERE empno = ?";

            try (
                Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                PreparedStatement stmt = conn.prepareStatement(query2)
            ) {
                stmt.setInt(1, empnoInput);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int empno = rs.getInt("empno");
                        String ename = rs.getString("ename");
                        String job = rs.getString("job");
                        double sal = rs.getDouble("sal");

                        System.out.printf("EmpNo: %d | Name: %s | Job: %s | Salary: %.2f%n",
                                          empno, ename, job, sal);
                    } else {
                        System.out.println("No employee found with empno: " + empnoInput);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
