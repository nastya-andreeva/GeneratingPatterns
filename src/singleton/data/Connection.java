package singleton.data;

public class Connection {
    private static ItemDb INSTANCE;

    public static ItemDb getInstance() {
        if (INSTANCE != null)
            return INSTANCE;
        INSTANCE = new ItemDb();
        return INSTANCE;
    }
}