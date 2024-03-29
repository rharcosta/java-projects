package industriamecanica;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection con = null;
    private final String DRIVER = "com.mysql.jdbc.Driver"; 
    private final String BDNOME = "Industria_Mecanica"; 
    private final String URL = "jdbc:mysql://localhost/"+BDNOME; 
    private final String USUARIO ="root"; 
    private final String SENHA ="root"; 
    
    public boolean getConnection(){
        try{
            Class.forName(DRIVER);
            con = (Connection) DriverManager.getConnection(URL,USUARIO,SENHA); 
           // JOptionPane.showMessageDialog(null, "Conexão Ok!");
            return true; 
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Driver não encontrado!"+e.toString());
        return false; 
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao conectar!"+e.toString()); 
            return false; 
        }
    } 
    public void close(){
        try{
              con.close(); 
              //JOptionPane.showMessageDialog(null, "BD desconectou!");
           }  catch (SQLException e){}
        
    }
}
   

