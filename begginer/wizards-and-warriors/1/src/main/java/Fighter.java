public class Fighter {

    boolean isVulnerable() {
        return true;
    }
    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable() == false)
            return 6;
        else
            return 10;
    }
}
class Wizard extends Fighter {
    boolean preparedSpell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    void prepareSpell() {
        preparedSpell = true;
    }
    @Override
    boolean isVulnerable() {
        return !preparedSpell;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if(preparedSpell == true)
            return 12;
        else
            return 3;
    }
}