# ClipBoardHealth
This repo is used to create a framework and add few automation test cases for ClipBoardHealth interview process.

This Project uses a Hybrid Framework where Maven is used as a Build Tool, with TDD approach and usinf Page Object Model. The Test classes and 
Page objects wrtitten on Selenide wrapper.


**Getting Started**

Download any of the IDE to run the framework

IntelliJ- https://www.jetbrains.com/idea/download/#section=windows 

Eclipse - https://www.eclipse.org/downloads/

**Running Examples**

Download the zip or clone the Git repository.

Unzip the zip file (if you downloaded one).

Open Command Prompt and Change directory (cd) to folder where ypou want to clone

Open IntelliJ/Eclipse

File -> Open -> Navigate to the folder where you unzipped the zip

Select the right project

Once the project is loaded in your IDE, give a force Build (In IntelliJ > Build > BuildProject & In Eclipse > Right click on Project > 
Update Project > Check Force update of Snapshots/Releases) 


You are all Set


**Folder Structure: **

The Project has two folders under src folder

**1.main**

**2.test**

main Folder has pageObjects for each page of the application and a resources folder where framework base class, properties, logs, reporting 

configurations are defined.

pageObjects: pageObjects are written using POM and Selenide wrapper, elements are identified using By keyword and respective action method is created 

for each element thus achieving the Abstraction and Encapsulation.

test folder contains the test classes for each test case and they are wrapped with testNG annotations. Each test class will be extended by the base class.

The base class has the browser setup and initialization methods, properties file loading and other utility methods. In the test class all the pageObject

classes objects have been created so that user can access the methods inside pageObject classes.

**pom.xml:** It has all the dependencies used in the project.

**testng.xml:**  It is used to run the test classes by package type, suite, or by individual classes. This is also used for Parallel testing as well as used 

mainly while integrating with any CI/CD tool.

Once you are comfortable with the framework structure, go to any test file and Run the test case. User can find the logs and reports in the respective

folders  of the framework.


Thank you for reading, as I strive to improve everyday, reqursting you to suggest me any improvements at venkatesh.andea@gmail.com .






