package lab2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        Rectangle rb1 = new Rectangle(1,"boxRectagle",10,20);
        Rectangle rb2 = new Rectangle(1,"boxRectagle123",20,40);
        Circle cb1 = new Circle(1,"ballCircle",10);

        List<Shape> myList = new ArrayList<>();
        myList.add(rb1);
        myList.add(rb2);
        myList.add(cb1);

        List<Rectangle> myList2 = new ArrayList<>();
        myList2.add(rb1);
        myList2.add(rb2);

        SerializeToJSON serializerJSON = new SerializeToJSON();
        SerializeToXml serializerToXml = new SerializeToXml();
        SerializeToTxt serializerToTxt = new SerializeToTxt();

        System.out.println("JSON:");
        serializerJSON.writeToFile(myList,"testJSON.json");
        System.out.println(serializerJSON.readFromFile("testJSON.json"));
        System.out.println("XML:");
        serializerToXml.writeToFile(myList,"testXML.xml");
        System.out.println(serializerToXml.readFromFile("testXML.xml"));
        System.out.println("TXT:");
        serializerToTxt.writeToFile(myList2,"testTXT.txt");
        System.out.println(serializerToTxt.readFromFile("testTXT.txt"));
    }
}
