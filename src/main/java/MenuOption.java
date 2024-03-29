/*
    Esta interfaz define el contrato para las opciones de menú en un sistema de gestión
    bancaria.  Cada opción de menú debe proporcionar una descripción y un método para
     ejecutar la acción asociada.
*/

public interface MenuOption {
    String getDescription();
    void execute();
}