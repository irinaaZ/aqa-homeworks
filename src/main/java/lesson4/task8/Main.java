package lesson4.task8;

public class Main {
    public static void main(String[] args) {
    TV tv1 = new TV();
    RemoteController remoteController1 = new RemoteController();

        //connecting device
        remoteController1.connectDevice(tv1);
        //power on remote device
        remoteController1.powerOn();
        //switching the channel
        remoteController1.switchTheChannel(22);
        //to check current channel
        remoteController1.currentChannel();
        //increasing the volume
        remoteController1.upVolume();
        remoteController1.upVolume();
        remoteController1.upVolume();
        //decreasing the volume
        remoteController1.downVolume();
        //muting
        remoteController1.mute();

        //disconnect the device
        remoteController1.disconnectDevice(tv1);
        //making sure that disconnected device is not working
        remoteController1.upVolume();

        //connection device
        remoteController1.connectDevice(tv1);
        //power off the device
        remoteController1.powerOff();
        //making sure that powered off device is not working
        remoteController1.mute();
    }
}

