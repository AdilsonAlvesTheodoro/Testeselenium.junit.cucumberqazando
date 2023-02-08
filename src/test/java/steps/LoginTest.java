package steps;

import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;


public class LoginTest {
    Metodos metodos = new Metodos();
    Elementos el = new Elementos();


    @Given("que esteja na tela de login")
    public void que_esteja_na_tela_de_login() {
        Executa.abrirNavegador();
        metodos.clicar(el.login);
    }

    @And("preencher o usuario")
    public void preencher_o_usuario() throws InterruptedException {
        Thread.sleep(4000);
        metodos.escrever(el.email, "teste@gmail.com");
    }

    @And("preencher a senha")
    public void preencher_a_senha() {
        metodos.escrever(el.password, "123456");
    }

    @When("realizar o login")
    public void realizar_o_login() {
        metodos.clicar(el.btnLogin);
    }

    @Then("login realizado com sucesso")
    public void login_realizado_com_sucesso() {
        metodos.validarTexto(el.MsgValidada, "Login realizado");

    }

    @Given("preencher com usuario invalido")
    public void preencher_com_usuario_invalido() throws InterruptedException {
        Thread.sleep(4000);
        metodos.escrever(el.email, "testegmail.com");
    }

    @Given("preencher a senha invalida")
    public void preencher_a_senha_invalida() {
        metodos.escrever(el.password, "123456");

    }

    @Then("sistema apresenta mensagem de usuario email invalido")
    public void sistema_apresenta_mensagem_de_usuario_e_senha_invalida() {
        metodos.validarMensagemEmail(el.MsgEsperada, "E-mail inválido.");
    }

    }






