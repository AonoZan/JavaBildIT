
public class TV {
	int channel;
	int volumeLevel;
	boolean on;
	
	TV(){
		channel = 0;
		volumeLevel = 15;
		on = false;
	}
	
	void turnOn(){
		on = true;
	}
	void turnOff(){
		on = false;
	}
	void setChannel(int newChannel){
		if(on) channel = newChannel;
		
	}
	void setVolume(int newVolumeLevel){
		if(on) volumeLevel = newVolumeLevel;
	}
	void channelUp(){
		if(on) channel++;
	}
	void channelDown(){
		if(on) channel--;
	}
	void volumeUp(){
		if(on) volumeLevel++;
	}
	void volumeDown(){
		if(on) volumeLevel--;
	}
}
