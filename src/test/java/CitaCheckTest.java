import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.ActionsPage;
import pages.FillDocumentsPage;
import pages.InformationPage;
import pages.InternetCitaPreviaPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static pages.ResultsPage.noCitaAvailable;

public class CitaCheckTest {
    final static String NATIONALITY = "RUSIA";
    final static String NIE = "XXXXXXXX";
    final static String NAME = "Ivan Ivanov";
    final static String START_URL = "https://icp.administracionelectronica.gob.es/icpplus/citar?p=46&locale=es";

    @BeforeAll
    static void init() {
        Configuration.browser = "firefox";
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }

    @Test
    void citaSearch_ALZIRA() {
        citaSearch(Office.ALZIRA.getAddress());
    }

    @Test
    void citaSearch_GANDIA() {
        citaSearch(Office.GANDIA.getAddress());
    }

    @Test
    void citaSearch_ONTENIENTE() {
        citaSearch(Office.ONTENIENTE.getAddress());
    }

    @Test
    void citaSearch_SAGUNTO() {
        citaSearch(Office.SAGUNTO.getAddress());
    }

    @Test
    void citaSearch_PATRAIX() {
        citaSearch(Office.PATRAIX.getAddress());
    }

    private void citaSearch(final String office) {
        open(START_URL);
        final var internetCitaPage = new InternetCitaPreviaPage();
        internetCitaPage.chooseOffice(office);
        internetCitaPage.submitForm();
        sleep(1000);
        new InformationPage().acceptEverything();
        sleep(1000);
        final var applicantsDocumentsPage = new FillDocumentsPage();
        applicantsDocumentsPage.fillFormWithDocuments(NIE, NAME, NATIONALITY);
        applicantsDocumentsPage.sendForm();
        new ActionsPage().requestCita();
        assertFalse(noCitaAvailable.exists());
    }
}
