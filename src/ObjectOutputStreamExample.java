import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Person p = new Person("John","Johnson");

        System.out.println(p);

        FileOutputStream foss = new FileOutputStream("person.txt");

        ObjectOutputStream oos = new ObjectOutputStream(foss);
        oos.writeObject(p);
        oos.close();
    }

}

