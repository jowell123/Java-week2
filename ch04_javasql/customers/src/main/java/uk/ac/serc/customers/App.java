package uk.ac.serc.customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

//CustomerID,CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
       ArrayList<Customer> customerList = getAllCustomers();

       System.out.println("Please enter a customer number:");
       int cusNo = keyboard.nextInt();
       keyboard.nextLine();

       System.out.println(customerList.get(cusNo-1));
       
    }

    private static ArrayList<Customer> getAllCustomers(){
        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" + database + ";user="+ user + ";password=" + password +";";
    
        System.out.println(connectionUrl);

        ArrayList <Customer> customerList = new ArrayList<Customer>();

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("-- Connected to the database. --");

                String sql = "SELECT * FROM Customers;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        //System.out.println(resultSet.getString("CustomerID") + " | " + resultSet.getString("CompanyName") + " | " + resultSet.getString("ContactName"));
                 
                    Customer customer = new Customer();
                    customer.customerID = resultSet.getString("CustomerID");
                    customer.companyName = resultSet.getString("CompanyName");
                    customer.contactName = resultSet.getString("ContactName");
                    customer.contactTitle = resultSet.getString("ContactTitle");
                    customer.address = resultSet.getString("Address");
                    customer.city = resultSet.getString("City");
                    customer.region = resultSet.getString("Region");
                    customer.postalCode = resultSet.getString("PostalCode");
                    customer.country = resultSet.getString("Country");
                    customer.phone = resultSet.getString("Phone");
                    customer.fax = resultSet.getString("Fax");

                    customerList.add(customer);

                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        return customerList;

    }
}