public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private char sex;
    public Student(String n, Integer a, char s){
        this.name=n;
        this.age=a;
        this.sex=s;
    }
    public char getSex(){
        return sex;
    }
    public Integer getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setName(){
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age < o.getAge())
            return 1;
        if(this.age > o.getAge())
            return -1;
        return 0;
    }
}
