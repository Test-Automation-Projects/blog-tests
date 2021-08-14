package com.qa.workshop.tests;


import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected SoftAssertions softly;

    @BeforeEach
    public void baseSetup() {
        softly = new SoftAssertions();
    }

    @AfterEach
    public void baseDestruct() {
        softly.assertAll();
    }
}
