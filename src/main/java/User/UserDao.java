/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import br.edu.ifnmg.repository.Dao;
import br.edu.ifnmg.repository.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author braga
 */
public class UserDao extends Dao<User>{
    
    public static final String TABLE = "user";

    @Override
    public String getSaveStatment () {
        return "insert into " + TABLE + " (name, email, password, lastAccess,active) values(?,?,?,?,?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set name = ?, email = ?, password = ?, lastAccess = ?, active = ? where id = ?";
    }

    @Override
    public String getFindByIdStatment() {
        return "select name, email, password, active, id from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select * from " + TABLE;
    }

    @Override
    public String getDeleteStatement() {
        return "delete from " + TABLE + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, User user) {
        try{
            if(user.getName() != null)
                pstmt.setObject(1,user.getName(), Types.VARCHAR);
            if(user.getEmail() != null)
                pstmt.setObject(2,user.getEmail(), Types.VARCHAR);
            if(user.getPassword() != null)
                pstmt.setObject(3, user.getPassword(), java.sql.Types.VARCHAR);
            if(user.getLastAccess() != null)
                pstmt.setObject(4, user.getLastAccess(), Types.DATE);
            if(user.getActive() != null)
                pstmt.setObject(5,user.getActive(), Types.BOOLEAN);
            if(user.getId() != null)
                pstmt.setObject(6,user.getId(), Types.BIGINT);
        }catch(SQLException ex){
            System.out.println("Exception in ComposeSave or Update " + ex);
        }
    }

    @Override
    public User extractObject(ResultSet rs) {
        User user = null;
        try{
            user = new User();
            
            user.setName(rs.getString("name"));
            
            user.setId(rs.getLong("id"));
            
            user.setActive(rs.getBoolean("active"));
            
            user.setEmail(rs.getString("email"));
            
            user.setLastAccess(rs.getObject("LastAccess",LocalDateTime.class));
            
        }catch( Exception ex ){
            System.out.println("Exception in extractObject: " + ex);
        }
        return user;
    }

    @Override
public ArrayList<User> findInactives() {
    ArrayList<User> users = new ArrayList<>();
    
    // Define a query para selecionar os usuários inativos
    String query = "SELECT * FROM "+TABLE+" WHERE active = false";
    
    try (PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(query)) {

        // Mostra a sentença SQL completa
        System.out.println(">> SQL: " + preparedStatement);

        // Executa a query no banco de dados
        ResultSet resultSet = preparedStatement.executeQuery();

        // Extrai e retorna os objetos correspondentes
        users = extractObjects(resultSet);

    } catch (Exception ex) {
        System.out.println("Exception: " + ex);
    }
    
    return users;
}

}