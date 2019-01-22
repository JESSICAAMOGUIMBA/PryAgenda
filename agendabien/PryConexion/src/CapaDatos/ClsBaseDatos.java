
package CapaDatos;


import java.sql.*;
import javax.naming.spi.DirStateFactory.Result;

public class ClsBaseDatos {
  
    private Connection con=null;
    private Statement stconsulta, stactualiza;
    private ResultSet rs;
    private PreparedStatement busca, inserta;
    
    public ClsBaseDatos(){
    try{
        con = DriverManager.getConnection("");//la ubicacion del bdagenda
        stconsulta = con.createStatement();
     //   st = con.createStatement(Result.Set);
        //
        String sqlBuscar = "SELECT * FROM TbAgenda  VALUES";
        busca = con.prepareStatement(sqlBuscar);
        String sqlInserta = "SELECT * INTO TbAgenda  VALUES";
        inserta = con.prepareStatement(sqlInserta);
        System.out.print("conexion exitosa");
    
    
    
    }catch(Exception e){
        System.out.print("error conexion"+ e);
    
    }
    
    }
    
    
    //5 proyectos q abarquen todos los temas de 2Bim.
    
    
    
    
}
