package day05_JavaLab;

public class FrequencyOfWord3 {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        int countJava = 0;


        for (int  i = 0;  i <= sentence.length()-4;  i++) {  // in the substring last index is always excluded that's why we add -1
            String each = sentence.substring(i, i + 4);

            if (each.equals("Java")){
                countJava++;
            }

        }

        System.out.println(countJava);


        System.out.println("-------------------------------------------------");
        // what is the ford is not java? Here is how to find second word in sentence

        String s = "Cat Cat Cat Cat Dog Dog";
        int countCat = 0;
        int countDog = 0;

        for (int  i = 0;  i <= s.length()-3;  i++) {  // in the substring last index is always excluded that's why we add -1
            String each = s.substring(i, i + 3);

            if (each.equals("Cat")){
                countCat++;
            }
            if (each.equals("Dog")){
                countDog++;

            }

        }

        System.out.println(countCat);
        System.out.println(countDog);


    }
}
