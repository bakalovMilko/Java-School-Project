package ObjectOrientedProgramming;

public class TV {
	int channel;
	int volumeLevel;
	boolean on;
	
	public void turnOn() {
		on=true;
		System.out.println("The TV was turned on.");
	}
	public void turnOff() {
		on=false;
		System.out.println("The TV was turned off.");
	}
	public void setChannel(int newChannel) {
		channel=newChannel;
		System.out.println("Your new channel is:" + channel);
	}
	public void setVolume(int newVolumeLevel) {
		volumeLevel=newVolumeLevel;
		System.out.println("Your new volume level is: "+volumeLevel );
	}
	public void channelUp() {
		if(channel<100) {
			channel++;
			System.out.println("Your new channel is "+channel);
		}
		else System.out.println("You can't increase the channel number.");
	}
	public void channelDown() {
		if(channel>0) {
			channel--;
			System.out.println("Your new channel is "+channel);
		}
		else System.out.println("You can't decrease the channel number.");
	}
	public void volumeUp() {
		if(volumeLevel<7) {
			volumeLevel++;
			System.out.println("Your new volume level is "+volumeLevel);
		}
		else System.out.println("You can't increase the volume more.");

	}
	public void volumeDown() {
		if(channel>0) {
			volumeLevel--;
			System.out.println("Your new volume level is "+volumeLevel);
		}
		else System.out.println("You can't decrease the volume more.");
	}
}