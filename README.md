# WeatherForecast-Assignment1

## Java program to whether forecast based on 2-D Arrays

Problem Statements:
Your client is a weather forecast that needs data to be prepared in specific ways. You are asked to engineer a
class in java that prepares data on rainfall that has been received from different weather stations across the
region. You need to adhere to certain specifications, so the data provided by your class can be successfully
utilized.
## The following specifications have been agreed upon:
The name of the class is Rainfall.
It needs to store the data received from the weather stations. The data is provided in the following format:
The rainfall data measured by the weather stations in the region is given as a two dimensional int array.
Each row of the array corresponds to a certain weather station, while each column of the array corresponds
to a certain day.

# Method 1 - dataPreparation
The class Rainfall needs a method called dataPreparation which processes the data that has been stored
in the class. It returns a two-dimensional int array with the correctly processed data.
The rainfall data received from the weather stations can be faulty: Sometimes, they malfunction and report
negative numbers. This method needs to handle these cases in certain ways, depending on the day’s weather
descriptor:
• If the weather descriptor is ”sunny”, replace the negative value with 0.
• If the weather descriptor is ”rainy”, replace the negative value with the average1 of the values reported
from the other weather stations of that day. Make sure that you do not include any other negative
values in the calculation of the average, in case more than one weather station has malfunctioned!
• If the weather descriptor is ”thunderstorm”, replace the negative value by its corresponding positive
value.

# Method 2 - totalRainfall
The class Rainfall needs another method called totalRainfall.
This method calculates the total rainfall measured by all weather stations over all days and returns the result
as an int value.
Make sure that you only work with data that has been suﬀiciently prepared using the dataPreparation
method!
Example: Here we have calculated the rainfall total for all stations per day, as well as total rainfall per
station. The overall total that the method in this example should return is 683.

# Method 3 - trend
The final method of the class Rainfall that you need to create is called trend.
It receives an int value n and returns a weather descriptor as a String.
The method’s purpose is to forecast what the weather on the next day will be like, depending on the average2
rainfall per station and day of the past n days.
• If the average rainfall of the past n days was below 50, return ”sunny”.
• If the average rainfall of the past n days was 50 or higher, return ”rainy”.
• Special case: If the average rainfall of the past n days was exactly 75, return ”thunderstorm”.
Make sure that you only work with data that has been suﬀiciently prepared using the dataPreparation
method!

## I have attached the pdf file in this repository.