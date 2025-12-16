package com.demo.qa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHubbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHubbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHubbyCheckbox = By.id("hobbies-checkbox-3");

    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsHubbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHubbyCheckbox);
            clickJS(sportsHubbyCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingHubbyCheckbox).isSelected()) {
            scrollToElementJS(readingHubbyCheckbox);
            clickJS(readingHubbyCheckbox);
        }
    }
    public void clickMusicCheckbox() {
        if (!find(musicHubbyCheckbox).isSelected()) {
            scrollToElementJS(musicHubbyCheckbox);
            clickJS(musicHubbyCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingHubbyCheckbox).isSelected()) {
            scrollToElementJS(readingHubbyCheckbox);
            clickJS(readingHubbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHubbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
//        scrollToElementJS(submitButton);
        click(submitButton);
    }
}
