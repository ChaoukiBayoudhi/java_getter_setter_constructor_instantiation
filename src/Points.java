import java.util.Scanner;

public class Points {
    //declare an array of points
    //int N=100;
    //syntax : Type[] array_name = new Type[N];
    //syntax : Type[] array_name = new Type[] {5,11,3} //declare and initialize an array
    //private Point[] pointsArray = new Point[100];//declare and create a point array
    //this is the composition notion in Object-Oriented paradigm
    private Point[] pointsArray; //declare a point array (without memory reservation)
    private int size; //logic size of the array
    public Points(int nMAX) {
        pointsArray=new Point[nMAX]; //reservation of memory space
    }

    public void enterPoints()
    {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Donner le nombre des points");

            this.size = sc.nextInt();
        }while(this.size < 0||this.size> pointsArray.length);
        for (int i = 0; i < this.size; i++) {
            System.out.println("Point n°" + (i+1));
            System.out.println("Abscisse : ");
            double x = sc.nextDouble();
            System.out.println("Ordonnée : ");
            double y = sc.nextDouble();
            pointsArray[i] = new Point(x, y);
        }
    }
    public void showPoints()
    {
        System.out.println("Liste des points :");
        for (int i = 0; i < this.size; i++) {
            System.out.println("Point : (x = "+pointsArray[i].getX()+", y = "+pointsArray[i].getY()+")");
        }
    }
    public int find(Point p)
    {
        //verify if the point "p" is in the array "points"
        int i=0;
        //boolean found = false;
        int index=-1;
        while(i<this.size && index==-1) //!found)
        {
            if (this.pointsArray[i].compare(p)) {
                //found = true;
                index=i;
            }
            i++;
        }
        return index;
    }
}
