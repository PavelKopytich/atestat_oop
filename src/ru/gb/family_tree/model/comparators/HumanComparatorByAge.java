package src.ru.gb.family_tree.model.comparators;

import src.ru.gb.family_tree.model.tree.TreeElement;

import java.util.Comparator;

public class HumanComparatorByAge<T extends TreeElement> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        // return o1.getAge()-o2.getAge();
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}