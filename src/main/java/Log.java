import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by monik on 17.11.2019.
 */
public class Log {
    static class Password{
        public String login,password;
        public Password(String login,String password){
            this.login=login;
            this.password=password;
        }
    }
    public static void main(String[] args) {
        Password password = new Password( "root", "root" );
        InputStreamReader inputStreamReader = new InputStreamReader( System.in );
        BufferedReader bufferedReader = new BufferedReader( inputStreamReader );
        String login, pass;
        while (true){

            try {
                System.out.println("Podaj login: ");
                login= bufferedReader.readLine();
                System.out.println("Podaj haslo");
                pass=bufferedReader.readLine();
                if (login.equalsIgnoreCase( password.login) && pass.equals( password.password)){
                    System.out.println("Poprawne dane. spróbuj jeszcze raz \n ");
                    break;
                }
                else {
                    System.out.println("Niepoprawne dane");
                    continue;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
