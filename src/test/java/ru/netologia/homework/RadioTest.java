package ru.netologia.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void testConstructorWithCorrectParams() {
        int volume = 10;
        int channel = 5;
        Radio radio = new Radio(channel, volume);
        int actualVolume = radio.getCurrentVolume();
        int actualChannel = radio.getCurrentRadio();
        Assertions.assertAll(
                () -> Assertions.assertEquals(volume, actualVolume),
                () -> Assertions.assertEquals(channel, actualChannel)
        );
    }

    @Test
    void testConstructorWithIncorrectParams() {
        int volume = -10;
        int channel = 1234;
        Radio radio = new Radio(channel, volume);
        int actualVolume = radio.getCurrentVolume();
        int actualChannel = radio.getCurrentRadio();
        Assertions.assertAll(
                () -> Assertions.assertEquals(0, actualVolume),
                () -> Assertions.assertEquals(0, actualChannel)
        );
    }

    @Test
    void testNext() {
        Radio radio = new Radio();
        radio.next();
        int expectedRadio = 1;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }

    @Test
    void testBorderNext() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.next();
        int expectedRadio = 0;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }

    @Test
    void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);
        radio.prev();
        int expectedRadio = 1;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }

    @Test
    void testBorderPrev() {
        Radio radio = new Radio();
        radio.prev();
        int expectedRadio = 9;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        int expectedVolume = 2;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();
        int expectedVolume = 1;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }
}
