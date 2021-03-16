public class MySingleton {

    private static MySingleton mySingleton;
    private MySingleton(){};

    public static MySingleton getSingleton(){

        if(mySingleton==null){

            synchronized (MySingleton.class){

                if(mySingleton==null){
                    return new MySingleton();
                }
            }
        }
        return mySingleton;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
