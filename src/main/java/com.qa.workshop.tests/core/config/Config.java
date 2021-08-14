package com.qa.workshop.tests.core.config;

public class Config {
    public static final String frontUrl = System.getProperty("frontUrl") != null
            ? System.getProperty("frontUrl") : "https://www.semrush.com";
}
