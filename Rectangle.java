class Rectangle{
double length;
double breadth;

Rectangle(double rlength ,double rbreadth){
length = rlength;
breadth = rbreadth;
}

double Area(){
double area = length * breadth;
return area;
}

double Perimeter(){
double pm = 2 * (length * breadth);
return pm;
}

}

public class Task2{
public static void main(String[] args){
Rectangle r1 = new Rectangle(14.3,5.5);
System.out.println("Area of Rectangle: "+ r1.Area());
System.out.println("Perimeter of Rectangle: "+ r1.Perimeter());
}
}