package Advance;

import java.io.*;


class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class SerializeAndDeserializeObject {
    public static void main(String[] args) {
        String filename = "student.ser";

    
        Student student = new Student("Pratham", 22);

    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Serialization complete. Object saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialization complete. Object read from file:");
            System.out.println(deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



