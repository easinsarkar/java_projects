package dev.test;

interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem listItem);
    boolean removeItem(ListItem listItem);
    void traverse( ListItem root);
}
