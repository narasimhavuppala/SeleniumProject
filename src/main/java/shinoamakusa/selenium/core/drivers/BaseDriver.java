package shinoamakusa.selenium.core.drivers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import shinoamakusa.selenium.core.elements.ByLocator;
import shinoamakusa.selenium.core.elements.BaseElement;

/**
 * Class representing a browser page and its elements Wrapper class for Selenium
 * WebDriver
 * 
 * @author Oleg Kravenkov
 *
 */
public class BaseDriver {

	/**
	 * Selenium WebDriver
	 */
	protected WebDriver driver;

	/**
	 * Selenium WebDriver wait
	 */
	protected WebDriverWait wait;

	/**
	 * BaseDriver class constructor
	 */
	public BaseDriver() {

	}

	/**
	 * Finds all page elements by attribute
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByAttribute(final String attributeName) {
		return findAll(ByLocator.attribute(attributeName));
	}

	/**
	 * Finds all page elements by attribute value
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @param attributeValue
	 *            Attribute value
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByAttribute(final String attributeName, final String attributeValue) {
		return findAll(ByLocator.attribute(attributeName, attributeValue));
	}

	/**
	 * Finds all page elements by CSS class name
	 * 
	 * @param className
	 *            CSS class name
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByClass(final String className) {
		return findAll(ByLocator.className(className));
	}

	/**
	 * Finds all page elements by CSS class name
	 * 
	 * @param cssSelector
	 *            CSS class name
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByCssSelector(final String cssSelector) {
		return findAll(ByLocator.cssSelector(cssSelector));
	}

	/**
	 * Finds all page elements by ID attribute
	 * 
	 * @param id
	 *            Value of ID attribute
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByID(final String id) {
		return findAll(ByLocator.id(id));
	}

	/**
	 * Finds page elements matched by a locator
	 * 
	 * @param locator
	 *            ByLocator
	 * @return List of matched elements, null otherwise
	 */
	public List<BaseElement> findAllByLocator(final By locator) {
		return findAll(locator);
	}

	/**
	 * Finds all page elements by NAME attribute
	 * 
	 * @param name
	 *            Value of NAME attribute
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByName(final String name) {
		return findAll(ByLocator.name(name));
	}

	/**
	 * Finds all page elements by HTML tag
	 * 
	 * @param tag
	 *            HTML tag
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByTag(final String tag) {
		return findAll(ByLocator.tag(tag));
	}

	/**
	 * Finds all page elements by text value
	 * 
	 * @param value
	 *            Element text value
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByText(final String value) {
		return findAll(ByLocator.text(value));
	}

	/**
	 * Finds all page elements by text value
	 * 
	 * @param value
	 *            Element text value
	 * @return List of page elements matched
	 */
	public List<BaseElement> findAllByXPath(final String value) {
		return findAll(ByLocator.xpath(value));
	}

	/**
	 * Finds first page container by attribute
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @return First page container matched
	 */
	public BaseElement findByAttribute(final String attributeName) {
		return findByAttribute(attributeName, 1);
	}

	/**
	 * Finds a page container by attribute
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @param num
	 *            Number in the list of all elements matched
	 * @return Page container matched
	 */
	public BaseElement findByAttribute(final String attributeName, final int num) {
		return findBy(ByLocator.attribute(attributeName), num);
	}

	/**
	 * Finds first page container by attribute value
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @param attributeValue
	 *            Attribute value
	 * @return First page container matched
	 */
	public BaseElement findByAttribute(final String attributeName, final String attributeValue) {
		return findByAttribute(attributeName, attributeValue, 1);
	}

	/**
	 * Finds a page container by attribute value
	 * 
	 * @param attributeName
	 *            Attribute name
	 * @param attributeValue
	 *            Attribute value
	 * @param num
	 *            Number in the list of all elements matched
	 * @return Page container matched
	 */
	public BaseElement findByAttribute(final String attributeName, final String attributeValue, final int num) {
		return findBy(ByLocator.attribute(attributeName, attributeValue), num);
	}

	/**
	 * Finds first page container by CSS class name
	 * 
	 * @param className
	 *            CSS class name
	 * @return First page container matched
	 */
	public BaseElement findByClass(final String className) {
		return findByClass(className, 1);
	}

	/**
	 * Finds a page container by CSS class name
	 * 
	 * @param className
	 *            CSS class name
	 * @param num
	 *            Number in the list of all elements matched
	 * @return Page container matched
	 */
	public BaseElement findByClass(final String className, final int num) {
		return findBy(ByLocator.className(className), num);
	}

	/**
	 * Finds first page container by CSS class name
	 * 
	 * @param cssSelector
	 *            CSS class name
	 * @return First page container matched
	 */
	public BaseElement findByCssSelector(final String cssSelector) {
		return findByCssSelector(cssSelector, 1);
	}

	/**
	 * Finds a page container by CSS class name
	 * 
	 * @param cssSekector
	 *            CSS class name
	 * @param num
	 *            Number in the list of all elements matched
	 * @return Page container matched
	 */
	public BaseElement findByCssSelector(final String cssSekector, final int num) {
		return findBy(ByLocator.cssSelector(cssSekector), num);
	}

	/**
	 * Finds first page container by ID attribute
	 * 
	 * @param id
	 *            Value of ID attribute
	 * @return First page container matched
	 */
	public BaseElement findByID(final String id) {
		return findByID(id, 1);
	}

	/**
	 * Finds a page container by ID attribute
	 * 
	 * @param id
	 *            Value of ID attribute
	 * @param num
	 *            Number in the list off all elements matched
	 * @return List of page elements matched
	 */

	public BaseElement findByID(final String id, final int num) {
		return findBy(ByLocator.id(id), num);
	}

	/**
	 * Finds first page container matched by a locator
	 * 
	 * @param locator
	 *            ByLocator
	 * @return First elements matched
	 */
	public BaseElement findByLocator(final By locator) {
		return findByLocator(locator, 1);
	}

	/**
	 * Finds a page container matched by a locator
	 * 
	 * @param locator
	 *            Element locator
	 * @param num
	 *            Number in matched elements sequence
	 * @return Element matched, null otherwise
	 */
	public BaseElement findByLocator(final By locator, final int num) {
		return findBy(locator, num);
	}

	/**
	 * Finds first page container by NAME attribute
	 * 
	 * @param name
	 *            Value of NAME attribute
	 * @return First page container matched
	 */
	public BaseElement findByName(final String name) {
		return findByName(name, 1);
	}

	/**
	 * Finds a page container by NAME attribute
	 * 
	 * @param name
	 *            Value of NAME attribute
	 * @param num
	 *            Number in the list off all elements matched
	 * @return List of page elements matched
	 */
	public BaseElement findByName(final String name, final int num) {
		return findBy(ByLocator.name(name), num);
	}

	/**
	 * Finds first page container by HTML tag
	 * 
	 * @param tag
	 *            HTML tag
	 * @return First page container matched
	 */
	public BaseElement findByTag(final String tag) {
		return findByTag(tag, 1);
	}

	/**
	 * Finds a page container by HTML tag
	 * 
	 * @param tag
	 *            HTML tag
	 * @param num
	 *            Number in the list off all elements matched
	 * @return List of page elements matched
	 */
	public BaseElement findByTag(final String tag, final int num) {
		return findBy(ByLocator.tag(tag), num);
	}

	/**
	 * Finds first page container by text value
	 * 
	 * @param value
	 *            Element text value
	 * @return First page container matched
	 */
	public BaseElement findByText(final String value) {
		return findByText(value, 1);
	}

	/**
	 * Finds a page container by text value
	 * 
	 * @param value
	 *            Element text value
	 * @param num
	 *            Number in the list off all elements matched
	 * @return List of page elements matched
	 */
	public BaseElement findByText(final String value, final int num) {
		return findBy(ByLocator.text(value), num);
	}

	/**
	 * Finds first page container by XPath
	 * 
	 * @param value
	 *            XPath value
	 * @return First page container matched
	 */
	public BaseElement findByXPath(final String value) {
		return findByXPath(value, 1);
	}

	/**
	 * Finds a page container by XPath
	 * 
	 * @param value
	 *            XPath value
	 * @param num
	 *            Number in the list off all elements matched
	 * @return List of page elements matched
	 */
	public BaseElement findByXPath(final String value, final int num) {
		return findBy(ByLocator.xpath(value), num);
	}

	/**
	 * Gets page title
	 * 
	 * @return Page title
	 */
	public String getTitle() {
		if (driver != null) {
			return driver.getTitle();
		}
		return StringUtils.EMPTY;
	}

	/**
	 * Gets page Url
	 * 
	 * @return Page Url
	 */
	public String getUrl() {
		if (driver != null) {
			return driver.getCurrentUrl();
		}
		return StringUtils.EMPTY;
	}

	/**
	 * Determines if correct page has been loaded based on partial Title
	 * 
	 * @param partialTitle
	 *            Part of title that must exist in full page title
	 * @return true if correct page is loaded, false otherwise
	 */
	public boolean titleContains(final String partialTitle) {
		if (wait != null && !StringUtils.isBlank(partialTitle)) {
			try {
				return wait.until(ExpectedConditions.titleContains(partialTitle));
			} catch (TimeoutException t) {
				return false;
			}

		}
		return false;
	}

	/**
	 * Determines if current page Title is equal to expected one
	 * 
	 * @param title
	 *            Full expected page title
	 * @return true if correct page is loaded, false otherwise
	 */
	public boolean titleIs(final String title) {
		if (wait != null && !StringUtils.isBlank(title)) {
			try {
				return wait.until(ExpectedConditions.titleIs(title));
			} catch (TimeoutException t) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Determines if correct page has been loaded based on Url part
	 * 
	 * @param partialURL
	 *            Part of Url that must exist in full Url
	 * @return true if correct page is loaded, false otherwise
	 */
	public boolean urlContains(final String partialURL) {
		if (wait != null && !StringUtils.isBlank(partialURL)) {
			try {
				return wait.until(ExpectedConditions.urlContains(partialURL));
			} catch (TimeoutException t) {
				return false;
			}

		}
		return false;
	}

	/**
	 * Determines if current page URL is equal to one expected
	 * 
	 * @param url
	 *            Full expected page url
	 * @return true if correct page is loaded, false otherwise
	 */
	public boolean urlIs(final String url) {
		if (wait != null && !StringUtils.isBlank(url)) {
			try {
				return wait.until(ExpectedConditions.urlToBe(url));
			} catch (TimeoutException t) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Generates a wait timeout
	 * 
	 * @param seconds
	 *            Seconds to wait
	 */
	public void waitFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Finds all elements matched by specified locator
	 * 
	 * @param locator
	 *            Element matching locator
	 * @return List of elements matched on success, null otherwise
	 */
	private List<BaseElement> findAll(final By locator) {
		if (wait != null && locator != null) {
			try {
				List<BaseElement> list = new ArrayList<BaseElement>();
				List<WebElement> webList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
				for (WebElement element : webList) {
					list.add(new BaseElement(locator, element));
				}

				return list;
			} catch (TimeoutException t) {
				return new ArrayList<BaseElement>();
			}
		}
		return null;
	}

	/**
	 * Finds a specific container matched by locator and is specific number index in
	 * list of all elements matched
	 * 
	 * @param locator
	 *            Element locator
	 * @param num
	 *            Number index in list of elements
	 * @return Matched container on success, null otherwise
	 */
	private BaseElement findBy(final By locator, final int num) {
		List<BaseElement> elementList = findAll(locator);
		if (elementList != null && elementList.size() >= num) {
			BaseElement element = elementList.get(num - 1);
			return element;
		} else
			return new BaseElement();
	}

}
