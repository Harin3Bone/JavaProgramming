package main.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInArray {
    public void runSearchInArray() {
        System.out.println("================= CHALLENGE SEARCH IN ARRAY =================");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dataList = getInput(sc);
        ArrayList<Integer> locationList = searchData(sc,dataList);
        printResult(locationList);
    }

    private ArrayList<String> getInput(Scanner sc) {
        ArrayList<String> dataList = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            System.out.print("Please enter your word " + (index+1) + " : ");
            dataList.add(sc.nextLine());
        }
        return dataList;
    }

    private ArrayList<Integer> searchData(Scanner sc,ArrayList<String> dataList){
        ArrayList<Integer> locationList = new ArrayList<>();
        System.out.print("The word you search is : ");
        String searchString = sc.nextLine();
        String data;

        for (int index = 0 ; index < dataList.size() ; index++) {
            data = dataList.get(index);
            if (data.contains(searchString)){
                locationList.add(index+1);
            }
        }
        return locationList;
    }

    private void printResult(ArrayList<Integer> locationList){
        if (locationList.size() != 0) {
            System.out.println("Found in " + locationList);
        } else {
            System.out.println("Not Found.");
        }
    }
}
