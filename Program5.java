//import stuff here?

//Your code here
public class Program5{
    public static void main(String[] args){
        //variables
        int royaleMi = 286;
        int koopaMi = 412;
        int pipeMi = 361;
        int badwagonMi = 161;
                
        int royaleGal = 9;
        int koopaGal = 40;
        int pipeGal = 18;
        int badwagonGal = 11;
        
        double avg1 = (double) (royaleMi)/royaleGal;
        double avg2 = (double) (koopaMi)/koopaGal;
        double avg3 = (double) (pipeMi)/pipeGal;
        double avg4 = (double) (badwagonMi)/badwagonGal;
        
        double avgRound1 = ((double) ((int) ((avg1*10)+0.5)))/10;
        double avgRound2 = ((double) ((int) ((avg2*10)+0.5)))/10;
        double avgRound3 = ((double) ((int) ((avg3*10)+0.5)))/10;
        double avgRound4 = ((double) ((int) ((avg4*10)+0.5)))/10;

        System.out.println("royale averaged: "+avgRound1);
        System.out.println("Koopa King averaged: "+avgRound2);
        System.out.println("Pipe Frame averaged: "+avgRound3);
        System.out.println("Badwagon averaged: "+avgRound4);
        /*
        System.out.println("koopa average: "+avg2);
        System.out.println("pipe frame average: "+avg3);
        System.out.print("badwagon average: "+avg4);
        */
    }
}
//Paste console output below:
/*
royale averaged: 31.8
Koopa King averaged: 10.3
Pipe Frame averaged: 20.1
Badwagon averaged: 14.6
*/
