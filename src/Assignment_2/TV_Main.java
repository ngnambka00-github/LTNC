package Assignment_2;

public class TV_Main {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setChannel(10);
        tv.setVolume(5);
        System.out.println("Current channel: " + tv.channel + " - current Volume Level: " + tv.volumeLevel);

        // Change channel vs volume
        tv.channelDown();
        tv.volumeUp();

        System.out.println("Channel after changing: " + tv.channel);
        System.out.println("Volume level after changing: " + tv.volumeLevel);
    }
}
