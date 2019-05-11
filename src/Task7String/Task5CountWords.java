package Task7String;

public class Task5CountWords {
    public static void main(String[] args) {
        String name = "fdg fgfd gfd gdf gdf g";
        fio(name);

    }


    static void fio(String name) {
        name = ' ' + name;
        char[] arrName = name.toCharArray();
        int k = 0;
        for (int i = 0 ; i < arrName.length; i++) {
            if (arrName[i] == ' ' && arrName[i + 1] != ' ') {
                k++;
            }
        }
        System.out.println(k);
    }
    }

