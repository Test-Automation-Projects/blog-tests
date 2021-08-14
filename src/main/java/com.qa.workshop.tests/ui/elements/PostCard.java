package com.qa.workshop.tests.ui.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class PostCard extends Element<PostCard> {
    private final SelenideElement image = findElement("image");
    private final SelenideElement imageLink = findElement("image-link");
    private final SelenideElement title = findElement("title");
    private final SelenideElement description = findElement("description");
    private final SelenideElement authorName = findElement("author-name");
    private final SelenideElement date = findElement("date");

    public PostCard(SelenideElement element) {
        super(element);
    }
}
