package lesson4.task8;

/*
Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
if you class is abstract).
 */

public abstract class TVDevice implements Volume, Device {
    public String modelName;
    public boolean isOn;
}
