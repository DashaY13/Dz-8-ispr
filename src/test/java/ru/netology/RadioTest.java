package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void myTest1() {
        Radio cond = new Radio();
        cond.increaseVolume(99);

        int expected = 100;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest2() {
        Radio cond = new Radio();
        cond.increaseVolume(100);

        int expected = cond.maxCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest3() {
        Radio cond = new Radio();
        cond.increaseVolume(101);

        int expected = cond.maxCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest4() {
        Radio cond = new Radio();
        cond.decreaseVolume(-1);

        int expected = cond.minCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest5() {
        Radio cond = new Radio();
        cond.decreaseVolume(0);

        int expected = cond.minCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest6() {
        Radio cond = new Radio();
        cond.decreaseVolume(1);

        int expected = 2;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest7() {
        Radio cond = new Radio();
        cond.nextRadioStation(1);

        int expected = 2;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest8() {
        Radio cond = new Radio();
        cond.nextRadioStation(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest9() {
        Radio cond = new Radio();
        cond.prevRadioStation(0);

        int expected = 10;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest10() {
        Radio cond = new Radio();
        cond.prevRadioStation(9);

        int expected = 10;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest11() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getQuantityRadioStation());
    }

}