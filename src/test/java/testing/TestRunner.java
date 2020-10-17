package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "~@Ignore",
        glue = {"stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json",
        			"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true)
public class TestRunner {
	
//	@BeforeClass
//	public static void Setup() {
//		Properties prop = new Properties();
//		try {
//			FileInputStream in = new FileInputStream(new File("src/test/java/config/config.properties"));
//			prop.load(in);
//			in.close();
//			for(String key : prop.stringPropertyNames()) {
//				System.out.println("Key : "+key+"; Value : "+prop.getProperty(key));
//			}
//		}catch(FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//		}catch(IOException ioe) {
//			ioe.printStackTrace();
//		}
//		
//	}
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/test/java/config/extent_report-config.xml"));
    
    }
}