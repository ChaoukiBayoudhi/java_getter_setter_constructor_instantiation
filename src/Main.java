public class Main {
    public static void main(String[] args) {
        Point A=new Point(5.3,11.6);
        System.out.println("A Point = "+A);
        Point B=A;
        A.setX(8.9);
        System.out.println("abscisse(A) = "+A.getX());
        System.out.println("abscisse(B) = "+B.getX());
        System.out.println("B Point = "+B);
        System.out.println("A : (x = "+A.getX()+", y = "+A.getY()+")");
        Point Ac=A.copy();
        A.setX(27.9);
        System.out.println("abscisse(Ac) = "+Ac.getX());
        System.out.println("A copy Point = "+Ac);
        System.out.println("A copy : (x = "+A.getX()+", y = "+A.getY()+")");
        if(A.compare(Ac)==true)
            System.out.println("equals");
        else
            System.out.println("not equals");
    }
}