package metodos;

import driver.DriversFactory;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Metodos extends DriversFactory {

    /**
     * Método para escrever passando o parametro BY e String com texto
     *
     * @param elemento
     * @param texto
     * @autor Adilson Theodoro Qa Tester
     */
    public void escrever(By elemento, String texto) {
        try {
            driver.findElement(elemento).sendKeys(texto);
        } catch (Exception e) {
            System.out.println("Erro ao tentar escrever no elemento " + elemento);
        }
    }

    /**
     * Método para clicar passando parametro BY
     *
     * @param elemento
     * @autor Adilson Theodoro QA Tester
     */
    public void clicar(By elemento) {
        try {
            driver.findElement(elemento).click();
        } catch (Exception e) {
            System.out.println("Erro ao tentar clicar no elemento " + elemento);
        }
    }

    /**
     * Método para validar mensagens passadno o By ea mensagem desejada
     *
     * @param elemento
     * @param MsgDesejada
     */

    public void validarTexto(By elemento, String MsgDesejada) {
        try {
            String msgCapturada = driver.findElement(elemento).getText();
            assertEquals(MsgDesejada, msgCapturada);
        } catch (Exception e) {
            System.out.println("Erro ao tentar validar a mensagem " + MsgDesejada);
        }

    }

    public void validarMensagemEmail(By elemento, String MsgEsperada) {
        try {
            String msgCapturada1 = driver.findElement(elemento).getText();
            assertEquals(MsgEsperada, msgCapturada1);
        } catch (Exception e) {
            System.out.println("Erro ao tentar validar a mensagem " + MsgEsperada);
        }

    }

    public void MensagemErro(By elemento, String MsgAlerta) {
        try {
            String msgCapturada2 = driver.findElement(elemento).getText();
            assertEquals(MsgAlerta, msgCapturada2);
        } catch (Exception e) {
            System.out.println("Senha inválida." + MsgAlerta);


        }
    }
}