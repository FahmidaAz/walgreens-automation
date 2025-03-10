package walgreens.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import walgreens.utilities.SetupDrivers;

public class TakeScreenshot {
	
	public void screenshots() throws Exception{
		
		String filename = "Walgreens";
		
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy h-m-s");
		Date date = new Date();
		
		File screenshot = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/screenshots/"+filename+dateFormat.format(date)+".png"));
		
		System.out.println(">>>>>>>> Screenshot Taken >>>>>>>>");
	}
}