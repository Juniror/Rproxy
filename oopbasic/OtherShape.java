package oopbasic;
public class OtherShape {
    protected double length;
    protected double width;
    OtherShape(int length,int width){
        this.length = length;
        this.width = width;
    }
    OtherShape(){
        this.length = 0;
        this.width = 0;
    }
    double area(){
        return length*width; 
    }
    double getlength(){
        return length;
    }
    double getWidth(){
        return width;
    }
}
