package examjava8;

public class Dish {

    String name;
    DishType type;
    int calories;

    public Dish(String name, DishType type, int calories) {
        this.name = name;
        this.type = type;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public DishType getType() {
        return type;

    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "[" + name + ", type=" + type + ", calories=" + calories + "]";
    }

}
