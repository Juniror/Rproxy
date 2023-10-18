package run;
import java.util.Scanner;
class java{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AirConditioner air = new AirConditioner(25,1);  
    while (true){
        int choice = sc.nextInt();
        if (choice == 1){
            air.increaseTemperature();
        }
        else if(choice == 2){
            air.decreaseTemperature();
        }
        else if(choice == 3){
            air.changeFanSpeed();
        }
        else if (choice == 4){
            System.out.println("temp = " + air.getTemperature() + " fan = " + air.getFanspeed());
        }
        else if(choice == 5){
            air.turnAirONOFF();
        }
        else if(choice == 9){
            break;
        }       
    }
    sc.close();
    
}


}

