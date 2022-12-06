package pages;

import static com.codeborne.selenide.Selenide.$;

public class ActionsPage {
    public void requestCita() {
        $("#btnEnviar").click();
    }
}
