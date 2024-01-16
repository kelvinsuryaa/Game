
package game;

import java.util.Random;


public class Game {



    public static void main(String[] args) {
        Player petani = new Player();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int randomNumber1 = random.nextInt(100) + 1;
        int randomNumber2 = random.nextInt(100) + 1;
        int randomNumber3 = random.nextInt(100) + 1;
        int  r= random.nextInt(90) + 1;
        int  r1= random.nextInt(90) + 1;
        int  r2= random.nextInt(90) + 1;
        
        petani.e="Devil's King ";
        petani.name = "Hero ";
        petani.HealtPointe = r2;
        petani.Attacke = r1;
        petani.Defende = r;
        petani.Speed = randomNumber;
        petani.HealtPoint = randomNumber1;
        petani.Attack = randomNumber2;
        petani.Defend = randomNumber3;
        petani.run();
        System.out.println("----------------------------");
        petani.DEf();        
        if(petani.isDead()){
        System.out.println("----------------------------");         
            System.out.println("Game Over!");
            System.exit(0);
        }
        System.out.println("----------------------------");
        petani.ATk();
        System.out.println("----------------------------");
        petani.run();
        if(petani.isDeade()){
            System.out.println("Devil's King Is Die");
            System.exit(0);
            }
        else{
            System.out.println("Opps The Devil's King manage to run try again");
            System.exit(0);
        }
        
        
        
        

    
}
}