package ru.netologia.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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
        Radio radio = new Radio(50);
        radio.setCurrentRadio(49);
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
    void testIncreaseVolumeBorder() {
        Radio radio = new Radio();
        for (int i = 0; i < 101; i++) {
            radio.increaseVolume();
        }
        int expectedVolume = 100;
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

    @Test
    void testDecreaseVolumeBorder() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    void testSetRadioRightBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);
        int expectedRadio = 0;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }

    @Test
    void testSetRadioLeftBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);
        int expectedRadio = 0;
        int actualRadio = radio.getCurrentRadio();
        Assertions.assertEquals(expectedRadio, actualRadio);
    }


}
