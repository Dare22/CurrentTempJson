package json.constants;

import json.current.temp.CityAndTempFunctions;

public class Constant {

	public static final String API_URL = "http://api.openweathermap.org/data/2.5/group?id="
			+ CityAndTempFunctions.citiesToUrl() + "&units=metric&appid=953cba0c9efb27866d89bb56d67162a1";
	public static final String CITIES_PROP_PATH = "src/main/resources/properties/cities.properties";
	public static final String FILE_PATH = "src/main/resources/pdf/";
	public static final String EXTENSION = ".pdf";
	public static final String PDF_PROP_PATH = "src/main/resources/properties/pdfconfig.properties";
	public static final String EMAIL_PROP_PATH = "src/main/resources/properties/email.properties";

}
