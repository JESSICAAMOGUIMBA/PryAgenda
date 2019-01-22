
package CapaAccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClsBdAgenda {
    //CODIGO VARIABLES
    private Connection con=null;
    private Statement consulta;
    private ResultSet resultado; 
    
    //CONSTRUCTOR
    
    public ClsBdAgenda(String direccion){
        
        try{
        con = DriverManager.getConnection("jdbc:ucanaccess://"+direccion);// NO DEBE EXISTIR ESPACIOS: SALDRA ERROR
        consulta = con.createStatement();//importante para definir acciones sobre BD
        System.out.println("Conexión realizada con Éxito");
        
        }catch(Exception e){
        System.out.println("Error Conexión:  "+ e);
             
        }
    }
    
    //METODO CARGAR PARA OBTENER LOS REGISTROS 
    public ResultSet cargar() throws SQLException{
        String comando = "SELECT * FROM BdAgenda"; //  * TODOS LOS CAMPOS DE LAS TUPLAS
        consulta.execute(comando);
        resultado = consulta.getResultSet();
        
        
        return resultado;
    }
    
    
   //cambiar la conexion de tbAgenda 
    
}
