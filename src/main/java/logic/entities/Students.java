package logic.entities;

public class Students {

    private int id;
    private String name;
    private int age;
    private String stream;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", stream='" + stream + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Students(int id, String name, int age, String stream, int marks) {
        this.id = id;
        this.marks = marks;
        this.stream = stream;
        this.age = age;
        this.name = name;
    }
}
