package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {
//overwrite the find element method.

	public WebElement getWebElemnt(String indentifierType, String indentifierValue)

	{
		switch (indentifierType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(indentifierValue));

		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(indentifierValue));

		case "ID":
			return BaseTest.driver.findElement(By.id(indentifierValue));

		case "NAME":
			return BaseTest.driver.findElement(By.className(indentifierValue));

		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(indentifierValue));

		default:
			return null;
		}
	}

	public List<WebElement> getWebElemnts(String indentifierType, String indentifierValue) {
		switch (indentifierType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(indentifierValue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(indentifierValue));

		case "ID":
			return BaseTest.driver.findElements(By.id(indentifierValue));

		case "NAME":
			return BaseTest.driver.findElements(By.className(indentifierValue));

		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(indentifierValue));

		default:
			return null;
		}

	}
}
