package com.inventory;

import org.apache.avro.Schema;
import org.apache.avro.SchemaParseException;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Schema schema = new Schema.Parser()
                .parse(new File("schemas/retail/nero/ItemDroppedAtRetail.avsc"));
            System.out.println("Loaded schema: " + schema.getFullName());
        } catch (SchemaParseException e) {
            System.err.println("Invalid Avro schema: " + e.getMessage());
        }
    }
}