/*
 * Copyright (c) 2017, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.selenium.core.page;

import com.github.wasiqb.coteafs.selenium.core.driver.IDriverActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ISelectboxActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;
import com.github.wasiqb.coteafs.selenium.core.enums.WaitStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Wasiq Bhamla
 * @param <D>
 * @param <B>
 * @param <E>
 * @since 08-Jun-2019
 */
public interface IPage<D extends WebDriver, B extends IDriverActions<D>, E extends WebElement> {
    /**
     * @author Wasiq Bhamla
     * @since 14-Oct-2019
     * @param <T>
     * @param pageCls
     * @return next page instance
     */
    <T extends IPage<D, B, E>> T nextPage (Class<T> pageCls);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param locator locator
     * @param name
     * @return element action
     */
    <T extends IMouseActions> T onClickable (By locator, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param locator locator
     * @param name
     * @param strategy strategy
     * @return element action
     */
    <T extends IMouseActions> T onClickable (By locator, final String name, WaitStrategy strategy);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param element element
     * @param name
     * @return element action
     */
    <T extends IMouseActions> T onClickable (E element, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param element element
     * @param name
     * @param strategy wait strategy
     * @return element action
     */
    <T extends IMouseActions> T onClickable (E element, final String name, WaitStrategy strategy);

    /**
     * @author Wasiq Bhamla
     * @since 08-Jun-2019
     * @return driver action
     */
    B onDriver ();

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param locator locator
     * @param name
     * @return element action
     */
    <T extends ISelectboxActions> T onDropdown (By locator, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param locator locator
     * @param name
     * @param strategy strategy
     * @return element action
     */
    <T extends ISelectboxActions> T onDropdown (By locator, final String name, WaitStrategy strategy);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param element element
     * @param name
     * @return element action
     */
    <T extends ISelectboxActions> T onDropdown (E element, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param element element
     * @param name
     * @param strategy strategy
     * @return element action
     */
    <T extends ISelectboxActions> T onDropdown (E element, final String name, WaitStrategy strategy);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param locator locator
     * @param name
     * @return element action
     */
    <T extends ITextboxActions> T onTextbox (By locator, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param locator locator
     * @param name
     * @param strategy strategy
     * @return element action
     */
    <T extends ITextboxActions> T onTextbox (By locator, final String name, WaitStrategy strategy);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 08-Jun-2019
     * @param element element
     * @param name
     * @return element action
     */
    <T extends ITextboxActions> T onTextbox (E element, final String name);

    /**
     * @author Wasiq Bhamla
     * @param <T>
     * @since 12-Jul-2019
     * @param element element
     * @param name
     * @param strategy strategy
     * @return element action
     */
    <T extends ITextboxActions> T onTextbox (E element, final String name, WaitStrategy strategy);
}