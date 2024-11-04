public class FunctionLecture {
    public static void main(String[] args){
        printName("Joe");
        printName("Jalen");
        printName("Mikal");
        printCity();
        Friends("Joe", "Dillon");
        DrinkAndApp("Coke", "Shrimp");
    }

    public static void printName(String x){
        System.out.println(x + "!");
    }

    public static void printCity(){
        System.out.println("Yorktown");

    }

    public static void Friends(String friend1, String friend2){
        System.out.println(friend1 + " and " + friend2);
    }

    public static void favoriteFood(){
        System.out.println("Hibachi");
    }

    public static void DrinkAndApp(String drink, String app){
        System.out.println(drink + " and " + app );
    }


}


