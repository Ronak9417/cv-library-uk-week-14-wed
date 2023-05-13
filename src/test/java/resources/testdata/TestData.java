package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"QA Tester", "Croydon", "15 miles", "35000", "400000", "Per month", "Contract", "Contract Qa Tester jobs in Croydon"},
                {"Automation Tester", "London", "7 miles", "40000", "300000", "Per week", "Permanent", "Permanent Automation Tester jobs in London"},
                {"Automation Engineer", "East London", "2 miles", "45000", "500000", "Per annum", "Part Time", "Part Time Automation Engineer jobs in East London"},

        };
        return data;
    }


}
