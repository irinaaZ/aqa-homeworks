package lesson4.task8;

/*
The ""Device"" interface should have methods powerOn(), powerOff(), setChannel(int channel),
and currentChannel();
 */
public interface Device {

    public void powerOn();
    public void powerOff();
    public void setChannel(int channel);
    public void currentChannel();
}
