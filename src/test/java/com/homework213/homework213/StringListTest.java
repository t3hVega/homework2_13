package com.homework213.homework213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {


    StringList test = new StringList(3);
    StringList test1 = new StringList(3);
    StringList test2 = new StringList(2);



    @Test
    public void ShouldCorrectlyAdd() {
        String expected = "Тест";
        String actual = test.add("Тест");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyAddWithIndex() {
        String expected = "Тест";
        String actual = test.add(1,"Тест");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenAddingWithIndex() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            String actual = test.add(4,"Тест");
        });
    }

    @Test
    public void ShouldCorrectlySet() {
        String expected = "Тест";
        String actual = test.set(1,"Тест");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyRemoveByItem() {
        test.add("Тест");
        String expected = "Тест";
        String actual = test.remove("Тест");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenRemovingByItem() {
        test.add("Тест");
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            String actual = test.remove("тест");
        });
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenRemovingByIndex() {
        test.add("Тест");
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            String actual = test.remove(4);
        });
    }

    @Test
    public void ShouldCorrectlyRemoveByIndex() {
        test.add("Тест");
        String expected = "Тест";
        String actual = test.remove(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayContained() {
        test.add("Тест");
        boolean expected = true;
        boolean actual = test.contains("Тест");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayIndexFromStart() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        int expected = 2;
        int actual = test.indexOf("Тест2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenDisplayingIndexFromStart() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            int actual = test.indexOf("Тест4");
        });
    }

    @Test
    public void ShouldCorrectlyDisplayIndexFromEnd() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        int expected = 2;
        int actual = test.lastIndexOf("Тест2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenDisplayingIndexFromEnd() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            int actual = test.lastIndexOf("Тест4");
        });
    }

    @Test
    public void ShouldCorrectlyDisplayItemWhenGettingByIndex() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        String expected = "Тест2";
        String actual = test.get(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenGettingByIndex() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            String actual = test.get(4);
        });
    }

    @Test
    public void ShouldCorrectlyDisplayTrueWhenCheckingEquals() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        test1.add("Тест1");
        test1.add("Тест2");
        test1.add("Тест3");
        boolean expected = true;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingEquals() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        test1.add("Тест1");
        test1.add("Тест2");
        test1.add("Тест4");
        boolean expected = false;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingEqualsWithDiffSizes() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        test2.add("Тест1");
        test2.add("Тест2");
        boolean expected = false;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplaySize() {
        int expected = 3;
        int actual = test.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayTrueWhenCheckingIsEmpty() {
        boolean expected = true;
        boolean actual = test.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingIsEmpty() {
        test.add("Тест1");
        boolean expected = false;
        boolean actual = test.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrevoidClearArray() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        String [] expected = {" "," "," "};
        test.clear();
        String [] actual = test.toArray();
    }

    @Test
    public void ShouldCorrectlyTransformToArray() {
        test.add("Тест1");
        test.add("Тест2");
        test.add("Тест3");
        String [] expected = {"Тест1","Тест2","Тест3"};
        String [] actual = test.toArray();
    }
}