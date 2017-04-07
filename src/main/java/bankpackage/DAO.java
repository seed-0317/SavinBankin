package bankpackage;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DAO {
//    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
//        String filename = "src/main/java/bankpackage/jsonBankAccount.json";
//        write(filename);
//        read(filename);
//    }
    static String filename = "src/main/java/bankpackage/jsonBankAccount.json";

    public static void write(BusinessLogic bl) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), bl);
    }

//    public static void write(String filename) throws JsonGenerationException, JsonMappingException, IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), new BusinessLogic("Tom", 100));
//    }

    public static BusinessLogic read()throws IOException{
        ObjectMapper mapper2 = new ObjectMapper();
        File file = new File(filename);
        BusinessLogic customer = mapper2.readValue(file, BusinessLogic.class);
        return customer;

    }
}

// https://www.mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/







