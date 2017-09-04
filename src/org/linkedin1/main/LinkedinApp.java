package org.linkedin1.main;

import java.util.ResourceBundle;

import org.linkedin1.pages.CommonUtil;
public class LinkedinApp {

	public static void main(String[] args) {

		ResourceBundle pageprop =ResourceBundle.getBundle("prop");
		CommonUtil utilities = new CommonUtil(pageprop.getString("url"), pageprop.getString("waitingtime"),pageprop.getString("browser"));
		
		utilities.clickurl(pageprop.getString("privacypolicyxpath"));
		utilities.navigateback();
		utilities.txtField(pageprop.getString("firstnamexpath"), pageprop.getString("text1"));
		utilities.txtField(pageprop.getString("lastnamexpath"), pageprop.getString("text2"));
		utilities.txtField(pageprop.getString("emailxpath"), pageprop.getString("text3"));
		utilities.txtField(pageprop.getString("passwordxpath"), pageprop.getString("text4"));
		
	}
}
