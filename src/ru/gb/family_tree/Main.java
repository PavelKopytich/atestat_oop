package src.ru.gb.family_tree;

import src.ru.gb.family_tree.view.ConsoleUI;
import src.ru.gb.family_tree.view.View;

public class Main {

    public static void main(String[] args) {

        View view = new ConsoleUI();
        view.start();
    }
}