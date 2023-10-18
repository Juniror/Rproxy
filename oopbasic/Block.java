package oopbasic;
class Block extends OtherShape{
    private double high;
    Block(int length,int width,int high){
       super(length,width);
       this.high = high;
    }
    double getlength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    double gethigh(){
        return high;
    }
    double area(){
        return length*width*high;
    }
}