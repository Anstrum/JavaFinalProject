package Game.Items;

public class Weapon implements IArme {
    private final String name;
    private float damage;
    private float usure = 0;
    private float range;
    private float precision;
    private boolean equipped = false;


    public Weapon(String _name, int _damage, float _precision, float _range){
        name = _name;
        damage = _damage;
        precision = _precision;
        range = _range;
    }

        //Getters
    @Override
    public String getName(){
        return name;
    }
    @Override
    public float getUsure() {
        return usure;
    }
    @Override
    public float getDamage() { // return a string with damage * precision de l'arme
        return  (int) (damage * precision);
    }

    @Override
    public float getPrecision() {
        return precision;
    }
    @Override
    public float getRange() {
        return range;
    }

    public boolean isEquipped(){
        return equipped;
    }

    public float getWeight(){
        return 1;
    }


        //Setters
    public void setEquipped(boolean _equipped){
        equipped = _equipped;
    }
    public void repair(float percent){
        usure -=percent;
    }
}
