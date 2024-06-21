package baitap.service.comparerator;

import baitap.model.Category;

import java.util.Comparator;

public class CategoryName implements Comparator<Category> {
    @Override
    public int compare(Category o1, Category o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
