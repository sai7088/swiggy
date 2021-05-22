package swiggy.examples.report;

import com.crowdar.driver.DriverManager;
import io.lippia.reporter.cucumber4.adapter.LippiaReportServerCucumberZaleniumAdapter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Reporter extends LippiaReportServerCucumberZaleniumAdapter {

	public Reporter(String arg) {
		super(arg);
	}

	@Override
	public String getBase64Image() {
		return  ((TakesScreenshot) DriverManager.getDriverInstance()).getScreenshotAs(OutputType.BASE64);
	}
	
}
