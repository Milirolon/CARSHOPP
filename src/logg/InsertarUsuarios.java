package logg;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
import java.util.Date;

public class InsertarUsuarios {
    public static void insertarUsuario(String gmail, String contrasena, String nombre, String apellido1) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                int id = 0;
                String apellido2 = null;
                String apellido3 = null;
                
                String query = "INSERT INTO Usuarios (ID_U, Gmail, Contraseña, Nombre, Apellido1, Apellido2, Apellido3) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, id);
                statement.setString(2, gmail);
                statement.setString(3, contrasena);
                statement.setString(4, nombre);
                statement.setString(5, apellido1);
                statement.setString(6, apellido2);
                statement.setString(7, apellido3);
                
                int filasInsertadas = statement.executeUpdate();
                if (filasInsertadas > 0) {
                    System.out.println("Datos insertados exitosamente.");
                } else {
                    System.out.println("No se pudieron insertar los datos.");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static boolean verificarCredenciales(String gmail, String contrasena) {
    	Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT COUNT(*) FROM Usuarios WHERE Gmail = ? AND Contraseña = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                statement.setString(2, contrasena);
                
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // Si hay al menos un registro con esas credenciales, retorna true
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }
    
    public String obtenerNombreApellido(String gmail) {
        String nombreApellido = null;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT Nombre FROM Usuarios WHERE Gmail = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    nombreApellido = resultSet.getString("Nombre");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nombreApellido;
    }
    
    public static String obtenerNombre(int id_u) {
    	
        String nombreApellido = null;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT CONCAT(Nombre,' ',Apellido1) AS Nombre FROM Usuarios WHERE ID_U = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, id_u);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    nombreApellido = resultSet.getString("Nombre");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nombreApellido;
    }
    
    public static String obtenergmail(int id_u) {
    	
        String gmail = null;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT Gmail FROM Usuarios WHERE ID_U = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, id_u);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    gmail = resultSet.getString("Gmail");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return gmail;
    }
    
    public String obtenerNombreApellido_id(int id_u) {
        String nombreApellido = null;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT Nombre FROM Usuarios WHERE ID_U = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, id_u);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    nombreApellido = resultSet.getString("Nombre");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nombreApellido;
    }
    
    public int obtenerID(String gmail) {
        int id = 0 ;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT ID_U FROM Usuarios WHERE Gmail = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    id = resultSet.getInt("ID_U");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return id;
    }
    
    public static List<String> obtenerRegistros(int usuarioId) {
        List<String> registros = new ArrayList<>();
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT v.Nombre, COUNT(*) FROM registros INNER JOIN vehiculos v ON registros.Vehiculo = v.ID_V WHERE Usuario = ? GROUP BY Vehiculo;";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, usuarioId);
                
                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()) {
                    String vehiculo = resultSet.getString("Nombre");
                    int count = resultSet.getInt(2); // La columna se obtiene por número de índice (1, 2, 3, etc.)
                    
                    String resultado = "" + vehiculo + ": " + count;
                    registros.add(resultado);
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return registros;
    }
    
    public static void insertarRegistro(int id_u, int idVehiculo) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();

        if (cx != null) {
            try {
            	
                int ID_R=0;
                int Usuario=id_u;
               
             

                String query = "INSERT INTO Registros (ID_R, Usuario, Vehiculo) VALUES (?, ?, ?)";
                PreparedStatement statement = cx.prepareStatement(query);
                
                statement.setInt(1, ID_R);
                statement.setInt(2, Usuario);
                statement.setInt(3, idVehiculo);
                
              
                int filasInsertadas = statement.executeUpdate();
                if (filasInsertadas > 0) {
                    System.out.println("Registro insertado exitosamente.");
                } else {
                    System.out.println("No se pudo insertar el registro.");
                }

                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    public static int obtenerCantidadLikes(int idVehiculo) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        int cantidadLikes = 0;

        if (cx != null) {
            try {
                String query = "SELECT COUNT(*) FROM Registros WHERE Vehiculo = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, idVehiculo);
                
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    cantidadLikes = resultSet.getInt(1);
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return cantidadLikes;
    }
    
    public static boolean verificarExistenciaGmail(String gmail) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT COUNT(*) FROM Usuarios WHERE Gmail = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // Si hay al menos un registro con ese correo, retorna true
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }


}
