package ru.safron.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized = true;
    }

    @AfterAll
    static void afterAll(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
