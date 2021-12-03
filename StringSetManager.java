/*import java.util.*;
enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID}

public class StringSetManager {
    public static int index;
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];

        while(true){
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }
            switch (command){
                case ADD:
                    String str = getString(scanner);
                    add(stringSet, str);
                    break;
                case REMOVE:
                    str = getString(scanner);
                    remove(stringSet, str);
                    index -= 1;
                    break;
                case CLEAN:
                    clear(stringSet);
                    index = 0;
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
        scanner.close();
    }

    private static void print(String[] stringSet) {
        System.out.printf("Element Size: %d, Values = [",index);
        for(int i = 0; i < index; i++){
            System.out.print(stringSet[i]);
            if(i == index-1){
                break;
            }
            else System.out.print(", ");
        }
        System.out.print("]\n");

    }

    private static void clear(String[] stringSet) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(stringSet));
        list.clear();
     }

    private static void remove(String[] stringSet, String str) {
        int tag = 0;
        for(int i = 0; i < stringSet.length-1; i++){
            if(str.equals(stringSet[i])){
                tag = i;
            }
        }
        for(int j = tag; j < index; j++){
            stringSet[j] = stringSet[j+1];
        }
    }

    private static void add(String[] stringSet, String str) {
        if(index == 0) {
            stringSet[index] = str;
            index += 1;
        }
        else{
            for(int i = 0; i < index; i++) {
                if (str.equals(stringSet[i])) {
                    break;
                }
                else if (i == index-1){
                    stringSet[index] = str;
                    index +=1;
                }
            }
        }
    }

    private static String getString(Scanner scanner) {
        return scanner.nextLine();
    }

    private static StringCommand getCommand(Scanner scanner) {
        String commandName = scanner.next();
        StringCommand code;
        try{
            code = StringCommand.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e){
            code = StringCommand.INVALID;
        }
        return code;
    }
}
*/