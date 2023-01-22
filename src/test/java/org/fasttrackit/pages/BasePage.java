package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class BasePage extends PageObject {

    public int getIntFromPrice (String price) {
        return Integer.parseInt(price
                .replaceAll(",", "")
                .replaceAll(" RON", ""));
    }








}
