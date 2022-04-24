package Assignment_2;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV() { }

    // Turns on this TV
    public void turnOn() {
        this.on = true;
    }

    // Turns off this TV
    public void turnOff() {
        this.on = false;
    }

    // Sets a new channel for this TV
    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }

    // Sets a new volume level for this TV
    public void setVolume(int newVolumeLevel) {
        this.volumeLevel = newVolumeLevel;
    }

    // Increases the channel number by 1
    public void channelUp(){
        this.channel += 1;
    }

    // Decreases the channel number by 1
    public void channelDown() {
        this.channel -= 1;
    }

    // Increases the volume level by 1
    public void volumeUp() {
        this.volumeLevel += 1;
    }

    // Decreases the volume level by 1
    public void volumeDown() {
        this.volumeLevel -= 1;
    }
}
