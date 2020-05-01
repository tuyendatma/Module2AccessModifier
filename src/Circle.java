public class Circle {
    private double radius =1;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius =radius;
        this.color = color;
    }
     double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

}
