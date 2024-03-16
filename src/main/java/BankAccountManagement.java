/*
Crea un proyecto Java:

-Que solucione un problema que conozcas actualmente

Que requerimos:
-Un sistema de clases
-Aplicacion de TODOS los principios SOLID al sistema anterior

Entregables:
-Un diagrama de clases con el sistema disenhado de acuerdo al proceso de abstraccion
-Un proyecto MAVEN basico pero funcional con las dependencias necesarias y plugins, asi como con todas las clases e interfaces disenhadas previamente.
 Aplicar buenas practicas y codestyling.

No se requiere:
-Uso de bases de datos
-Conexiones a APIS/Web services
-Front end
 */
/*
Como proyecto hemos creado una aplicación de gestión de cuentas banacarias.
 */


public class BankAccountManagement {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMenu();
    }
}