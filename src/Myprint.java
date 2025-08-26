public class Myprint implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("my print implemented");
    }
    public void show(){
        System.out.println("show method implemented");
    }
}
