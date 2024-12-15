package jaimelopezAA2;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        try {
            // Inserción
            Cliente nuevoCliente = new Cliente(0, "Juan Pérez", "3001234567");
            clienteDAO.insertarCliente(nuevoCliente);

            // Consulta
            List<Cliente> clientes = clienteDAO.obtenerClientes();
            clientes.forEach(cliente -> System.out.println(cliente.getNombre()));

            // Actualización
            Cliente clienteActualizado = new Cliente(1, "Juan Actualizado", "3017654321");
            clienteDAO.actualizarCliente(clienteActualizado);

            // Eliminación
            clienteDAO.eliminarCliente(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
