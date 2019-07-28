package lesson13;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDb {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/ira_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "465467";

    static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace ( );
        }
    }

    public static void main(String[] args) {
        try {
            addEmployee();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            viewSalary();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addEmployee() throws SQLException {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter employee name: ");
        String name = scanner.next ();

        System.out.println ("Enter employee surname: ");
        String surname = scanner.next ();

        System.out.println ("Enter employee age: ");
        int age = scanner.nextInt ();

        System.out.println ("Enter employee work experience: ");
        int workExp = scanner.nextInt ();

        System.out.println ("Enter employee position: ");
        String position = scanner.next ();

        System.out.println ("Enter employee salary: ");
        double salary = scanner.nextDouble();

        try (PreparedStatement ps = conn.prepareStatement ("INSERT INTO Employees (name,surname,age,position,experience,salary) " +
                "VALUES(?, ?, ?, ?, ?, ?)")) {
            ps.setString (1, name);
            ps.setString (2, surname);
            ps.setInt (3, age);
            ps.setString (4, position);
            ps.setInt (5, workExp);
            ps.setDouble (6, salary);
            ps.executeUpdate ();
        }
    }

    private static void viewSalary() throws SQLException {
        System.out.println ("Selecting salary of all employees:");
        List<Double> salaryList = new ArrayList<>();

        try (PreparedStatement ps = conn.prepareStatement ("SELECT salary from Employees")) {
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                salaryList.add(resultSet.getDouble(1));
            }
        }
        System.out.println(salaryList);
    }
}

