package builder;

public class MealB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬汁");
    }
}
