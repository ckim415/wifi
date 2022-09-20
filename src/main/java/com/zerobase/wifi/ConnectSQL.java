package com.zerobase.wifi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@RestController
public class ConnectSQL {

    @GetMapping("/connection")
    public static <connection> void dbTest() throws Exception {
        String dbFile = "C:\\Users\\New\\WIFI.db";

        try{
                Class.forName("org.sqlite.JDBC");
                Connection connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM wifi LIMIT 5" );

            while (rs.next()) {
                String number = rs.getString("관리번호");
                System.out.println(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
