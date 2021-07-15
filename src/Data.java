public class Data {
    private static Data instance = null;

    private Data(){
    }


    public static Data getInstance(){
        if (instance == null)
            instance = new Data();
        return instance;
    }
}
