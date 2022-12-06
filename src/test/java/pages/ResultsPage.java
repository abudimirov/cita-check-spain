package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsPage {
    public static SelenideElement noCitaAvailable = $(byText("En este momento no hay citas disponibles."));
}
