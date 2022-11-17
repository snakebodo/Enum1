public enum Coffee {
//aceste constante trebuie puse inaintea codului, pt validarea lor trebuie sa definim parametri
    //se poate folosisi String "LATTE" dar putem gresi in scriere iar Enum ne ajuta sa evitam acele greseli
    //nu se foloseste setter deoarece constantele au deja parametri definiti

    LATTE(10,10),
    CAPPUCCINO(10,5),
    AMERICANO(0,15);
    private final int milk;
    private final int water;

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    Coffee(int milk, int water) {
        this.milk = milk;
        this.water = water;

    }
}
