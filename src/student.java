abstract class student {
    String name;
    int roll;
    public student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    abstract void attend_class();
    abstract void give_exam();
}
