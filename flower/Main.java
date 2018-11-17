package flower;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Rose defaultRose = new Rose(5);
        Chamomile defaultChamomile = new Chamomile(3);
        Tulip defaultTulip = new Tulip(10);

        FlowerBucket defaultBucket1 = new FlowerBucket();
        defaultBucket1.addFlower(defaultRose);

        FlowerBucket defaultBucket2 = new FlowerBucket();
        defaultBucket2.addFlower(defaultChamomile);
        defaultBucket2.addFlower(defaultTulip);

        System.out.println("Do you want to buy an default bucket (press '1' so) or to make your own bucket(press '2')");
        FlowerBucket bucket = new FlowerBucket();
        Scanner sc = new Scanner(System.in);
        int genaralAnswer = sc.nextInt();
        if (genaralAnswer == 1) {
            System.out.println("There is two buckets for you:");
            System.out.println(defaultBucket1);
            System.out.println("and");
            System.out.println(defaultBucket2);
            System.out.println("Price of the first bucket is " + defaultBucket1.getPrice() +
                    "$ and the price of the second one is " + defaultBucket2.getPrice());
            System.out.println("Wwhich one? (press 1 for first and 2 for second)");
            Scanner scan = new Scanner(System.in);
            int whichOne = scan.nextInt();
            if (whichOne == 1){
                System.out.println("This bucket for you: " + defaultBucket1);
                System.out.println("You have to pay " + defaultBucket1.getPrice() + ". Thank you");
            }
            if (whichOne == 2){
                System.out.println("This bucket for you: " + defaultBucket2);
                System.out.println("You have to pay " + defaultBucket2.getPrice() + ". Thank you");
            }
        }
        if (genaralAnswer == 2){
            boolean bool = true;
            while (bool){
                System.out.println("Choose a type of flower: rose, chamomile or tulip");
                Scanner type = new Scanner(System.in);
                String flower = type.nextLine();

                System.out.println("How many?");
                Scanner quant= new Scanner(System.in);
                int quantity = quant.nextInt();

                if (flower.equals("rose")) {
                    Rose rose = new Rose(quantity);
                    bucket.addFlower(rose);
                }
                if (flower.equals("chamomile")){
                    Chamomile chamomile = new Chamomile(quantity);
                    bucket.addFlower(chamomile);
                }
                if (flower.equals("tulip")){
                    Tulip tulip = new Tulip(quantity);
                    bucket.addFlower(tulip);
                }

                System.out.println("More flowers?");
                Scanner finalQuestion = new Scanner(System.in);
                String finalQuest = finalQuestion.nextLine();

                if (finalQuest.equals("no")){
                    System.out.println("This bucket for you: " + bucket);
                    System.out.println("You have to pay " + bucket.getPrice() + ". Thank you");
                    bool = false;
                }
            }
        }
    }


}





