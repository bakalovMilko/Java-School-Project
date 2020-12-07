package project15;

import java.util.Date;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	Time(){
		Date date = new Date();
		this.setHours((int)((date.getTime() % 86400000)/3600000));
		this.setMinutes ((int)((date.getTime()%3600000)/60000));
		this.setSeconds ((int)((date.getTime()%60000)/1000));
	}
	Time(int miliSec){
		this.setHours((int)((miliSec % 86400000)/3600000));
		this.setMinutes((int)((miliSec%3600000)/60000));
		this.setSeconds((int)((miliSec%60000)/1000));
	}
	Time(int hours, int minutes, int seconds){
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours%24;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes%60;
	}
	public int getSeconds() {
		return seconds%60;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void setTime(int miliSec){
		this.setHours((int)((miliSec % 86400000)/3600000));
		this.setMinutes((int)((miliSec%3600000)/60000));
		this.setSeconds((int)((miliSec%60000)/1000));
	}
}
