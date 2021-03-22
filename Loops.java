package com.sparta.AMalcolm;

public class Loops {

    public static void forLoop (){
        for(int i = 0; i < 10; i++) {
            System.out.printf("For: I am counting loops, this is loop %d.\n", i+1);
        }
    }

    public static void whileLoop (){
        int i = 0;
        while (i < 10) {
            System.out.printf("While: I am counting loops, this is loop %d.\n", i+1);
            i++;
        }
    }

    public static void doWhileLoop (){
        int i = 0;
        do {
            System.out.printf("Do-While: I am counting loops, this is loop %d.\n", i+1);
            i++;
        }
        while(i < 10);
    }

    //This is the same as an 'enhanced' for loop
    public static void advancedForLoop (){
        String[] dinosaurs = {"Tyrannosaurus Rex", "Velociraptor", "Stegosaurus", "Therizinosaurus", "Ichtyosaurus", "Iguanodon", "Pachyrhinosaurus", "Triceratops", "Ankylosaurus", "Brontosaurus"};
        System.out.printf("Here is a wonderful array of strings:\n");
        for (String arrayElement : dinosaurs) {
            System.out.printf("%s\n", arrayElement);
        }
    }
}
