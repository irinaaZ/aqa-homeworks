package lesson4.task8;

/*
Write a class RemoteController to control your TV.
Example of the structure in the requirements.

 */
public class RemoteController implements Volume, Device {
    TVDevice tvDevice;
    boolean isConnected;
    TV tv = new TV();

    public void connectDevice(TVDevice tvDeviceForConnect) {
        isConnected = true;
        System.out.println("The device was successfully connected");
    }

    public void disconnectDevice(TVDevice tvDeviceForDisconnect) {
        isConnected = false;
        System.out.println("The device was successfully disconnected");
    }

    public void switchTheChannel(int channel) {
        if (checkIfDeviceConnected()) {
            tv.setChannel(channel);
        } else {
            System.out.println("The device is not connected yet, or device is off");
        }
    }

    private boolean checkIfDeviceConnected() {
        return (isConnected == true) ? true:false;
    }

    @Override
    public void powerOn() {
        if (checkIfDeviceConnected()) {
        tv.powerOn();
        System.out.println("The device was powered on");
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void powerOff() {
        if (checkIfDeviceConnected()) {
        tv.powerOff();
        System.out.println("The device was powered off");
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void setChannel(int newChannel) {
        if (checkIfDeviceConnected()) {
            tv.setChannel(newChannel);
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void currentChannel() {
        if (checkIfDeviceConnected()) {
            tv.currentChannel();
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void upVolume() {
        if (checkIfDeviceConnected()) {
            tv.upVolume();
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void downVolume() {
        if (checkIfDeviceConnected()) {
            tv.downVolume();
        } else {
            System.out.println("The device is disconnected!");
        }
    }

    @Override
    public void mute() {
        if (checkIfDeviceConnected()) {
            tv.mute();
        } else {
            System.out.println("The device is disconnected!");
        }
    }
}

