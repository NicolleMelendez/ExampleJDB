package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Clase principal para conexión a base de datos
 */
public class DBConnection {

    // Objeto de conexión a la base de datos
    public static Connection connection;
    
    // Objeto para ejecutar sentencias SQL
    public static Statement statement;
    
    // Datos de conexión (host, puerto, base de datos, usuario y contraseña)
    private final String HOST = "localhost"; // Dirección del servidor MySQL
    private final String PORT = "3306"; // Puerto por defecto de MySQL
    private final String DB = "bdkeys"; // Nombre de la base de datos (debe ser especificado)
    private final String USER = "developer"; // Usuario de la base de datos
    private final String PASSWORD = "developer"; // Contraseña del usuario

    /**
     * Método para establecer la conexión con la base de datos
     */
    public void connect() {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            // Establecer la conexión con la base de datos usando los parámetros
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/"
                                                    + DB, USER, PASSWORD);
            
            // Crear un objeto Statement para ejecutar consultas SQL
            statement = connection.createStatement();
            
            System.out.println("Conectado :D");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            MessageUtils.showErrorMessage("Error de conexión a la base de datos");
        }
    }
    
    /**
     * Método para cerrar la conexión con la base de datos
     */
    public void disconnect() {
        try {
            if (statement != null) {
                statement.close(); // Cerrar el Statement
            }
            
            if (connection != null) {
                connection.close(); // Cerrar la conexión con la base de datos
            }
            
            System.out.println("Desconectado :O");
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error desconectándose de la BD");
        }
    }
}
