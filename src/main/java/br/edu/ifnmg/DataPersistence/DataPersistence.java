package br.edu.ifnmg.DataPersistence;

import User.User;
import User.UserDao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author joaok
 */
public class DataPersistence {

    public static void main(String[] args) {
        
        //<editor-fold defaultstate="collapsed" desc="Variaveis Auxiliares">
        Long userID;
                // Obtém a data de ontem
        LocalDate date = LocalDate.now().minusDays(1);
        
        // Define o horário para 17:00
        LocalTime time = LocalTime.of(17, 0);
        
        // Combina a data de ontem com o horário das 17:00
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        //</editor-fold>
        System.out.println(dateTime);
        //<editor-fold defaultstate="collapsed" desc="Cria uma pessoa em função de teste do código">
        
        try {
            User user1;
            user1 = new User(
                    "Ana Zaira","a.zaira@mail.com","123",dateTime,true
                    ,null);
            userID = new UserDao().saveOrUpdate(user1);
            user1.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //2
        date=LocalDate.now();
                
        time=LocalTime.of(3, 0);
        
        dateTime = LocalDateTime.of(date, time);
        
        try {
            User user2;
            user2 = new User(
                    "Beatriz Yana","b.yana@mail.com","456",dateTime,true
                    ,null);
            userID = new UserDao().saveOrUpdate(user2);
            user2.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //3
        date=LocalDate.now().minusDays(2);
                
        time=LocalTime.of(12, 0);
        
        dateTime = LocalDateTime.of(date, time);
        
        try {
            User user3;
            user3 = new User(
                    "Cecília Xerxes","c.xerxes@mail.com","789",dateTime,true
                    ,null);
            userID = new UserDao().saveOrUpdate(user3);
            user3.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            User user4;
            user4 = new User(
                    "Débora Wendel","debora.w@mail.com","147",null,false
                    ,null);
            userID = new UserDao().saveOrUpdate(user4);
            user4.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        date=LocalDate.now();
                
        time=LocalTime.of(6, 0);
        
        dateTime = LocalDateTime.of(date, time);
        
        try {
            User user5;
            user5 = new User(
                    "Eugênia Vale","e.vale@mail.com","258",dateTime,true
                    ,null);
            userID = new UserDao().saveOrUpdate(user5);
            user5.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        date=LocalDate.now();
                
        time=LocalTime.of(23, 59);
        
        dateTime = LocalDateTime.of(date, time);
        
        try {
            User user6;
            user6 = new User(
                    "Fernanda Uchoa","f.vale@mail.com","369",dateTime,false
                    ,null);
            userID = new UserDao().saveOrUpdate(user6);
            user6.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            UserDao aux=new UserDao();
            ArrayList users=aux.findAll();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}