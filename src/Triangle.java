public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        Triangle[] ta = new Triangle[4];
        int x = 0;
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;//x0=2,x1=4,x2=6,x3=8
            ta[x].length = x + 4;//      x0=4,x1=5,x2=6,x3=7
            ta[x].setArea();//x0=4.0,x1=10.0,x2=18.0,x3=28.0 c точкой так как тип double
            System.out.print(" " +
                    "triangle " + x+ ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = "+y);
        System.out.println(", area t5 " + t5.area);
    }
    void setArea(){
        area = (height * length)/2;
    }
}