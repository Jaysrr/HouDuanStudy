package class03;

/**
 * @program: HouDuanStudy
 * @description:
 * @author: Jaysrr
 * @create: 2020-06-17 21:49
 **/
public class Singer {
    private long id;
    private String name;
    private String role;
    private int age;

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Singer(int id, String name, String role, int age) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public Singer() {
    }
}
