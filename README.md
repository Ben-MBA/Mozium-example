#Mozium

This project is a parent for the both of exmples web and mobile using Mozium Framework.

#Installation : 
You have just to clone the project. Open it with eclipse and then Enjoy testing!

#Execution
You need just to have testNG pre-installed in your eclipse.

For the Web example : You have just to create a TestNG execution configuration and that's all!
You can cutomize the folowing params : 
	- browserName
	- resolutionFormat [tablet/smartphone/desktop]
	- language
	- environment
	
For the Mobile example : It is the same way just you have to install the application in the simulator or on the real device using the adb tool.
Or by specifying the app absolute path in the app parameter.
I advice to use for android simulator, Genemotion.

You can launch tests by using mvn test -P<profileName> -language $language -resolutionFormat $resolutionFromat ...
