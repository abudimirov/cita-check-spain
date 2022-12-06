package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class InternetCitaPreviaPage {
    final static String EXPEDITION_DE_TARJETA_VALUE = "4010";

    public void chooseOffice(final String officeName) {
        $(byXpath("//*[@id=\"sede\"]")).shouldBe(visible);
        $(byXpath("//*[@id=\"sede\"]")).selectOptionContainingText(officeName);
        sleep(1000);
        $(byXpath("//*[@id=\"tramiteGrupo[0]\"]")).shouldBe(visible);
        $(byXpath("//*[@id=\"tramiteGrupo[0]\"]")).selectOptionByValue(EXPEDITION_DE_TARJETA_VALUE);
    }

    public void sendForm() {
        executeJavaScript("envia()");
        sleep(1000);
    }
}
