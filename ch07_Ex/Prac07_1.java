class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i + 1;

            boolean k = num == 1 || num == 3 || num == 8;

            if (num > 10) {num = num % 10;}
            cards[i] = new SutdaCard(num, k);
        }
    }

    public void shuffle() {
        for(int i = 0; i < this.CARD_NUM; i++) {
            int idx = (int)(Math.random() * this.CARD_NUM);
            SutdaCard temp = this.cards[i];
            this.cards[i] = this.cards[idx];
            this.cards[idx] = temp;
        }
    }


    public SutdaCard pick(int idx) {
        return cards[idx];
    }

    public SutdaCard pick() {
        int idx = (int)(Math.random() * this.CARD_NUM);
        return this.pick(idx);
    }
}



class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}


public class Prac07_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
