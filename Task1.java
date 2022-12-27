/*
 * Задача №1______________________________________________________________
 */
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Антон", "+79991111111");
        phonebook.put("Влад", "+79991111112");
        phonebook.put("Дима", "+79991111113");

        System.out.println(phonebook);

        addContact(phonebook, "Женя", "+79991111114");
        System.out.println(phonebook);
        System.out.println(phonebook.get("Женя"));

        deleteContact(phonebook, "Женя");
        System.out.println(phonebook);
    }
    public static void addContact(Map<String, String> dictionary, String name, String telephoneNumber){
        dictionary.put(name, telephoneNumber);
    }
    public static void deleteContact(Map<String, String> dictionary, String name){
        dictionary.remove(name);
    }
}
