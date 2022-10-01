package pl.camp.it.lombok;

public class App {
    public static void main(String[] args) {
        User2 user2 = new User2();

        int id = user2.id();
        String login = user2.login();

        user2.cos();

        User2 user22 = User2.builder().id(5).password("cos").login("login").build();

        user22.login("Mateusz");

        User user = new User();
        user.setId(5);
        user.setLogin("Mateusz");
        user.setPassword("sadfgsdzfg");

        User2 user21 = new User2();
        user21.id(5).login("Mateusz").password("asdfassdf");

    }
}
