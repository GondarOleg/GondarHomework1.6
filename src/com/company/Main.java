package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Note note = new Note();


        note.addRecord("test1");
        note.addRecord("test2");
        note.addRecord("test3");
        note.addRecord("test4");
        note.addRecord("test5");
        note.showAllRecords();

        System.out.println("После модификации:");
        note.modifyRecord("modified record 5",5);
        System.out.println("Одна запись:");
        System.out.println(note.getRecord(5));
        note.removeRecord(2);
        System.out.println("Все записи после удаления:");
        note.showAllRecords();

    }
}
