/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.webcontent.wcwebcontent.addwebcontentreviewdate;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddWebContentReviewDateTest extends BaseTestCase {
	public void testAddWebContentReviewDate() throws Exception {
		selenium.open("/web/guest/home/");
		loadRequiredJavaScriptModules();

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Control Panel")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.clickAt("link=Web Content",
			RuntimeVariables.replace("Web Content"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.clickAt("//input[@value='Add']",
			RuntimeVariables.replace("Add"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.type("//input[@id='_15_title_en_US']",
			RuntimeVariables.replace("Web Content Name"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent(
							"//textarea[@id='_15__15_structure_el_TextAreaField_content' and @style='display: none;']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		assertEquals(RuntimeVariables.replace("Source"),
			selenium.getText("//span[@id='cke_49_label' and .='Source']"));
		selenium.clickAt("//span[@id='cke_49_label' and .='Source']",
			RuntimeVariables.replace("Source"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible(
							"//td[@id='cke_contents__15__15_structure_el_TextAreaField_content']/textarea")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.type("//td[@id='cke_contents__15__15_structure_el_TextAreaField_content']/textarea",
			RuntimeVariables.replace("Web Content Content"));
		assertEquals(RuntimeVariables.replace("Source"),
			selenium.getText("//span[@id='cke_49_label' and .='Source']"));
		selenium.clickAt("//span[@id='cke_49_label' and .='Source']",
			RuntimeVariables.replace("Source"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent(
							"//textarea[@id='_15__15_structure_el_TextAreaField_content' and @style='display: none;']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible(
							"//td[@id='cke_contents__15__15_structure_el_TextAreaField_content']/iframe")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.selectFrame(
			"//td[@id='cke_contents__15__15_structure_el_TextAreaField_content']/iframe");

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (RuntimeVariables.replace("Web Content Content")
										.equals(selenium.getText("//body"))) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.selectFrame("relative=top");
		assertTrue(selenium.isElementPresent(
				"//select[@id='_15_reviewDateMonth' and @disabled='disabled']"));
		assertTrue(selenium.isElementPresent(
				"//select[@id='_15_reviewDateDay' and @disabled='disabled']"));
		assertTrue(selenium.isElementPresent(
				"//select[@id='_15_reviewDateYear' and @disabled='disabled']"));
		assertTrue(selenium.isElementPresent(
				"//select[@name='_15_reviewDateHour' and @disabled='disabled']"));
		assertTrue(selenium.isElementPresent(
				"//select[@name='_15_reviewDateMinute' and @disabled='disabled']"));
		assertTrue(selenium.isElementPresent(
				"//select[@name='_15_reviewDateAmPm' and @disabled='disabled']"));
		assertTrue(selenium.isChecked("//input[@id='_15_neverReviewCheckbox']"));
		selenium.clickAt("//input[@id='_15_neverReviewCheckbox']",
			RuntimeVariables.replace("Never Review"));
		assertFalse(selenium.isChecked("//input[@id='_15_neverReviewCheckbox']"));
		assertFalse(selenium.isElementPresent(
				"//select[@id='_15_reviewDateMonth' and @disabled='disabled']"));
		assertFalse(selenium.isElementPresent(
				"//select[@id='_15_reviewDateDay' and @disabled='disabled']"));
		assertFalse(selenium.isElementPresent(
				"//select[@id='_15_reviewDateYear' and @disabled='disabled']"));
		assertFalse(selenium.isElementPresent(
				"//select[@name='_15_reviewDateHour' and @disabled='disabled']"));
		assertFalse(selenium.isElementPresent(
				"//select[@name='_15_reviewDateMinute' and @disabled='disabled']"));
		assertFalse(selenium.isElementPresent(
				"//select[@name='_15_reviewDateAmPm' and @disabled='disabled']"));
		selenium.select("//select[@id='_15_reviewDateMonth']",
			RuntimeVariables.replace("label=December"));
		selenium.select("//select[@id='_15_reviewDateDay']",
			RuntimeVariables.replace("label=31"));
		selenium.select("//select[@id='_15_reviewDateYear']",
			RuntimeVariables.replace("label=2015"));
		selenium.select("//select[@name='_15_reviewDateHour']",
			RuntimeVariables.replace("label=12"));
		selenium.select("//select[@name='_15_reviewDateMinute']",
			RuntimeVariables.replace("label=:00"));
		selenium.select("//select[@name='_15_reviewDateAmPm']",
			RuntimeVariables.replace("label=AM"));
		selenium.clickAt("//input[@value='Publish']",
			RuntimeVariables.replace("Publish"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals(RuntimeVariables.replace("Web Content Name"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("Approved"),
			selenium.getText("//td[4]/a"));
		selenium.clickAt("//td[3]/a",
			RuntimeVariables.replace("Web Content Name"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent(
							"//textarea[@id='_15__15_structure_el_TextAreaField_content' and @style='display: none;']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		assertFalse(selenium.isChecked("//input[@id='_15_neverReviewCheckbox']"));
		assertEquals("December",
			selenium.getSelectedLabel("//select[@id='_15_reviewDateMonth']"));
		assertEquals("31",
			selenium.getSelectedLabel("//select[@id='_15_reviewDateDay']"));
		assertEquals("2015",
			selenium.getSelectedLabel("//select[@id='_15_reviewDateYear']"));
		assertEquals("12",
			selenium.getSelectedLabel("//select[@name='_15_reviewDateHour']"));
		assertEquals(":00",
			selenium.getSelectedLabel("//select[@name='_15_reviewDateMinute']"));
		assertEquals("AM",
			selenium.getSelectedLabel("//select[@name='_15_reviewDateAmPm']"));
	}
}