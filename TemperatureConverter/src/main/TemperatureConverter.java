package main;

/**
 * <h1>Convert Temperature</h1>
 * The Temperature Converter impliments an application
 * that can convert tempreture one format to another as we want.
 * <p>
 * @author Nadim Mahmud
 * @version 1.0
 * @since 2018-10-29
 */

public class TemperatureConverter {
	
	/**
	 * This method convert given temperature 
	 * Celcious to Farenheit.
	 * @param calcious is the only perameter to the celciousToFarenheit method that is temperature in Cecious
	 * @return This method return temperature in celcious form
	 */
	
	public double celciousToFarenheit(double celcious) {
		
		double farenheit;
		double nine = 9.0, five = 5.0, sub = 32.0;
		
		farenheit = (nine/five)*celcious + sub;
		
		return farenheit;
	}
	
	/**
	 * This method convert given temperature 
	 * Farenheit to Celcious.
	 * @param farenheit is the only perameter to the farenheitToCelcious method that is temperature in farenheit
	 * @return This method return temperature in Celcious form
	 */
	
	public double farenheitToCelcious(double farenheit) {
		
		double celcious;
		double nine = 9.0, five = 5.0, sub = 32.0;
		
		celcious = (five/nine)*(farenheit - sub);
		
		return celcious;
	}
	
	/**
	 * This method convert given temperature 
	 * Celcious to Kelvin.
	 * @param calcious is the only perameter to the celciousToKelvin method that is temperature in Cecious
	 * @return This method return temperature in Kelvin form
	 */
	
	public double celciousToKelvin(double celcious) {
		
		double kelvin;
		double constant = 273.15 ;
		
		kelvin = celcious + constant;
		
		return kelvin;
	}
	
	/**
	 * This method convert given temperature 
	 * Kelvin to Celcious.
	 * @param kelvin is the only perameter to the KelvinToCelcious method that is temperature in kelvin
	 * @return This method return temperature in Celcious form
	 */
	
	public double KelvinToCelcious(double kelvin) {
		
		double celcious;
		double constatnt = 273.15;
		
		celcious = kelvin - constatnt;
		
		return celcious;
	}
	
	/**
	 * This method convert given temperature 
	 * Farenheit to Kelvin.
	 * @param calcious is the only perameter to the farenheitToKelvin method that is temperature in Cecious
	 * @return This method return temperature in Kelvin form
	 */
	
	public double farenheitToKelvin(double farenheit) {
		
		double kelvin;
		double constant = 273.15,nine = 9.0, five = 5.0, sub = 32.0;
		
		kelvin =  (five/nine)*(farenheit - sub) + constant;
		
		return kelvin;
	}
	
	/**
	 * This method convert given temperature 
	 * Kelvin to Farenheit.
	 * @param kelvin is the only perameter to the KelvinToCelcious method that is temperature in kelvin
	 * @return This method return temperature in Farenheit form
	 */
	
	public double KelvinToFarenheit(double kelvin) {
		
		double farenheit;
		double constatnt = 273.15,nine = 9.0, five = 5.0, sub = 32.0;
		
		farenheit = (kelvin - constatnt)*(nine/five) + sub;
		
		return farenheit;
	}

}
