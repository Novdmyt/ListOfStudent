package app.student;

public class Student {
    String name;
    String spec;
    int kuz;

    public Student(String name, String spec, int kuz) {
        this.name = name;
        this.spec = spec;
        this.kuz = kuz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getKuz() {
        return kuz;
    }

    public void setKuz(int kuz) {
        this.kuz = kuz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (kuz != student.kuz) return false;
        if (!name.equals(student.name)) return false;
        return spec.equals(student.spec);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + spec.hashCode();
        result = 31 * result + kuz;
        return result;
    }
}

