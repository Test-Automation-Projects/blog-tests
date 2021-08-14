package com.qa.workshop.tests.ui.elements;

import com.codeborne.selenide.SelenideElement;

public class SubscriptionBlock extends Element<SubscriptionBlock> {
    private final SelenideElement title = findElement("subscription-title");
    private final SelenideElement text = findElement("subscription-text");
    private final SelenideElement input = findElement("subscription-input");
    private final SelenideElement subscribe = findElement("button-secondary");

    public SubscriptionBlock() {
        super("subscription-block");
    }

    public SubscriptionBlock subscribe(String email) {
        input.find("input").sendKeys(email);
        subscribe.click();
        return this;
    }

    public SelenideElement getSuccessMessage() {
        return findElement("subscription-success");
    }
}
