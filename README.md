# Android Sensor App - README

## Purpose

While the main data collection source offered by the workshop are the iPhones located in the elevators, we wanted 
to offer android device holders and developers an opportunity to customize their data collection setup to their liking by providing
an example Sensor app for android, which functions in a similar fashion to its iOS counterpart. You can use this project in two different
ways: simply install the app on your device and start gathering data (you'll still need Android Studio to install it), or download the code 
and modify it as you please.

## Data Ouput

Here are some details about the data output format for the individual sensors. 

### Barometer

`"pressure"` : Atmospheric pressure in hPa (millibar)

````
{
  "type" : "Barometer"
  "date" : "2016-09-10T12:33:18.413-0200",
  "pressure" : "1013.564",
}
````




