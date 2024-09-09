package br.edu.ifnmg.DataPersistence;

import User.User;
import User.UserDao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;


public class DataPersistence {

    public static void main(String[] args) {
        /*
        Cada pedaço das operações resquisitadas no banco foi separada por 
        questões dentro de editor folders
        */
        //Inserção
        //<editor-fold defaultstate="collapsed" desc="4.1">
        
        //<editor-fold defaultstate="collapsed" desc="Variaveis Auxiliares">
        
        Long userID1;
        LocalDate date = LocalDate.now().minusDays(1);
        LocalTime time = LocalTime.of(17, 0);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="inserção-1">
        System.out.println("Iniciando Inserções:");
        userID1=null;
        try {
            User user1;
            user1 = new User(
                    "Ana Zaira","a.zaira@mail.com","123",dateTime,true
                    ,null);
            userID1 = new UserDao().saveOrUpdate(user1);
            user1.setId(userID1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="inserção-2">
        //2
        date=LocalDate.now();
                
        time=LocalTime.of(3, 0);
        
        dateTime = LocalDateTime.of(date, time);
        Long userID2=null;
        try {
            User user2;
            user2 = new User(
                    "Beatriz Yana","b.yana@mail.com","456",dateTime,true
                    ,null);
            userID2 = new UserDao().saveOrUpdate(user2);
            user2.setId(userID2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="inserção-3">
        
        //3
        date=LocalDate.now().minusDays(2);
                
        time=LocalTime.of(12, 0);
        
        dateTime = LocalDateTime.of(date, time);
        Long userID3=null;
        try {
            User user3=null;
            user3 = new User(
                    "Cecília Xerxes","c.xerxes@mail.com","789",dateTime,true
                    ,null);
            userID3 = new UserDao().saveOrUpdate(user3);
            user3.setId(userID3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="inserção-4">
        //4
        Long userID4;
        try {
            User user4=null;
            user4 = new User(
                    "Débora Wendel","debora.w@mail.com","147",null,false
                    ,null);
            userID4 = new UserDao().saveOrUpdate(user4);
            user4.setId(userID4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="inserção-5">
        date=LocalDate.now();
                
        time=LocalTime.of(6, 0);
        
        dateTime = LocalDateTime.of(date, time);
        Long userID5=null;
        try {
            User user5=null;
            user5 = new User(
                    "Eugênia Vale","e.vale@mail.com","258",dateTime,true
                    ,null);
            userID5 = new UserDao().saveOrUpdate(user5);
            user5.setId(userID5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="inserção-6">
        date=LocalDate.now().minusDays(1);
                
        time=LocalTime.of(23, 59);
        
        dateTime = LocalDateTime.of(date, time);
        Long userID6;
        try {
            User user6=null;
            user6 = new User(
                    "Fernanda Uchoa","f.vale@mail.com","369",dateTime,false
                    ,null);
            userID6 = new UserDao().saveOrUpdate(user6);
            user6.setId(userID6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        //</editor-fold>
        //Atualização
        //<editor-fold defaultstate="collapsed" desc="4.2">
        System.out.println("Fim das insercoes.\niniciando updates:");
        //<editor-fold defaultstate="collapsed" desc="Update-1">
        
        try{
        User User1Aux = new UserDao().findById(userID1);
        System.out.println("Buscando usuario: " + User1Aux);
        
        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.of(date, time);
        User1Aux.setLastAccess(dateTime);
        
        new UserDao().saveOrUpdate(User1Aux);
        System.out.println(">> O usuário foi atulizado");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Update-2">
        try{
        User User3Aux = new UserDao().findById(userID3);
        System.out.println("Buscando usuario: " + User3Aux);
        User3Aux.setActive(Boolean.FALSE);
        new UserDao().saveOrUpdate(User3Aux);
        System.out.println(">> O usuário foi atulizado");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //</editor-fold>  
        
        //Debora não pode ser atualizada pois não existe no banco de dados.
        //portanto o update 3 não acontece para o banco de dados.
        //<editor-fold defaultstate="collapsed" desc="Update-3">
        /*try{
        User User4Aux = new UserDao().findById(userID4);
        System.out.println("Buscando usuario: " + User4Aux);
        
        User4Aux.setEmail("d.wendel@mail.com");
        User4Aux.setPassword("&Yh4$Wu9");
        
        new UserDao().saveOrUpdate(User4Aux);
        System.out.println(">> O usuário foi atulizado");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        //</editor-fold> 
        
        //<editor-fold defaultstate="collapsed" desc="Update-4?">
        try{
        User User5Aux = new UserDao().findById(userID5);
        System.out.println("Buscando usuario: " + User5Aux);
        
        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.of(date, time);
        User5Aux.setLastAccess(dateTime);
        User5Aux.setPassword("&asdfqwerty");
        
        new UserDao().saveOrUpdate(User5Aux);
        System.out.println(">> O usuário foi atulizado");
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        //</editor-fold>
        //Impressão do terceiro objeto recuperado
        //<editor-fold defaultstate="collapsed" desc="4.3">
        System.out.println("Impressão do elemento 3 no banco");
        try{
            ArrayList<User> users=new UserDao().findAll();
            System.out.println(users.get(2));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //<editor-fold defaultstate="collapsed" desc="TesteAntigo">
        /*
        try{
          User user=new UserDao().findById(userID3);
            System.out.println(user);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        */
        //</editor-fold>
       
        //</editor-fold>
        //Impressão de todos os objetos
        //<editor-fold defaultstate="collapsed" desc="4.4">
        try {
            UserDao buscaUsuario = new UserDao();
            System.out.println("Todos os Objetos recuperados: ");
            for (User e : buscaUsuario.findAll()) {
                System.out.println(">> " + e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        //Impressão de todos os objetos ativos
        //<editor-fold defaultstate="collapsed" desc="4.5">
        try {
            UserDao buscaUsuario = new UserDao();
            System.out.println("Todos os Objetos ativos recuperados: ");
            for (User e : buscaUsuario.findActives()) {
                System.out.println(">> " + e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        //Remoção do quarto objeto inserido
        //<editor-fold defaultstate="collapsed" desc="4.6">
        System.out.println("delete da inserção 4");
        try{
        System.out.println("");
        new UserDao().delete(userID5);
        } catch(Exception e)   {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
    }
}