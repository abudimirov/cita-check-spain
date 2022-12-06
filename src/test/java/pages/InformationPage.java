package pages;

import static com.codeborne.selenide.Selenide.$;

public class InformationPage {
    public void acceptEverything() {
        $("btnEntrar").submit();
    }
}
