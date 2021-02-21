
Project Title

	Test automatation for web application thinkmoney.co.uk

Project Description
	
	Cucumber - Java test automation project to validate web application
	
Framework 

	Maven project folder stucture will be like "main/src/test/java/com"
	framework path below
	https://github.com/venkata231/tm_assignment/tree/main/src/test/java/com/learning/assignment
	
Technologies

	Cucumber
	Java
	Maven
	Eclipse IDE

How To Run tests

	Option 1) In Eclipse open "RunCucumberTest.java" file and click on "Run" button on top menu
	 
	Option 2) Navigate to project folder in terminal and run command "mvn test"
	
	Tags:
	
	Using tags we can run all tests at once or else we can choose which paticular tests 
	For All Tests : mvn test -Dcucumber.filter.tags="@smoke"
	For only Home pages test : mvn test -Dcucumber.filter.tags="@home"
	
Reports

	Once you run your tests using "mvn test", report in the format of HTML will be saved under the target folder as "reports.html"
	https://github.com/venkata231/tm_assignment/tree/main/target
	
Result Output from console log

	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.908 sec
	
	Results :
	
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time:  15.394 s
	[INFO] Finished at: 2021-02-21T14:16:24Z
	[INFO] ------------------------------------------------------------------------

 
