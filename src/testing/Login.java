package testing;

import org.testng.annotations.Test;

import base.config;
import locators.LoginLocator;
import values.Fb_Login_Values;

public class Login extends config {

	//codes 
	//extend the config
	//refrence of locator value class 
	
	LoginLocator ff= new LoginLocator();
	Fb_Login_Values gg= new Fb_Login_Values();
	
	@Test
	
	public void hh() {
	typeByxpath (ff.aa,gg.dd);
	typeByxpath(ff.bb,gg.ee);
	clickByxpath(ff.cc);
	
	
	
}
}