package elementos;

import org.openqa.selenium.By;

public class Elementos {
    /**
     * Elementos do registros
     *
     * @utor Adilson Theodoro QA Tester
     */
    public By login = By.xpath("//i[@class='fa fa-user']");
    public By email = By.id("user");
    public By password = By.id("password");
    public By btnLogin = By.id("btnLogin");


    /**
     * Método mensagem esperada
     */

    public By MsgValidada = By.xpath("//*[text()='Login realizado']");

    /**
     * Método mensagem de login email  invalido
     */
    public By MsgEsperada = By.xpath("//*[text()='E-mail inválido.']");

    /**
     * método para validar mensagem de erro login
     */
   // public By MsgAlerta = By.id("createAccount");


}