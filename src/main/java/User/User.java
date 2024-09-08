/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import br.edu.ifnmg.entity.Entity;
import java.time.LocalDate;

/**
 *
 * @author braga
 */
public class User extends Entity{
    private String name;
    private String email;
    private String password;
    private LocalDate LastAccess;
    private Boolean active;

    public User() {
    }
    
    public User(String name, String email, String password, LocalDate LastAccess, Boolean active,Long id){
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLastAccess(LastAccess);
        this.setActive(active);
        setId(id);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLastAccess() {
        return LastAccess;
    }

    public void setLastAccess(LocalDate LastAccess) {
        this.LastAccess = LastAccess;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name 
                + ", email=" + email 
                + ", password=" + password 
                + ", LastAccess=" + LastAccess 
                + ", active=" + active + '}';
    }
    
    
}
