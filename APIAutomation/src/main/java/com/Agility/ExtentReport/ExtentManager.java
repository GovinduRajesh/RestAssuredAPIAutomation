package com.Agility.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {

	private static ExtentReports extent;
	
	
	

	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	       
	        
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "RAJESH GOVINDU");
	        extent.setSystemInfo("Organization", "Agility E Services");
	        extent.setSystemInfo("Project-Module", "Sanction Country-API Testing");
	        extent.setSystemInfo("URL", "http://10.138.108.140:2309/");
	        
	        
	        return extent;
	    }

	    
	  /*  public static String screenshotPath;
		public static String screenshotName;
		
		public static void captureScreenshot() {

			File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

			try {
				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		}*/
	    
	    
		    //public static String screenshotPath;
		/*	public static String screenshotName;
			
			public static void captureScreenshot() {

				//File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				Date d = new Date();
				screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

				try {
					FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
			
			}*/
	

	}
