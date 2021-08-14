package com.qa.workshop.tests.ui;

import com.codeborne.selenide.Condition;
import com.qa.workshop.tests.ui.pages.BlogPage;
import org.junit.jupiter.api.Test;

public class SubscriptionBlockTest extends BaseUITest {
    @Test
    public void userCanSubscribeOnBlog() {
        var email = "test@gmail.com";

        new BlogPage()
                .open()
                .getSubscriptionBlock()
                .subscribe(email)
                .getSuccessMessage()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.exactTextCaseSensitive("Yeah!You’ve successfully\nsubscribed to a newsletter"));
    }
}
