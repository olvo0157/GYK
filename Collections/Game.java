import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

enum Enum {
    GENRE1, GENRE2, GENRE3
}

public class Game {
    private String title;
    private Enum genre;
    private Double price;
    private Integer copiesSold;

    public Double getPrice() {
        return price;
    }

    public Game(String title, Enum genre, Double price, Integer copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public static void main(String[] args) {
        Game gameOne = new Game("Game N1", Enum.GENRE1, 15.99, 100);
        Game gameTwo = new Game("Game N2", Enum.GENRE2, 10.99, 50);
        Game gameThree = new Game("Game N3", Enum.GENRE1, 24.99, 10);
        Game gameFour = new Game("Game N4", Enum.GENRE3, 11.99, 5);
        ArrayList<Game> games = new ArrayList<>();
        games.addAll(Arrays.asList(gameOne, gameTwo, gameThree, gameFour));
        for (Game game : games
        ) {
            System.out.println(game.toString());

        }
        games.remove(1);
        games.sort(Comparator.comparing(Game::getPrice).reversed());
        System.out.println(games);

    }
}
