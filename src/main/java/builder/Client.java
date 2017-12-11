package builder;

public class Client {


    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();
        MealA a = new MealA();
        waiter.setMealBuilder(a);
        Meal mealA = waiter.construct();
        System.out.println("套餐A的组成部分：");
        System.out.println("" + mealA.getFood() + ": " + mealA.getDrink());
    }

}
