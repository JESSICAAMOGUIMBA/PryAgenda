
package CapaAccesoDatos;

import CapaDatos.ClsRegAgenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClsBdAgenda {
    //CODIGO VARIABLES
    private Connection con = null;
    private Statement consulta;
    private ResultSet resultado; 
    
    private ClsRegAgenda r;
    
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
    
    
    public ResultSet rs(){ return resultado;}
    
    
    public ClsRegAgenda siguente() {
       r= new ClsRegAgenda();
        try  {
           if (resultado.next()) 
               mostrar(); 
       }catch(SQLException e){
           System.out.print("fin de tabla"+e);
       
       }
        
        return r;
    }
    
    public void mostrar () throws SQLException {
        r.cedula= resultado.getNString("Cedula");
        r.nombre= resultado.getNString("Nombre");
        r.direccion= resultado.getNString("Direccion");
        r.tlfijo= resultado.getNString("TlFijo");
        r.movil1= resultado.getNString("Tfmovil1");
        r.movil2= resultado.getNString("Tfmovil2");
    }
    
   
    
}
