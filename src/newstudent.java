public class newstudent extends student{
    public newstudent(String name,int roll){
    super(name,roll);
    }
    public void attend_class(){
        System.out.println(name+" attend the class ");
    }
    public void give_exam(){
        System.out.println(name+" give exam ");
    }
}
