package com.company;

public class Note {
    private Record[] record = new Record[0];

    public void addRecord(String string){
        Record[] tempArray = new Record[record.length+1];
        System.arraycopy(record,0,tempArray,0,record.length);
        tempArray[record.length]=new Record(string);
        record=tempArray;
    }
    public String getRecord(int pos){
        if(pos <= record.length && pos > 0) {
            return record[pos - 1].getString();
        }else{
            return null;
        }
    }
    public void showAllRecords(){
        for(Record a : record){
            System.out.println(a.getString());
        }
    }

    public void modifyRecord(String string, int pos){
        if(pos <= record.length && pos > 0) {
            record[pos - 1].setString(string);
        }else {
            System.out.println("Индекс за пределами записей.");
        }

    }

    public void removeRecord(int pos){
        if(pos <= record.length && pos > 0) {
            pos--;
            Record[] tempArray = new Record[record.length - 1];
            System.arraycopy(record, 0, tempArray, 0, pos);
            System.arraycopy(record, pos + 1, tempArray, pos, record.length - pos - 1);
            record = tempArray;
        }else {
            System.out.println("Индекс за пределами записей.");
        }
    }

}
