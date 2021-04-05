package Test.Wangtao;

import java.util.ArrayList;
import java.util.List;

public class Lth {
    public String name;
    public int age;
    public String Sex;
    public String Comment;
    public ArrayList<Lth> LthSon = new ArrayList<>();

    public Lth(String name,int age,String sex,String Comment) {
        this.name = name;
        this.age = age;
        this.Sex = sex;
        this.Comment = Comment;
    }
    public void addSon(Lth son){
        LthSon.add(son);
        System.out.println("I am the No."+LthSon.size()+" son");
    }

    public void eat(String s){
        if (s.equals("meat")){
            System.out.println("I am "+ name + ",I like eating "+"vegetable,because "+s+" makes me fat!");
        }
        else{
            System.out.println("I am "+ name + ",I like eating "+s);
        }
    }

    public void sleep(String sex){
        System.out.println("I am a sleepy "+ sex );
    }

    public void State() {
        System.out.println(Comment);
    }

}
