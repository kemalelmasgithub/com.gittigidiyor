package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.gittigidiyor.constants.Constants.*;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }


    public LoginPage clickLogin(){
        click(LOGIN_BUTTON);
        return this;
    }
    public LoginPage sendKeysEmailBox(){
        clear(EMAIL_BOX);
        sendKeys(EMAIL_BOX,"kemalelmas03@gmail.com");
        return this;
    }
    public LoginPage sendKeysPassword(){
        clear(PASSWORD_BOX);
        sendKeys(PASSWORD_BOX,"Gizli1$ey");
        return this;
    }
    public LoginPage clickSubmitButton(){
        click(SUBMIT_BUTTON);
        return this;
    }
    public LoginPage clickCreatePlaylistButton(){
        click(CREATE_PLAYLIST_BUTTON);
        return this;
    }
    public LoginPage clickPlaylistNameEditButton(){
        click(PLAYLIST_NAME_EDIT_BUTTON);
        return this;

    }
    public LoginPage sendKeysEditPlaylistName(){
        clear(PLAYLIST_NAME_EDIT_BOX);
        sendKeys(PLAYLIST_NAME_EDIT_BOX,"MentorLabsChallenge");
        click(PLAYLIST_NAME_SAVE_BUTTON);
        return this;
    }
    public LoginPage sendKeysSearchBox(){
        clear(SEARCH_BOX);
        sendKeys(SEARCH_BOX,"Bilgisayar");
        return this;
    }
    public LoginPage clickAddButton(){
        click(ADD_BUTTON);
        return this;
    }
    public LoginPage popupKapatma(){
        click(POPUP);
        return this;
    }
    public LoginPage secondPage(){
        click(SECOND_PAGE);
        return this;
    }
    public LoginPage scroll(){
        hoverElement(SECOND_PAGE);
        return this;
    }
}
