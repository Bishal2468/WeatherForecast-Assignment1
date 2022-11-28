/*
Matriculation Number -  Name
 761318      : Bishal Karki
 */

public class Rainfall {
	//private initialization of weatherStation and descriptor arrays
	private int[][] weatherStation;
	private String[] descriptor;
	
	//construction of Constructor Rainfall
	public Rainfall(int[][] weatherStation, String[] descriptor) 
	{
		this.weatherStation = weatherStation;
		this.descriptor = descriptor;
	}
	
	// Method dataPreparation that returns 2 dimensional array
	public int[][] dataPreparation()
	{
		for (int i = 0; i < weatherStation.length;++i)
		{
			for (int j= 0; j<weatherStation[i].length;j++) 
			{	
				if (weatherStation[i][j] < 0)
				{
					if(descriptor[j].equalsIgnoreCase("sunny") ) 
						{
							weatherStation[i][j] = 0;	
						}
						else if(descriptor[j].equalsIgnoreCase("rainy") )
						{
							int average, sum = 0, count = 0;
							for (int k = 0; k < weatherStation.length; ++k)
							{
								if( weatherStation[k][j] >=0)
								{
									sum += weatherStation[k][j];
									count +=1;
								}
							}
								if (count==0) count = 1;
								average = sum /count;
								
								weatherStation[i][j] = average;	
							}
							else if(descriptor[j].equalsIgnoreCase("thunderstorm") ) {
								weatherStation[i][j] *= -1 ;
									}
								}
							}
						}
						//System.out.print(weatherStation);
						return weatherStation;
					}
	// Method total rainfall that Calculates total rainfall by all station
	public int totalRainfall()
	{
		int total =0;
		for (int i = 0; i < weatherStation.length;++i)
		{
			for (int j= 0; j<weatherStation[i].length;++j) 
			{
				total += weatherStation[i][j];	
			}
		}
		System.out.println("Over All Total Rainfall :" + total);
		return total;
			}

	// method Trend to forecast descriptor based on n value as parameters
	public String trend(int n)
	{
		String nextDay = null;
		int total =0 , count=0, avg; 
		if (n <= 7)
		{	
		for (int i = 0;i < weatherStation.length ; ++i)
		{
			//for (int j = weatherStation[i].length -1; j>j-n; --j)
			for (int j = weatherStation[i].length -1; j>(weatherStation[i].length-n)-1; --j)
			{
				System.out.print(weatherStation[i][j] + "\t");
				total += weatherStation[i][j];
				count = count + 1;
			}	
		}
		avg = total /count;
		System.out.println("The Average is :" + avg);
		if (avg < 50)
		{
			nextDay = "sunny";
		}
		else if (avg == 75)
		{
			nextDay = "thunderStorm";
		}
		else
		{
			nextDay = "rainy";
		}
		}
		else {
			System.out.println("The value more than 7 not provided"); 
		}
		System.out.println("Tomorrow's Weather will be : " + nextDay);
		return nextDay;
	}
	
	}
	
