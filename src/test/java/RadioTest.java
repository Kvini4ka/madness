import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio device = new Radio();

    @Test
    void shouldChangeStation() {
        device.setCurrentStation(5);

        int expected = 5;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetStationUnderMinStation() {
        device.setCurrentStation(-1);
        int expected = 0;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetStationOverMaxStation() {
        device.setCurrentStation(10);
        int expected = 0;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);


    }

    @Test
    void shouldNextStation() {
        device.setCurrentStation(7);
        device.nextStation();
        int expected = 8;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldNextStation1() {
        device.setCurrentStation(10);
      //  device.nextStation();
        int expected = 0;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldNextMaxStation() {
        device.setCurrentStation(9);
        //      device.nextStation();
        int expected = 9;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldOverMaxStation() {
        device.setCurrentStation(100);
        device.nextStation();
        int expected = 1;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldOverMaxStation1() {
        device.setCurrentStation(5);
        device.nextStation();
        int expected = 6;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldPrevStation() {
        device.setCurrentStation(4);
        device.prevStation();
        int expected = 3;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldBehindMinStation1() {
        device.setCurrentStation(0);
        device.prevStation();
        int expected = 9;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldBelowMinStation() {
        device.setCurrentStation(-1);
        device.prevStation();
        int expected = 9;
        int actual = device.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldChangeVolume() {
        device.setCurrentVolume(4);
        int expected = 4;
        int actual = device.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldIncreaseVolume() {
        device.setCurrentVolume(54);
        device.increaseVolume();
        int expected = 55;
        int actual = device.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldOverMaxVolume() {
        device.setCurrentVolume(100);
        device.increaseVolume();
        int expected = 100;
        int actual = device.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseVolume() {
        device.setCurrentVolume(23);
        device.decreaseVolume();
        int expected = 22;
        int actual = device.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldBehindMinVolume() {
        device.setCurrentVolume(0);
        device.decreaseVolume();
        int expected = 0;
        int actual = device.getCurrentVolume();
        assertEquals(expected, actual);


    }




}
