package HomeWorks_project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork4 {
    /**
     * @param args
     */
    public static void bubleSort(ArrayList<Integer> age, LinkedList<Integer> index){
        ArrayList<Integer> ageTemp = new ArrayList<>(age);

        boolean sort = true;
        int k = ageTemp.size();
        while(sort){
            sort = false;
            for (int i = 0; i < k-1; i++) {
                if(ageTemp.get(i)> ageTemp.get(i+1)){

                    int temp = ageTemp.get(i);
                    ageTemp.set(i, ageTemp.get(i+1));
                    ageTemp.set(i+1, temp);

                    int temp2 = index.get(i);
                    index.set(i, index.get(i+1));
                    index.set(i+1, temp2);

                    sort = true;
                }
                
            }

            k--;
        }
        
    }

    public static void main(String[] args) {
        
        LinkedList<Integer> index = new LinkedList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ф.И.О возраст пол через пробел, для выхода нажмите x");

        boolean run = true;
        while (run){
            String in = scanner.nextLine();
            if(in.equals("x")){
                run = false;
            }
            else{
                String[] data = in.split(" ");
                index.add(lastName.size());
                lastName.add(data[0]);
                firstName.add(data[1]);
                patronymic.add(data[2]);
                age.add(Integer.parseInt(data[3]));
                gender.add(data[4]);

            }
        }

        for (int i = 0; i < lastName.size(); i++) {
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0)).append(". ").append(age.get(i)).append(" ").append(gender.get(i)); 
            System.out.println(str);
        }

        System.out.println("Сортировать по возрасту?(y/n)");
        String in = scanner.nextLine();

        if (in.equals("y")){

            bubleSort(age, index);

            for (int i : index) {
                StringBuilder str = new StringBuilder();
                str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0)).append(". ").append(age.get(i)).append(" ").append(gender.get(i)); 
                System.out.println(str);
            }

        }

    }
}
