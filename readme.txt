
In my QA Automation background. I use TestNG framework with JAVA. To write automation scripts. I even included a chromedriver file which 
should let you start up the chrome browser. Please not this was written assuming the user is using a MAC OS. The files are in automation.test package.

Question #1 

I used a function with a name doesFileExist(String fileLocation) to find the file “fruits.txt” which had the content of the assignment.

 To open the file and read it into the array.
 Then split the string using a “ - “ parameter.
 And use the System out to write out the content.

Question #2

I took a bit of a different approach of writing the code. Using the TestNG framework I created the following
 
@BeforeSuite function to open the URL in the browser.

I wrote a “validatePageTitle” function to check the page title of the page, which will be used in my other tests.

In TestNG a (priority=1) command tells TestNG in what order the execute the functions. 

So after the title validation which is the 1st priority. I tested the following 

Click on search put in a zip code (10011) click on enter key

Printed out the 1st location and the distance.

Clicked on the 1st location 

Note (for the location of the element I would use a list function)

I used a Date Function to find todays date. That helped me to find the hours late on 

Question #3

Created array of integers, using a Random function. Stored the integers into the array. Then sorted the array. And asked the user which number he would want to have printed out. I didn’t write a validation if the user entered a wrong char or a number.