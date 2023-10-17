class java{
    public static void main(String[] args) {
     AirConditioner air = new AirConditioner(25,1);  
     System.out.println("Temp = " + air.getTemperature() +" Speed = " + air.getFanspeed());
    }
}
