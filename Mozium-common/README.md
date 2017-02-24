# MoziumAppTest

This project aims to show some example on the use of Mozium Framework on mobile apps.

In this example there a list of tests of the application MoziumApp.

There are multiple configuration executions on Android/IOS, Smartphone/Ipad, Simulator/RealDevice.

To install the project you have just to clone it from git. (Think to get TestNG plugin on your eclipce)

To install the application on the simulator or the real device you have to :
   - call adb devices : to see the list of connected device. Fro simulator I advice to use Genimotion.
   - call adb install after change directory to the application location.
   - you are ready to lanch tests: just Add a testNg execution and add point to the testNG.xml file that you use. You can customise a list of parmas in environment section like : browserName, environment, language, resolutionFormat.
