import java.lang.*;
public  class Person{
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // setName/age
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // getName/age
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getInfo(){
        
        String str2 = Integer.toString(this.age);
        return this.name + " " + str2;

    }

}
