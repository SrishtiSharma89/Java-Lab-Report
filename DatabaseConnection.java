import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/xyz"; 
        String username = "root"; 
        String password = "Password_enter"; 
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("ID | Name    | Marks");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double marks = resultSet.getDouble("marks");
                System.out.printf("%d | %s | %.2f%n", id, name, marks);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
