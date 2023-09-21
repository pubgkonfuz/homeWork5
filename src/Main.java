public class Main{
    public static void main(String[] args) {

    Boss boss = new Boss();
    boss.setHeals(330);
    boss.setDamage(70);
    boss.setProtection("Щит капитана америки");
        System.out.println("Heals - " + boss.getHeals()+ ": " + "Damage - " + boss.getDamage()
                + ": " + "Protection - " + boss.getProtection());
    }

}