package com.screenitMobile;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class sample {
	
	
	
	@Test
	
	public void setup(){
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		caps.setCapability("deviceName", "Andriod SDK built for x86");
		
		

		
		
		
	}

}
