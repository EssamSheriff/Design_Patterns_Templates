package singleton.model;

public class DataBase {

    private static DataBase instance;

    private DataBase() {
    }

    public static DataBase getinstance() {
        if (instance != null) {
            System.out.println("It`s Created ");
        }
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }
}
