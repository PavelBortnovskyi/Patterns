package org.example.composer;

public class MenuTestDrive {

  public static void main(String args[]) {

    //Создаем объекты меню
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

    //Добавляем отдельные меню в общую внутреннюю коллекцию меню верхнего уровня
    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    pancakeHouseMenu.add(new MenuItem(
      "K&B’s Pancake Breakfast(v)",
      "Pancakes with scrambled eggs, and toast",
      true,
      2.99));
    pancakeHouseMenu.add(new MenuItem(
      "Regular Pancake Breakfast",
      "Pancakes with fried eggs, sausage",
      false,
      2.99));
    pancakeHouseMenu.add(new MenuItem(
      "Blueberry Pancakes(v)",
      "Pancakes made with fresh blueberries, and blueberry syrup",
      true,
      3.49));
    pancakeHouseMenu.add(new MenuItem(
      "Waffles(v)",
      "Waffles, with your choice of blueberries or strawberries",
      true,
      3.59));

    dinerMenu.add(new MenuItem(
      "Vegetarian BLT(v)",
      "(Fakin’) Bacon with lettuce & tomato on whole wheat",
      true,
      2.99));
    dinerMenu.add(new MenuItem(
      "BLT",
      "Bacon with lettuce & tomato on whole wheat",
      false,
      2.99));
    dinerMenu.add(new MenuItem(
      "Soup of the day",
      "A bowl of the soup of the day, with a side of potato salad",
      false,
      3.29));
    dinerMenu.add(new MenuItem(
      "Hotdog",
      "A hot dog, with saurkraut, relish, onions, topped with cheese",
      false,
      3.05));
    dinerMenu.add(new MenuItem(
      "Steamed Veggies and Brown Rice(v)",
      "Steamed vegetables over brown rice",
      true,
      3.05));
    dinerMenu.add(new MenuItem(
      "Pasta(v)",
      "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
      true,
      3.89));

    //Десертное меню добавляем как вложенное подменю
    dinerMenu.add(dessertMenu);

    dessertMenu.add(new MenuItem(
      "Apple Pie",
      "Apple pie with a flakey crust, topped with vanilla icecream",
      true,
      1.59));
    dessertMenu.add(new MenuItem(
      "Cheesecake(v)",
      "Creamy New York cheesecake, with a chocolate graham crust",
      true,
      1.99));
    dessertMenu.add(new MenuItem(
      "Sorbet(v)",
      "A scoop of raspberry and a scoop of lime",
      true,
      1.89));

    cafeMenu.add(new MenuItem(
      "Veggie Burger and Air Fries(v)",
      "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
      true,
      3.99));
    cafeMenu.add(new MenuItem(
      "Soup of the day",
      "A cup of the soup of the day, with a side salad",
      false,
      3.69));
    cafeMenu.add(new MenuItem(
      "Burrito(v)",
      "A large burrito, with whole pinto beans, salsa, guacamole",
      true,
      4.29));

    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();
  }
}