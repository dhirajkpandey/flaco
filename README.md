# flaconi project
1. This project has been built using Maven, TestNG, Selenium WebDriver and java. In order to make project clean and scalable Page Object 
Design pattern was followed to create framework.

2. To run this project following steps are needed:-

	Step 1. Download Eclipse from url-"https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygenm2"

	Step 2. Before launching eclipse make sure that jdk version 1.8.0 or above is installed and java path is set in Environment 		variables.
  	Step 3. Maven 3.5.4 is installed in the system and MAVEN_HOME and classpath of maven bin is set in Environment variables.
  	go to terminal and execute "mvn --version" to make sure maven is installed and classpath is set.

3. Extract downloaded eclipse and inside the folder click on eclipse icon

4. In eclipse-> Click on Help Menu-> Eclipse Marketplace->Search for plugin "maven integration for eclipse" and install it if it is not installed with eclipse.

5. Install plugin testng and plugin for git following above step

6. Restart eclipse again

7. Click on File Menu->import-> a wizard will open->select Git->Projects from Git and clcik Next->in next screen select Clone URI 
   in next screen enter URI "https://github.com/dhirajkpandey/flaco" enter user name and password(Please check email for username password)

8. In next screen check master and click next-> select destination directory->select option "Import existing Eclipse project" ->next->Finish 
   Maven will automatically download all required files.

9. If still project branch is showing error Right click on project->Maven->Update Project

10. In order to run project go to project folder and execute command "mvn clean test" on cmd or terminal
test will run and report will be generated in target\surefire-reports folder of the project, click on emailable-report.
