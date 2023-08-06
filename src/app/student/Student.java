package app.student;

import app.util.Speciality;

import java.util.Objects;

public class Student {
    String name;
    Speciality spec;
    int kuz;

    public Student(String name, Speciality spec, int kuz) {
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

    public Speciality getSpec() {
        return spec;
    }

    public void setSpec(Speciality spec) {
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
        if (!Objects.equals(name, student.name)) return false;
        return spec == student.spec;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (spec != null ? spec.hashCode() : 0);
        result = 31 * result + kuz;
        return result;
    }
}

