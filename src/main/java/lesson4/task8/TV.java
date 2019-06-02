package lesson4.task8;

/*
Write a class ""TV"" which extends the class TVDevice. Implements all the methods.
 */
public class TV extends TVDevice {
    private int volumeLevel;
    private int channelNumber = 0;

    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        if (isOn == true) {
            channelNumber = channel;
            System.out.println("The channel was changed on " + channel);
        } else {
            System.out.println("The device is off");
        }
    }

    @Override
    public void currentChannel() {
        if (isOn == true) {
            System.out.println("The current channel is " + channelNumber);
        } else {
            System.out.println("The device is off");
        }
    }

    @Override
    public void upVolume() {
        if (isOn == true) {
            volumeLevel++;
            System.out.println("The volume was increased on " + volumeLevel);
        } else {
            System.out.println("The device is off");
        }
    }

    @Override
    public void downVolume() {
        if (isOn == true) {
            volumeLevel--;
            System.out.println("The volume was decreased on " + volumeLevel);
        } else {
            System.out.println("The device is off");
        }
    }

    @Override
    public void mute() {
        if (isOn == true) {
            volumeLevel = 0;
            System.out.println("The volume was muted");
        } else {
            System.out.println("The device is off");
        }
    }
}
