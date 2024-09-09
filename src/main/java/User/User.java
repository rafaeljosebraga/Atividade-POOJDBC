
package User;

import entity.Entity;
import java.time.LocalDateTime;

/**
 *
 * @author braga
 */
public class User extends Entity{
    private String name;
    private String email;
    private String password;
    private LocalDateTime LastAccess;
    private Boolean active;

    public User() {
    }
    
    public User(String name, String email, String password, LocalDateTime LastAccess, Boolean active,Long id) throws Exception{
        //O this nessas chamadas de métodos está implícito conforme entendemos em sala de aula.
        //this.setName(name);
        setName(name);
        //this.setEmail(email);
        setEmail(email);
        //this.setPassword(password);
        setPassword(password);
        //this.setLastAccess(LastAccess);
        setLastAccess(LastAccess);
        //this.setActive(active);
        setActive(active);
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.length()>150)
        {
            throw new IllegalArgumentException("User: nome excede 150 caracteres");
        }else if(name== null)
        {
           throw new IllegalArgumentException("User: nome e null"); 
        }else{
            this.name = name;
        }
            
            
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
         if(email.length()>255)
        {
            throw new IllegalArgumentException("User: nome excede 255 caracteres");
        }else if(email== null)
        {
           throw new IllegalArgumentException("User: email e null"); 
        }else{
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception{
           if(password.length()>64)
        {
            throw new IllegalArgumentException("User: nome excede 64 caracteres");
        }else if(password== null)
        {
           throw new IllegalArgumentException("User: email e null"); 
        }else{
            this.password = password;
        }
    }

    public LocalDateTime getLastAccess() {
        return LastAccess;
    }

    public void setLastAccess(LocalDateTime LastAccess) throws Exception{
        if(LastAccess == null)
        {
           throw new IllegalArgumentException("User: LastAccess e null"); 
        }else{
            this.LastAccess = LastAccess;
        }
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        if(active == null){
            
            this.active=true;
            return;
        }
        this.active = active;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "User{" + "name=" + name 
                + ", email=" + email 
                + ", password=" + password 
                + ", LastAccess=" + LastAccess 
                + ", active=" + active + '}';
    }
    
    
}
