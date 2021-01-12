package FileAndIO.zifuStream.Entity;

public class Student {
    private String id;
    private String name;
    private int age;
    private String addrss;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String id, String name, int age, String addrss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addrss = addrss;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addrss='" + addrss + '\'' +
                '}';
    }
}
