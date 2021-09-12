package com.qa.workshop.tests.ui.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;

public class SubscriptionBlock extends Element<SubscriptionBlock> {
    private final SelenideElement title = findElement("subscription-title");
    private final SelenideElement text = findElement("subscription-text");
    private final SelenideElement input = findElement("subscription-input");
    private final SelenideElement subscribe = findElement("button-secondary");
    private final SelenideElement switcher = Selenide.$(new ByAttribute("data-test", "theme-switcher"));

    public SubscriptionBlock() {
        super("subscription-block");
    }
    // дома сделать меню блок
    public SubscriptionBlock subscribe(String email) {
        input.find("input").sendKeys(email);
        subscribe.click();
        return this;
    }

    public SelenideElement getSuccessMessage() {
        return findElement("subscription-success");
    }

    public SubscriptionBlock switchToggle() {
        switcher.click();
        return this;
    }

    //улучшить, связать архитектурно грамотно.
    public void checkColor() {
        Selenide.$(new ByAttribute("data-theme", "light")).shouldBe(Condition.visible);
    }
}
