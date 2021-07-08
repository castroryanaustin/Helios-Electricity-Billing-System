/**
 *
 * @author mangostynn
 */
package forms;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JComboBox;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Database {
//    static String dbAdd = "jdbc:mysql://localhost:3306/ebill";
//    static String dbUN = "root";
//    static String dbPW = "@Quickbrownfox1031";
    static String dbAdd = "jdbc:mysql://remotemysql.com:3306/3SHcywXthG";
    static String dbUN = "3SHcywXthG";
    static String dbPW = "lBE3B42R14";
    static Connection conn;
    static DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm:ss");
    /**
     *
     * @return
     */
    public static boolean establishConnection(){
        try {
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            System.out.println("Connected successfully.");
            conn.endRequest();
            conn.close();
        } catch (SQLException exc) {
            showMessageDialog(null, exc.toString());
            return false;
        }
        return true;
    }
    
    /**
     * Generates an ID derived from the current date and the number of
     * the existing users. (yyMMddUUU)
     * @return A string with a length of 10.
     */
    public static String generateID(){
        String newID = "";
        String query = "select * from users;";

        try {
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(query);
            
            var found=0;
            while (res.next()){
                found++;
            }
            
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyMMdd");
            int date = Integer.parseInt(LocalDateTime.now().format(fmt));
            date = date * 10000 + found;
            
            newID = String.valueOf(date);
            System.out.println(newID);
            
            logQuery(query);
                    
            conn.endRequest();
            conn.close();
        } catch (SQLException exc) {
            logError(exc.toString(), query);
        }
        return newID;
    }
    
    /**
     * Takes the array of user information.
     * 
     * @param details [UID, username, password, firstName, lastName, address, email, serviceRate]
     * @return 
     */
    public static boolean signUp(String[] details){
        String id = generateID();
        String query = "insert into users values('" + id + "', '" +
            details[0] + "', '" + details[1] + "', '" + details[2] + "', '" +
            details[3] + "', '" + details[4] + "', '" + details[5] + "', '" +
            details[6] + "');";
        System.out.println(query);
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            
            showMessageDialog(null, "Successfully created an account for "
                + details[2] + " " + details[3]
                + " with the account number [" + id + "].");
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
            
            return true;
        } catch (SQLException exc){
            logError(exc.toString(), query);
            return false;
        }
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public static boolean logIn(String username, String password){
        boolean pass = false;
        String query = "select * from users where username = '" + username +
                    "' and password = '" + password + "';";
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(query);
            
            var found=0;
            while (res.next()){
                found++;
                mainmen.uid = res.getString("user_id");
                mainmen.username = res.getString("username");
                mainmen.password = res.getString("password");
                mainmen.firstName = res.getString("firstName");
                mainmen.lastName = res.getString("lastName");
                mainmen.address = res.getString("address");
                mainmen.email = res.getString("email");
                mainmen.serviceRate = res.getString("serviceRate");
            }
            
            if (found == 1){
                System.out.println("[" + LocalDateTime.now().format(timeFmt)
                + "] SYSTEM: User " + mainmen.username + " with "
                + "the UID [" + mainmen.uid + "] has logged in.");
                pass = true;
                
            } else {
                System.out.println("Try again.");
            }
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
        } catch (SQLException exc){
            logError(exc.toString(), query);
        }
        return pass;
    }
    
    public static float[] getRates(String period){
        String query = "select * from rates where ratePeriod = '" +
                period + "';";
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(query);
            
            res.next();
            float[] rates = {res.getFloat("r_base"),
                    res.getFloat("r_add_0_200"),
                    res.getFloat("r_add_201_300"),
                    res.getFloat("r_add_301_400"),
                    res.getFloat("r_add_400p"),
                    res.getFloat("r_disc_0_20"),
                    res.getFloat("r_disc_21_50"),
                    res.getFloat("r_disc_51_70"),
                    res.getFloat("r_disc_71_100"),
                    res.getFloat("r_fixed"),
                    res.getFloat("gs_base"),
                    res.getFloat("gs_add_0_200"),
                    res.getFloat("gs_add_201_300"),
                    res.getFloat("gs_add_301_400"),
                    res.getFloat("gs_add_400p"),
                    res.getFloat("gp_base"),
                    res.getFloat("gp_fixed_0_199"),
                    res.getFloat("gp_fixed_200_749"),
                    res.getFloat("gp_fixed_750p")};
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
            
            return rates;
        } catch (SQLException exc){
            logError(exc.toString(), query);
            return null;
        }
    }
    
    public static void addNewRates(String month, float[] rates){
        String query = "insert into rates values('" + month + "', " +
                rates[0] + ", " + rates[1] + ", " + rates[2] + ", " +
                rates[3] + ", " + rates[4] + ", " + rates[5] + ", " +
                rates[6] + ", " + rates[7] + ", " + rates[8] + ", " +
                rates[9] + ", " + rates[10] + ", " + rates[11] + ", " +
                rates[12] + ", " + rates[13] + ", " + rates[14] + ", " +
                rates[15] + ", " + rates[16] + ", " + rates[17] + ", " +
                rates[18] + ");";
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
        } catch (SQLException exc){
            logError(exc.toString(), query);
        }
    }
    
    public static void updateRates(String month, float[] rates){
        String query = "update rates set r_base = " + rates[0] +
                ", r_add_0_200 = " + rates[1] +
                ", r_add_201_300 = " + rates[2] +
                ", r_add_301_400 = " + rates[3] +
                ", r_add_400p = " + rates[4] +
                ", r_disc_0_20 = " + rates[5] +
                ", r_disc_21_50 = " + rates[6] +
                ", r_disc_51_70 = " + rates[7] +
                ", r_disc_71_100 = " + rates[8] +
                ", r_fixed = " + rates[9] +
                ", gs_base = " + rates[10] +
                ", gs_add_0_200 = " + rates[11] +
                ", gs_add_201_300 = " + rates[12] +
                ", gs_add_301_400 = " + rates[13] +
                ", gs_add_400p = " + rates[14] + 
                ", gp_base = " + rates[15] +
                ", gp_fixed_0_199 = " + rates[16] +
                ", gp_fixed_200_749 = " + rates[17] +
                ", gp_fixed_750p = " + rates[18] +
                "where ratePeriod = '" + month + "';";
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
        } catch (SQLException exc){
            logError(exc.toString(), query);
        }
    }
    
    public static void loadMonths(JComboBox cbx){
        String query = "select ratePeriod from rates;";
        try{
            conn = DriverManager.getConnection(dbAdd, dbUN, dbPW);
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(query);
            
            while (res.next()){
                cbx.addItem(res.getString(1));
                System.out.println(res.getString(1));
            }
            
            logQuery(query);
            
            conn.endRequest();
            conn.close();
        } catch (SQLException exc){
            logError(exc.toString(), query);
        }
    }
    
    private static void logQuery(String query){
        System.out.println("[" + LocalDateTime.now().format(timeFmt)
            + "] QUERY: " + query);
    }
    
    private static void logError(String exception, String query){
        System.out.println("[" + LocalDateTime.now().format(timeFmt) + 
            "] ERROR: " + exception + " with query [" + query + "].");
        
        showMessageDialog(null, exception,
             "Error Found.", JOptionPane.ERROR_MESSAGE); 
    }
}
