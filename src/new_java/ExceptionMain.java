package new_java;

public class ExceptionMain {
    public static void main(String[] args) {
        UserDefined use=new UserDefined();
        try{
            use.validate(12);
        }
        catch(InvalidAgeExceptions e)
        {
            System.out.println(e.getMessage());
        }
    }
}
