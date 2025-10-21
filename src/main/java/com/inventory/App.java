package com.inventory;

import com.retail.nero.ItemDroppedAtRetail; 
import org.apache.avro.SchemaParseException;


public class App {
    public static void main(String[] args) {
        try {

            ItemDroppedAtRetail item = new ItemDroppedAtRetail();
            item.setItemId("ABC123");
            item.setTimestamp(System.currentTimeMillis());
            item.setLocation("Store1");

            System.out.println("Avro record: " + item);

        } catch (SchemaParseException e) {
            System.err.println("Invalid Avro schema: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error reading schema file: " + e.getMessage());
        }
    }
}