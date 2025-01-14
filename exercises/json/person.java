import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public static List<Person> readFile(String filename) throws FileNotFoundException {
    List<Person> people = new ArrayList<>();

    try (FileReader reader = new FileReader(filename)) {
      List<Person> filePeople = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}).getType();
      if (filePeople != null) {
        people = filePeople;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
    
}
