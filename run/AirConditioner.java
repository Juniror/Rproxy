package run;
import java.util.Scanner;
public class AirConditioner {
    private int Temperature;
    private int fanSpeed;
    private int MAXfanspeed = 2;
    private int MAXtemperature = 30;
    private int MINtemperature = 20;
    private boolean airON = false;
    private boolean fanON = false;
    Scanner sc = new Scanner(System.in);
    public AirConditioner(int targetTemperature,int fanSpeed){
        this.Temperature = targetTemperature;
        this.fanSpeed = fanSpeed;
    }
    public AirConditioner(){
        this.Temperature = 0;
        this.fanSpeed = 0;
    }

    public void turnAirONOFF() {
        if (airON == false && fanON == false) {
            airON = true;
            fanON = true;
        } else {
            airON = false;
            fanON = false;
        }
    }


    public void increaseTemperature() {
        if (airON == true){
        if (Temperature >= MAXtemperature) {
            Temperature = MAXtemperature;
        } else {
            Temperature += 1;
        }
    }
    else{
        System.out.println("turn air before");
    }
    }

    public void decreaseTemperature() {
        if (airON == true){
        if(Temperature<= MINtemperature){
            Temperature = MINtemperature;
        }
        else{
        Temperature -= 1;
    }
}
else{
        System.out.println("turn air before");
    }
}

    public void changeFanSpeed(){
         if (fanON == true){
        int speed = sc.nextInt();
        if(speed >= 2){
            fanSpeed = MAXfanspeed;
        }
        else if (speed >= 0){
        fanSpeed = speed;
        }
    }
        else{
        System.out.println("turn air before");
    }
    }

    public int getTemperature() {
        return Temperature;
    }
    public int getFanspeed(){
        return fanSpeed;
    }
}
