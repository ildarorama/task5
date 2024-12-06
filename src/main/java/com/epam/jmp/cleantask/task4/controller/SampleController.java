package com.epam.jmp.cleantask.task4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class SampleController {
    @Value("${user:sa}")
    private String user;

    @Value("${password:jdbc:h2:mem:testdb}")
    private String password;

    @Value("${db:password}")
    private String db;

    @GetMapping("/unsafe")
    public String unsafeMethod(String input) throws SQLException {
        Connection connection = DriverManager.getConnection(db, user, password);
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM user_data WHERE user_name = ?1");
        statement.setString(1, input);
        ResultSet rs = statement.executeQuery();
        // Intentional SQL Injection flaw
        while (rs.next()) {
            System.out.println(rs.getString("user_name"));
        }
        return "Data Retrieved";
    }

    @GetMapping("/logic-error")
    public int faultyLogic() {
        int a = 10;
        int b = 0;
        // Intentional Division by Zero error
        return a / b;
    }

}
