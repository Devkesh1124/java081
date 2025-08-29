package new_java;

public class UserDefined {
    public void validate(int age) throws InvalidAgeExceptions{
        if(age<18)
            throw new InvalidAgeExceptions("cannot vote,age less than 18");
        else
            System.out.println("eligible for vote");
    }
}
