import org.junit.jupiter.api.Test;
import pages.InformationPage;
import pages.InternetCitaPreviaPage;

import static com.codeborne.selenide.Selenide.open;

public class CitaCheckTest {
    final static String START_URL = "https://icp.administracionelectronica.gob.es/icpplus/citar?p=46&locale=es";
    final static String ALZIRA = "CNP COMISARIA DE ALZIRA, Pere Morell, 4";

    @Test
    public void citaSearch_ALZIRA() {
        open(START_URL);
        final var internetCitaPage = new InternetCitaPreviaPage();
        internetCitaPage.chooseOffice(ALZIRA);
        internetCitaPage.sendForm();
        new InformationPage().acceptEverything();
    }
}
