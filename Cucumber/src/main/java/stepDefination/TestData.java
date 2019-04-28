package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class TestData {
	
	
	@Given("^I get data from datatable$")
	public void i_get_data_from_datatable(DataTable data) throws Throwable {
		System.out.println(data);
		List<List<String>> li = data.raw();
		
	System.out.println("Name : "+li.get(1).get(0)+" City : "+li.get(1).get(1)+"Zip :"+li.get(1).get(2));
	}

}
