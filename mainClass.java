public class mainClass {
	public static void main(String[] args)
	{
	int [][] weatherStation = {{-10,22,33,19,45,75,20}, 
			{35,-6,57, 8,10, -100, 10},
			{15, 20, 29, 39,30,75,20}};
	String[] descriptor = {"sunny","rainy","thunderstrom","sunny", "sunny", "thunderstorm", "rainy"};
	
	Rainfall rainfall = new Rainfall(weatherStation, descriptor);
	int [][] newWeatherStation = rainfall.dataPreparation();
	
	for(int i = 0; i < newWeatherStation.length; ++i) {
		for (int j = 0; j < newWeatherStation[i].length; ++j){
				System.out.print(newWeatherStation[i][j]+"\t");
			
	}
		System.out.println();
	}
	
	int total = rainfall.totalRainfall();
	System.out.println(total);
	
	String xyz = rainfall.trend(3);
	System.out.println(xyz);
}
}
