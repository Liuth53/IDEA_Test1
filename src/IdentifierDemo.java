public class IdentifierDemo {
    private String name;
    private int age ;
    private  String sex ;

    public IdentifierDemo(String name) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat(String s){
        if (s=="meat"){
            System.out.println("I am "+ name + ",I like eating "+"vegetable,because "+s+" makes me fat!");
        }
        else{
            System.out.println("I am "+ name + ",I like eating "+s);
        }
    }
    public void sleep(String s){
        System.out.println("I am a sleepy "+ s );
    }
    public void playGames(String s){
        System.out.println("I like to play "+s);
    }
}
