package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class FillDocumentsPage {
    public void fillFormWithDocuments(final String nie, final String applicantName, final String nationality) {
        $("#txtIdCitado").sendKeys(nie);
        $("#txtDesCitado").sendKeys(applicantName);
        $(byXpath("//*[@id=\"txtPaisNac\"]")).selectOption(nationality);
    }

    public void sendForm() {
        sleep(1000);
        $("#btnEnviar").submit();
    }
}
