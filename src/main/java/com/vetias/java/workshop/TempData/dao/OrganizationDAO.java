package com.vetias.java.workshop.TempData.dao;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import org.h2.jdbcx.JdbcDataSource;

public class OrganizationDAO {
    public void createTable() {
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setUrl("jdbc:h2:mem:tempdataDB");
        h2DataSource.setUser("sa");
        try (Connection dbConnection = h2DataSource.getConnection()) {
            Statement statement = dbConnection.createStatement();
            statement.execute(
                """
                CREATE TABLE organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT
                )
                """
            );
        } catch (SQLException sqlException) {
            System.out.println("Error: " + sqlException);
        }
    }
}