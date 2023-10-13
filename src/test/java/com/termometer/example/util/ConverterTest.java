package com.termometer.example.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void shouldReturnCelsiusWhenFarenheitIsInput() {
        double farenheitInput = 75;
        double expectedCelsiusResult = 23.88;

        assertEquals(expectedCelsiusResult,
                converter.convertFarenheitCelsius(farenheitInput), 0.02);
    }

    @Test
    public void shouldReturnFarenheitWhenCelciusIsInput() {
        double expectedFarenheitResult = 75;
        double celsiusInput = 23.88;

        assertEquals(expectedFarenheitResult,
                converter.convertCelsiusFarenheit(celsiusInput), 0.02);
    }
}
