package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class InformationPage {
    public void acceptEverything() {
        $(byXpath("//*[@id=\"btnEntrar\"]")).submit();
    }
}
