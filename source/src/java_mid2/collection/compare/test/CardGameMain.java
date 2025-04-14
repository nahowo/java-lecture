package java_mid2.collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println(deck);

        Player p1 = new Player("플레이어 1");
        Player p2 = new Player("플레이어 2");

        for (int i = 0; i < 5; i++) {
            p1.add(deck.remove());
            p2.add(deck.remove());
        }

        printPlayerCard(p1);
        printPlayerCard(p2);
        getWinner(p1, p2);
    }

    static void printPlayerCard(Player player) {
        System.out.print(player.getName() + "의 카드: ");
        player.showCard();
        player.setScore(player.totalNumber());
        System.out.println(", 합계: " + player.getScore());
    }

    static void getWinner(Player p1, Player p2) {
        Player ret = p1.getScore() > p2.getScore() ? p1 : (p1.getScore() < p2.getScore() ? p2 : null);
        if (ret != null) {
            System.out.println(ret.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
