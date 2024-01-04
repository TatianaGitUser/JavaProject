//package JUnit;
//
//public class RandomValuesGeneratorForWeather {
//    import java.util.Random;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class WeatherProcrastinator {
//        private Double windSpeed;
//        private Integer visibility;
//        private Integer temperature;
//        private Integer airQuality;
//        private Integer precipitation;
//        private Integer cloudiness;
//
//        public WeatherProcrastinator() {
//            // Initialize all weather-related variables to null initially
//            windSpeed = null;
//            visibility = null;
//            temperature = null;
//            airQuality = null;
//            precipitation = null;
//            cloudiness = null;
//        }
//
//        // Method to set weather variables for a sunny day
//        public void setSunny() {
//            System.out.println("setSunny is triggered.");
//            windSpeed = null;
//            visibility = null;
//            temperature = generateRandomValue(5, 30);
//            airQuality = generateRandomValue(10, 80);
//            precipitation = null;
//        }
//
//        // Method to set weather variables for a rainy day
//        public void setRainy() {
//            System.out.println("setRainy is triggered.");
//            airQuality = null;
//            visibility = generateRandomValue(15, 40);
//            cloudiness = generateRandomValue(80, 100);
//            precipitation = generateRandomValue(35, 67);
//            temperature = generateRandomValue(-5, 10);
//            windSpeed = generateRandomDouble(1.0, 2.0);
//        }
//
//        // Method to set weather variables for a cloudy day
//        public void setCloudy() {
//            System.out.println("setCloudy is triggered.");
//            cloudiness = generateRandomValue(40, 60);
//            precipitation = generateRandomValue(10, 30);
//            visibility = generateRandomValue(5, 45);
//            temperature = generateRandomValue(0, 15);
//            windSpeed = generateRandomDouble(0.5, 2.0);
//            airQuality = null;
//        }
//
//        // Method to set weather variables for a snowy day
//        public void setSnowy() {
//            System.out.println("setSnowy is triggered.");
//            cloudiness = 100;
//            precipitation = generateRandomValue(90, 100);
//            visibility = null;
//            temperature = generateRandomValue(-15, 0);
//            windSpeed = generateRandomDouble(3.0, 4.0);
//            airQuality = null;
//        }
//
//        // Method to set weather variables for a windy day
//        public void setWindy() {
//            System.out.println("setWindy is triggered.");
//            cloudiness = null;
//            precipitation = generateRandomValue(5, 10);
//            visibility = null;
//            temperature = generateRandomValue(5, 8);
//            windSpeed = generateRandomDouble(8.0, 12.0);
//            airQuality = generateRandomValue(2, 5);
//        }
//
//        // Method to set weather variables for a foggy day
//        public void setFoggy() {
//            System.out.println("setFoggy is triggered.");
//            cloudiness = generateRandomValue(60, 78);
//            precipitation = null;
//            visibility = 0;
//            temperature = generateRandomValue(2, 5);
//            windSpeed = null;
//            airQuality = 10;
//        }
//
//        // Helper method to generate a random integer value within a specified range
//        private Integer generateRandomValue(int min, int max) {
//            Random rand = new Random();
//            return rand.nextInt(max - min + 1) + min;
//        }
//
//        // Helper method to generate a random double value within a specified range
//        private Double generateRandomDouble(double min, double max) {
//            Random rand = new Random();
//            return min + (max - min) * rand.nextDouble();
//        }
//
//        // Getters for weather variables
//        public Double getWindSpeed() {
//            return windSpeed;
//        }
//
//        public Integer getVisibility() {
//            return visibility;
//        }
//
//        public Integer getTemperature() {
//            return temperature;
//        }
//
//        public Integer getAirQuality() {
//            return airQuality;
//        }
//
//        public Integer getPrecipitation() {
//            return precipitation;
//        }
//
//        public Integer getCloudiness() {
//            return cloudiness;
//        }
//    }
//
//    class MainTest {
//        @Test
//        public void testSunnyWeather(){
//            WeatherProcrastinator one = new WeatherProcrastinator();
//            one.setSunny();
//            assertNull(one.getWindSpeed());
//            assertNull(one.getPrecipitation());
//            assertNull(one.getVisibility());
//            assertTrue(one.getTemperature()>5 && one.getTemperature()<30);
//            assertTrue(one.getAirQuality()>10 && one.getAirQuality()<80);
//        }
//        @Test
//        public void testSetCloudy(){
//            WeatherProcrastinator one = new WeatherProcrastinator();
//            one.setCloudy();
//            assertTrue(one.getCloudiness()>=40 && one.getCloudiness()<=60);
//            assertTrue(one.getPrecipitation()>=10 && one.getPrecipitation()<=30);
//            assertTrue(one.getVisibility()>=5 && one.getVisibility()<=45);
//            assertTrue(one.getTemperature()>=0 && one.getTemperature()<=15);
//            assertTrue(one.getWindSpeed()>=0.5 && one.getWindSpeed()<=2);
//            assertNull(one.getAirQuality());
//        }
//        @Test
//        public void testFoggyWeather(){
//            WeatherProcrastinator one  = new WeatherProcrastinator();
//            one.setFoggy();
//            assertTrue(one.getCloudiness()>=60 && one.getCloudiness()<=78);
//            assertNull(one.getPrecipitation());
//            assertEquals(0, one.getVisibility());
//            assertTrue(one.getTemperature()>=2 && one.getTemperature()<=5);
//            assertNull(one.getWindSpeed(), "Wind speed is not null");
//            assertEquals(10, one.getAirQuality());
//        }
//        @Test
//        public void testValidateWeatherChanges(){
//            WeatherProcrastinator one = new WeatherProcrastinator();
//            one.setSunny();
//            assertNull(one.getWindSpeed());
//            assertNull(one.getPrecipitation());
//            assertNull(one.getVisibility());
//            assertTrue(one.getTemperature()>5 && one.getTemperature()<30);
//            assertTrue(one.getAirQuality()>10 && one.getAirQuality()<80);
//            one.setCloudy();
//            assertTrue(one.getCloudiness()>=40 && one.getCloudiness()<=60);
//            assertTrue(one.getPrecipitation()>=10 && one.getPrecipitation()<=30);
//            assertTrue(one.getVisibility()>=5 && one.getVisibility()<=45);
//            assertTrue(one.getTemperature()>=0 && one.getTemperature()<=15);
//            assertTrue(one.getWindSpeed()>=0.5 && one.getWindSpeed()<=2);
//            assertNull(one.getAirQuality());
//            one.setFoggy();
//            assertTrue(one.getCloudiness()>=60 && one.getCloudiness()<=78);
//            assertNull(one.getPrecipitation());
//            assertEquals(0, one.getVisibility());
//            assertTrue(one.getTemperature()>=2 && one.getTemperature()<=5);
//            assertNull(one.getWindSpeed(), "Wind speed is not null");
//            assertEquals(10, one.getAirQuality());
//        }
//    }
//
//}
