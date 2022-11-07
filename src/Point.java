
public class Point {
    //attributes
    private double x;
    private double y;
    //constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //getters and setters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y=y;
    }

    public Point translate(double dx, double dy) {
        //Point p = new Point(this.x+dx, this.y+dy);
        //return p;
        //or
        return new Point(this.x+dx, this.y+dy);
    }
    public Point copy() { //create a copy of this
        Point pc=new Point(this.x, this.y);
        return pc;
    }
    public boolean compare(Point p) {
        //compare this and p coordinates
       // if(this.x==p.x && this.y==p.y)
         //   return true;
        //return false;
        //or
       // return (this.x==p.x && this.y==p.y)?true:false;
        //or
        return this.x==p.x && this.y==p.y;
    }
}
