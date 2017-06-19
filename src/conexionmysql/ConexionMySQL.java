package conexionmysql;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "java91";
    private static final String CONN_STRING = "jdbc:mysql://127.0.0.1:3306/ap"
            + "?verifyServerCertificate=false&useSSL=true";

    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Conexion exitosa",
                "Estado de conexion", JOptionPane.INFORMATION_MESSAGE);

        /*cerrando conexion*/
        if (conn != null) {
            try {
                conn.close();
                JOptionPane.showMessageDialog(null, "Conexion cerrada",
                        "Estado de conexion", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
