
package game;

public class Player {
  
    
    String name,e;
    int Speed,HealtPoint,Attack,Defend,Attacke,Defende,HealtPointe;
    
    void run(){
        System.out.println(name+"Stats...");
        System.out.println("Healt: "+HealtPoint);        
        System.out.println("Speed: "+Speed);
        System.out.println("Defend: "+Defend);
        
    }
    
    void ATk(){
        System.out.println(name+"is Atacking : "+ e);
        System.out.println(name+"Deal "+ Attack +" To "+e);
        Attack=-Defende;
        if(Defende<=0){
            System.out.println(name+"Kill"+e);
        }
    }
    void DEf(){
        System.out.println(name+"Is Defending From : "+e+"Attack");
        System.out.println(e+"Deal "+Attacke+" To "+name);
        HealtPoint-=Attacke;
    }
    
    
    boolean isDead(){
       if(HealtPoint<=0) return true;
       return false;
    }
    boolean isDeade(){
       if(HealtPointe<=0) return true;
       return false;
    }
    



}

