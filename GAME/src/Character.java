public abstract class Character {
    protected String name;
    protected String className;
    protected int hp;
    protected int mana;

    public Character(String name, String className, int hp, int mana) {
        this.name = name;
        this.className = className;
        this.hp = hp;
        this.mana = mana;
    }

    public void showStats() {
        System.out.println("Name: " + name + " | Class: " + className + " | HP: " + hp + " | Mana: " + mana);
    }
}

class Warrior extends Character {
    public Warrior(String playerName) {
        super(playerName, "Warrior", 180, 80);
    }

    public void stoneSlash() {
        int damage = (int)(Math.random() * 13);
        mana += 10;
        System.out.println(name + " used Stone Slash! Deals " + damage + " damage. Mana +10");
    }

    public void flameStrike() {
        if (mana >= 20) {
            int damage = 13 + (int)(Math.random() * 10);
            mana -= 20;
            System.out.println(name + " used Flame Strike! Deals " + damage + " damage. Mana -20");
        } else {
            System.out.println("Not enough mana!");
        }
    }

    public void earthquakeBlade() {
        if (mana >= 30) {
            int damage = 23 + (int)(Math.random() * 13);
            mana -= 30;
            System.out.println(name + " used Earthquake Blade! Deals " + damage + " damage. Mana -30");
        } else {
            System.out.println("Not enough mana!");
        }
    }
}

class Mage extends Character {
    public Mage(String playerName) {
        super(playerName, "Mage", 120, 150);
    }

    public void frostBolt() {
        int damage = (int)(Math.random() * 11);
        mana += 10;
        System.out.println(name + " used Frost Bolt! Deals " + damage + " damage. Mana +10");
    }

    public void runeBurst() {
        if (mana >= 20) {
            int damage = 11 + (int)(Math.random() * 10);
            mana -= 20;
            System.out.println(name + " used Rune Burst! Deals " + damage + " damage. Mana -20");
        } else {
            System.out.println("Not enough mana!");
        }
    }

    public void lightstorm() {
        if (mana >= 30) {
            int damage = 21 + (int)(Math.random() * 15);
            mana -= 30;
            System.out.println(name + " used Lightstorm! Deals " + damage + " damage. Mana -30");
        } else {
            System.out.println("Not enough mana!");
        }
    }
}

class Paladin extends Character {
    public Paladin(String playerName) {
        super(playerName, "Paladin", 220, 120);
    }

    public void shieldBash() {
        int damage = (int)(Math.random() * 9);
        mana += 10;
        System.out.println(name + " used Shield Bash! Deals " + damage + " damage. Target stunned. Mana +10");
    }

    public void radiantGuard() {
        if (mana >= 20) {
            mana -= 20;
            System.out.println(name + " used Radiant Guard! Damage taken reduced by 20% for 2 turns. Mana -20");
        } else {
            System.out.println("Not enough mana!");
        }
    }

    public void holyRenewal() {
        if (mana >= 30) {
            int heal = 20 + (int)(Math.random() * 16);
            mana -= 30;
            System.out.println(name + " used Holy Renewal! Heals " + heal + " HP to self and ally + removes 1 debuff. Mana -30");
        } else {
            System.out.println("Not enough mana!");
        }
    }
}