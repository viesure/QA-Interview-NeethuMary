package com.example.weatherapi.model;


// WeatherData class representing the weather data returned by the API


public class WeatherData {

    private String city;
    private String condition;
    private String icon;
    private int conditionId;
    private String description;
    private WeatherDetails weather;
    //private int tempInFahrenheit;
    // Getters and setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getConditionId() {
        return conditionId;
    }

    public void setConditionId(int conditionId) {
        this.conditionId = conditionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WeatherDetails getWeather() {
        return weather;
    }

    public void setWeather(WeatherDetails weather) {
        this.weather = weather;
    }

    public static class WeatherDetails {
        private int tempInFahrenheit;
        private int tempInCelsius;

        // Getters and setters

        public int getTempInFahrenheit() {
            return tempInFahrenheit;
        }

        public void setTempInFahrenheit(int tempInFahrenheit) {
            this.tempInFahrenheit = tempInFahrenheit;
        }

        public int getTempInCelsius() {
            return tempInCelsius;
        }

        public void setTempInCelsius(int tempInCelsius) {
            this.tempInCelsius = tempInCelsius;
        }
    }

	public Object getTempInFahrenheit() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTempInCelsius() {
		// TODO Auto-generated method stub
		return null;
	}
}
