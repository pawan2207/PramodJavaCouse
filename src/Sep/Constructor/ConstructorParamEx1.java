package Sep.Constructor;


class authentication{
    String userName;
    String passWord;

    authentication(String userName,String passWord){
        System.out.printf("Username is %s and Password is %s ",userName,passWord); // this is default constructor

    }
}

public class ConstructorParamEx1 {
    public static void main(String[] args) {
        String userName = "abc";
        String passWord = "shiva";
        authentication a = new authentication(userName,passWord);


    }
}
