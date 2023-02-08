package runner;

import driver.DriversFactory;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = " @loginPositivo or @testeNegativo or @login ",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/report-cucumber.html"},
        snippets = SnippetType.CAMELCASE

)

public class Executa extends DriversFactory {

    public static void abrirNavegador() {
        boolean headless = false;
        String site = "http://automationpratice.com.br/";
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        if (headless) {
            chromeOptions.addArguments("--headless");
        }
        driver = new ChromeDriver(chromeOptions);
        driver.get(site);
    }


}


