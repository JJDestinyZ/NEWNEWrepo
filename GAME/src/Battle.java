import java.util.Scanner;

public class Battle {
    private Scanner input;
    private Character player;
    private World1Mob mob;
    private ClearScreen screen;
    private GoToXY go;
    private DrawBox box;

    public Battle(Scanner input, Character player, World1Mob mob, ClearScreen screen, GoToXY go, DrawBox box) {
        this.input = input;
        this.player = player;
        this.mob = mob;
        this.screen = screen;
        this.go = go;
        this.box = box;
    }

public boolean start() {
    screen.clear(0);
    go.move(0, 37);
    box.draw(209, 18);
    go.move(92, 45);
    System.out.println("A wild " + mob.name + " has appeared!");
    screen.clear(3);

    while (player.isAlive() && mob.isAlive()) {
        playerTurn();
        if (!mob.isAlive()) break;
        mobTurn();
    }

    if (player.isAlive()) {
        System.out.println("You have defeated the " + mob.name + "!");
        player.decrementDamageBuffDuration(); // Reduce buff duration after battle
        screen.clear(3);
        return true;
    } else {
        return false;
    }
}

private void playerTurn() {
    displayBattleStatus();
    go.move(80, 48);
    System.out.println("Your turn. Choose your skill:");
    player.displaySkills();
    go.move(106, 50);

    int choice = input.nextInt();
    screen.clear(0);
    go.move(0, 37);
    box.draw(209, 18);
    player.useSkill(choice, mob);
    screen.clear(4);
}

private void mobTurn() {
    displayBattleStatus();
    go.move(80, 48);
    System.out.println(mob.name + "'s turn.");
    screen.clear(2);

    // Simple AI >> 30% chance to use special skill, otherwise normal attack
    if (Math.random() < 0.3) {
        mob.specialSkill(player);
    } else {
        mob.attack(player);
    }
    screen.clear(4);
}

private void displayBattleStatus() {
    screen.clear(0);
    go.move(0, 37);
    box.draw(209, 18);

    // Display Player
    go.move(40, 18);
    System.out.printf("%s (%s)", player.name, player.className);
    go.move(37, 24);
    System.out.printf("HP: \u001B[1;92m%d/%d\u001B[0m   MP: \u001B[36m%d/%d\u001B[0m", player.hp, player.maxHp, player.mana, player.maxMana);
    switch (player.className) {
        case "Warrior": CharacterIcon.Warrior(42, 20); break;
        case "Paladin": CharacterIcon.Paladin(45, 20); break;
        case "Mage": CharacterIcon.Mage(44, 19); break;
    }

    // Display Mob
    go.move(160, 18);
    System.out.printf("%s", mob.name);
    go.move(157, 24);
    System.out.printf("HP: \u001B[1;91m%d\u001B[0m", mob.hp);
    switch (mob.name) {
        case "Slime": CharacterIcon.Slime(162, 20); break;
        case "Wild Bull": CharacterIcon.WildBull(162, 20); break;
        case "Dire Wolf": CharacterIcon.Wolf(162, 20); break;
        case "Minotaur": CharacterIcon.Minotaur(162, 20); break;
    }
}
}