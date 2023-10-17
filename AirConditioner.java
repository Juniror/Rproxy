
class AirConditioner {
    private int Temperature;
    private int fanSpeed;
    private int MAXfanspeed = 2;
    private int MAXtemperature = 30;
    private int MINtemperature = 20;
    private boolean airON = false;
    private boolean fanON = false;

    AirConditioner(int targetTemperature,int fanSpeed){
        this.Temperature = targetTemperature;
        this.fanSpeed = fanSpeed;
    }

    void turnAirONOFF() {
        if (airON == false && fanON == false) {
            airON = true;
            fanON = true;
        } else {
            airON = false;
            fanON = false;
        }
    }


    void increaseTemperature() {
        if (Temperature >= MAXtemperature) {
            Temperature = MAXtemperature;
        } else {
            Temperature += 1;
        }
    }

    void decreaseTemperature() {
        Temperature -= 1;
    }

    void changeFanSpeed(){
        if(fanSpeed >= 2){
            fanSpeed = MAXfanspeed;
        }
        else{
        fanSpeed+=1;
        }
    }

    int getTemperature() {
        return Temperature;
    }
    int getFanspeed(){
        return fanSpeed;
    }
}
