# esp8266app
Mobile aplication developed with Android Studio. The result of this work should be an android application that receives csv files from Node MCU esp8266 board.

- May 2018

AndroidStudio setup:

1) Dowload the IDE: https://developer.android.com/

2) Install aditional packages that will be necessary (Android 7.1, Playstore, etc);

3) Choose between using a Virtual Emulator or using an actual phone with Android OS:

3.1) Prepare Virtual Emulator: choose device and install the OS required.

3.2) Setup your device to developer mode: https://developer.android.com/studio/debug/dev-options

Reference:
https://www.youtube.com/watch?v=vjWDDY0tZuA

https://www.youtube.com/watch?v=cG9TR3VBhxg

June 2018

- June 5th
Lattest reference found:

https://www.youtube.com/watch?v=36ZlmLwqkS4&list=PLssIKrX2yyQFR3HDZwi2LZu6fR6VhhCrl&index=2

This is a video series which teaches to make a WebServer using Node MCU and latter create an adroid application to control it.

Study the "ESP8266WiFi.h" library to understand better the tools avaiable.

- June 19th

Started the Android Studio part of the tutorial. 

Studied differences between Java and Koitlin: 
https://www.androidauthority.com/kotlin-vs-java-783187/
https://www.androidauthority.com/kotlin-language-android-development-773040/

Notes on Gradle

The tutorial says to fo to http://square.github.io/okhttp/ and copy compile 'com.squareup.okhttp3:okhttp:3.10.0' from the download area. IDE says that "compile" is now obsolete and has been replaced by "implementation", so just replace compile by implementation.
