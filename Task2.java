/*
 * Задача №2______________________________________________________________
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> listEmployees = new ArrayList<>();
        listEmployees.add("Иван Иванов");
        listEmployees.add("Светлана Петрова");
        listEmployees.add("Кристина Белова");
        listEmployees.add("Анна Мусина");
        listEmployees.add("Анна Крутова");
        listEmployees.add("Иван Юрин");
        listEmployees.add("Петр Лыков");
        listEmployees.add("Павел Чернов");
        listEmployees.add("Петр Чернышов");
        listEmployees.add("Мария Федорова");
        listEmployees.add("Марина Светлова");
        listEmployees.add("Мария Савина");
        listEmployees.add("Мария Рыкова");
        listEmployees.add("Марина Лугова");
        listEmployees.add("Анна Владимирова");
        listEmployees.add("Иван Мечников");
        listEmployees.add("Петр Петин");
        listEmployees.add("Иван Ежов");
        
        sortingByNamePopularity(getNames(listEmployees));
    }

    public static ArrayList<String> getNames(ArrayList<String> listEmployees) {
        String stringEmployees= String.join(" ", listEmployees);
        String[] newListEmployees = stringEmployees.split(" ");;
        ArrayList<String> listName = new ArrayList<>();
        for (int index = 0; index < newListEmployees.length; index++) {
            if(index%2==0){
                listName.add(newListEmployees[index]);
            }
        }
        return listName;
        
    }

    public static void sortingByNamePopularity(ArrayList<String> listName) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : listName) {
            if (result.containsKey(name)) {
                result.replace(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }
        result.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    } 
}
