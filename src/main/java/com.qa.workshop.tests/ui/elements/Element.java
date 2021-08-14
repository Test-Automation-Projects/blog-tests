package com.qa.workshop.tests.ui.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import com.qa.workshop.tests.core.config.Constants;

class Element<Element> {
    private final SelenideElement element;

    Element(SelenideElement element) {
        this.element = element;
    }

    Element(String testAttributeValue) {
        this.element = Selenide.$(new ByAttribute(Constants.DATA_TEST, testAttributeValue));
    }

    public SelenideElement getElement() {
        return element;
    }

    public Element checkElementIsVisible() {
        element.shouldBe(Condition.visible);
        return (Element) this;
    }

    protected SelenideElement findElement(String testAttributeValue) {
        return element.$(new ByAttribute(Constants.DATA_TEST, testAttributeValue));
    }

    protected ElementsCollection findElements(String testAttributeValue) {
        return element.$$(new ByAttribute(Constants.DATA_TEST, testAttributeValue));
    }
}
