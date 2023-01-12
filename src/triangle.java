public class triangle {
    int a;
    int b;
    int c;

    public void area(){
        double p;
        double S;
        p = (a+b+c)/2d;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S: "+S);
    }
}
