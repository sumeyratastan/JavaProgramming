package day35_Encapsulation;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        setLength(length);
        setWidth(width);
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        if(width<0){
            return;
        }
        this.width=width;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        if(length<0){
            return;
        }
        this.length=length;
    }

    public int calcArea(){
        return length*width;
    }

    public int calcPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Rectangle Task:
2.1 Create a class named Rectangle:
Private variables:
width, length
Encapsulate all the fields
Conditions:
width of
the rectangle should not be negative
length of
the rectangle should not be negative
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments
not valid it should not be set to the instances)
Methods:
calcArea(): returns the area
of rectangle
calcPerimeter(): returns the
perimeter of rectangle
toString(): can display the
width, length, area, and perimeter of rectangle when object is passed in
print statement
 */