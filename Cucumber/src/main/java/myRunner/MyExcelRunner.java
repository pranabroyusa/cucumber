package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","json:target/cucumber.json"},
features={"C:\\Users\\Pranab Roy\\workspace\\Cucumber\\Features\\ExcelReader.feature"},
glue={"stepDefination\\ExcelReader"},
dryRun = true,
tags={"@ExcelTest"})

public class MyExcelRunner {

}
