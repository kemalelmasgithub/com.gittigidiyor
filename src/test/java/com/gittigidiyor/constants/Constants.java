package com.gittigidiyor.constants;

import org.openqa.selenium.By;

public class Constants {

    public static final By LOGIN_BUTTON = By.cssSelector("div[class='ButtonInner-sc-14ud5tc-0 iebPZv encore-inverted-light-set']");
    public static final By EMAIL_BOX = By.cssSelector("#login-username");
    public static final By PASSWORD_BOX = By.cssSelector("#login-password");
    public static final By SUBMIT_BUTTON = By.cssSelector("button[type='submit']");
    public static final By CREATE_PLAYLIST_BUTTON = By.cssSelector("button[data-testid='create-playlist-button']");
    public static final By PLAYLIST_NAME_EDIT_BUTTON = By.cssSelector("h1[class='Type__TypeElement-goli3j-0 hVBZRJ']");
    public static final By PLAYLIST_NAME_EDIT_BOX = By.cssSelector("input[data-testid='playlist-edit-details-name-input']");
    public static final By PLAYLIST_NAME_SAVE_BUTTON = By.cssSelector("button[data-testid='playlist-edit-details-save-button']");
    public static final By SEARCH_BOX = By.cssSelector("input[data-cy='header-search-input']"); //yenilendi
    public static final By ADD_BUTTON = By.xpath("//div[@aria-rowindex='2']//button[@aria-label='Çalma Listesine ekle']");
    public static final By ELEMENT_LIST = By.xpath("Burayı doldur");
    public static final By POPUP = By.cssSelector("a[class='tyj39b-5 bEEsJG']");
    public static final By SECOND_PAGE =  By.cssSelector("a[aria-label='2. sayfa']");



}
