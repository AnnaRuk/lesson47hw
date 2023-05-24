package de.ait;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class WeatherToolsTest {

@ParameterizedTest
@CsvSource ({"20, true, 'Gusty Moderate Breeze with speed of 20 km'",
        "20, false, 'Moderate Breeze with speed of 20 km'",
        "30, true, 'Gusty Fresh Breeze with speed of 30 km'",
        "30, false, 'Fresh Breeze with speed of 30 km'",
        "1, true, 'Gusty Calm with speed of 1 km'",
        "6, false, 'Light Breeze with speed of 6 km'",
        "50, true, 'Gusty Near Gale with speed of 50 km'",
        "70, false, 'Gale with speed of 70 km'",
        "75, true, 'Gusty Strong Gale with speed of 75 km'",
        "88, false, 'Strong Gale with speed of 88 km'",
        "130, true, 'Gusty Hurricane with speed of 130 km'"

})
    public void test1(double speed, boolean isGusty, String message){
    assertEquals(message, WeatherTools.getWindDescription(speed, isGusty));
}



}