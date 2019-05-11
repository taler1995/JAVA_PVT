package Task7String;

public class Task6Repeat {
    public static void main(String[] args) {
        String name = "aaaaabbbbbbbbbcccccccccddddddddddffffffffefffffff";
        System.out.println(repeat(name));

    }


    private static String repeat(String name) {
        char[] arrName = name.toCharArray();
        StringBuilder newName = new StringBuilder(String.valueOf(name.charAt(0)));
        for (int i = 0; i < arrName.length - 1; i++) {
            if (arrName[i] != arrName[i + 1]) {
                newName.append(arrName[i + 1]);
            }
        }
        return newName.toString();
    }
    }

