//Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
//        Итерация всех элементов списка цветов и добавления к каждому символа '!'.
//        Вставить элемент в список в первой позиции.
//        Извлечь элемент (по указанному индексу) из заданного списка.
//        Обновить определенный элемент списка по заданному индексу.
//        Удалить третий элемент из списка.
//        Поиска элемента в списке по строке.
//        Создать новый список и добавить в него несколько елементов первого списка.
//        Удалить из первого списка все элементы отсутствующие во втором списке.
//        *Сортировка списка.
//        *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

package org.example;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Красный");
        list.add("Оранжевый");
        list.add("Желтый");
        list.add("Зеленый");
        list.add("Голубой");
        System.out.println(list);

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el + "!");
        }

        list.add(0, "Радуга");
        System.out.println(list);

        System.out.println("Введите индекс извлекаемого элемента: ");
        Scanner console = new Scanner(System.in);
        int index = console.nextInt();
        System.out.println("Извлекаемый элемент:" + list.get(index - 1));

        System.out.println("Введите новый цвет: ");
        String newColor = console.next();
        list.remove(index - 1);
        list.add(index - 1, newColor);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println("Какой ищем цвет?: ");
        String findColor = console.next();

        boolean found = false;
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            if (el.equals(findColor)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Цвет нашли");
        } else
            System.out.println("Цвет не нашли");


        ArrayList<String> list1 = new ArrayList<>();


        list1.add(list.get(0));
        list1.add(list.get(1));

        System.out.println(list1);



        list.retainAll(list1);
        System.out.println(list);
        System.out.println(list1);


    }
}