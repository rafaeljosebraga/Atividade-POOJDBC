package br.edu.ifnmg.DataPersistence;

import User.User;
import User.UserDao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
        
        //<editor-fold defaultstate="collapsed" desc="Cria uma pessoa em função de teste do código">
        
        try {
            User user;
            user = new User(
                    "Ana Zaira de ruas oliveira casmão de julia alerquina palanque de supermercado azul aluminio de aço bem corroido da silva silveira da mata onde pegou fogo e encheu o brasil de fumaça preta onde podemos afirmar que o mundo morreu por dentro enquanto vizualizamos o mundo a cada um a sua perspectiva de muita fé e alegria força e paz de DEus podemos afirmar que o mundo é apenas matéria e que popdemos encontrar mais significados dentro do que as nossas cabeças pensam a respeito deste mundo material e podemos tirar conclusões que mesmo outros seriam icapazes","a.zaira@mail.com","123",dateTime,true
                    ,null);
        userID = new UserDao().saveOrUpdate(user);
        user.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        /*
        //<editor-fold defaultstate="collapsed" desc="Inserção">
        
        try {
            User user;
            user = new User(
                    "Ana Zaira","a.zaira@mail.com","123",dataInsere,true
                    ,null);
        userID = new UserDao().saveOrUpdate(user);
        user.setId(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>
        */
    }
}