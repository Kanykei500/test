public class Triangle {
    int a;
    int b;
    int c;
    double perimetr;

    public void area(){
        System.out.println(Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c)));
    }

}
