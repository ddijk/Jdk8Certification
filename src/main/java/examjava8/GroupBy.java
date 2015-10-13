package examjava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class GroupBy {

    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(new Dish("lekkerbek", DishType.FISH, 100), new Dish("kibbeling", DishType.FISH, 100), new Dish("biefstuk", DishType.MEAT, 40));

        //  Map<DishType, Optional<Dish>> dishMap2 = dishes.stream().collect(groupingBy(d -> d.getType(), maxBy(Comparator.comparingInt(Dish::getCalories))));
        Map<DishType, List<Dish>> dishMap = dishes.stream().collect(Collectors.groupingBy(Dish::getType));

        dishMap.entrySet().forEach(e -> {
            System.out.println("" + e.getKey() + ":" + e.getValue());
        }
        );

        GroupBy gb = new GroupBy();
        gb.nestedGroupBy();

    }

    public GroupBy() {
        List<Dish> dishes = Arrays.asList(new Dish("lekkerbek", DishType.FISH, 100), new Dish("kibbeling", DishType.FISH, 100), new Dish("biefstuk", DishType.MEAT, 40));

        Map<DishType, Optional<Dish>> maxDish = dishes.stream().collect(Collectors.groupingBy(d -> d.getType(), maxBy(Comparator.comparingInt(Dish::getCalories))));
        maxDish.entrySet().forEach(e -> {
            System.out.println("" + e.getKey() + ":" + e.getValue().orElse(new Dish("dummy", DishType.OTHER, -1)));
        }
        );
    }

    void nestedGroupBy() {
        List<Dish> dishes = Arrays.asList(new Dish("lekkerbek", DishType.FISH, 100), new Dish("kibbeling", DishType.FISH, 100), new Dish("biefstuk", DishType.MEAT, 40));

        Map<DishType, Map<String, List<Dish>>> maxDish = dishes.stream().collect(Collectors.groupingBy(d -> d.getType(), groupingBy(d -> d.getName())));
        maxDish.entrySet().forEach(e -> {
            System.out.println("" + e.getKey() + ":" + e.getValue());
        }
        );
    }

}
