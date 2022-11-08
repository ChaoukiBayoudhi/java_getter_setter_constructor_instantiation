import java.util.Scanner;

public class Main {
    public static int menu()
    {
        System.out.println("Sectionnez un choix :");
        System.out.println("1.Saisir la liste des points");
        System.out.println("2.Afficher la liste des points");
        System.out.println("3.Chercher un point");
        System.out.println("4.Quitter l'application");
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.print("Votre choix : ");
            choice = sc.nextInt();
        }while (choice<1||choice>4);
        return choice;
    }
    public static void main(String[] args) {
        //test the class Point
//        Point A=new Point(5.3,11.6);
//        System.out.println("A Point = "+A);
//        Point B=A;
//        A.setX(8.9);
//        System.out.println("abscisse(A) = "+A.getX());
//        System.out.println("abscisse(B) = "+B.getX());
//        System.out.println("B Point = "+B);
//        System.out.println("A : (x = "+A.getX()+", y = "+A.getY()+")");
//        Point Ac=A.copy();
//        A.setX(27.9);
//        System.out.println("abscisse(Ac) = "+Ac.getX());
//        System.out.println("A copy Point = "+Ac);
//        System.out.println("A copy : (x = "+A.getX()+", y = "+A.getY()+")");
//        if(A.compare(Ac)==true)
//            System.out.println("equals");
//        else
//            System.out.println("not equals");


        //test of the class Points
        Points pts = new Points(100);
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            choice=menu();
            switch (choice) {
                case 1:
                    pts.enterPoints();
                    break;
                    case 2:
                        pts.showPoints();
                    break;
                    case 3:
                        Point p= new Point();
                        System.out.println("Coordonées du point à chercher :");
                        System.out.print("Abcisse ? ");
                        double x= sc.nextDouble();
                        System.out.print("Ordonné ? ");
                        double y= sc.nextDouble();
                        p.setX(x);
                        p.setY(y);
                        int index=pts.find(p);
                        if(index==-1)
                            System.out.println("this point is not available.");
                        else
                            System.out.println("the point is available at the index " + index);
                    break;
            }
        }while(choice!=4);

    }
}