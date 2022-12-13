package lab2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SerializeToJSON implements Serialize<Shape> {
    @Override
    public void writeToFile(List<Shape> objs, String fileName) throws IOException
    {
        //створили маппер для запису інформації в файл
        ObjectMapper mapper = new ObjectMapper();
        //записали в файл
        mapper.writeValue(new File(fileName),objs);
    }

    @Override
    public List<Shape> readFromFile(String fileName) throws IOException
    {
        //створили маппер для зчитування інформації в файл
        ObjectMapper mapper = new ObjectMapper();
        //зчитали інформацію з файлу
        return mapper.readValue(new File(fileName), new TypeReference<List<Shape>>(){});
    }
}
