package com.qa.workshop.tests.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import com.qa.workshop.tests.core.config.Constants;
import com.qa.workshop.tests.ui.elements.SubscriptionBlock;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

class Page<Page> {
    private final String url;

    protected SelenideElement findElement(String testAttributeValue) {
        return $(new ByAttribute(Constants.DATA_TEST, testAttributeValue));
    }

    protected ElementsCollection findElements(String testAttributeValue) {
        return $$(new ByAttribute(Constants.DATA_TEST, testAttributeValue));
    }

    Page(String url) {
        this.url = url;
    }

    public Page open() {
        Selenide.open(url);
        return (Page) this;
    }

    public SubscriptionBlock getSubscriptionBlock() {
        return new SubscriptionBlock();
    }
}
