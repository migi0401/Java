class Point{
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class WordCount{
    public static void main(String[] args){
        Point p = new Point(2,3);
        System.out.println(p.toString());
        String s = p.toString() + "점";
        System.out.println(s);
    }
}