
public class MinecraftPlayer{
    String username;
    boolean HouseBuilt;
    int Health;
    int DirtBlocks;
    
    MinecraftPlayer(String name, int sk, int db){
       username = name;
       HouseBuilt = false;
       Health = 20;
       DirtBlocks = 0;
    }
   int damage(int dmg){
    Health = Health - dmg;
    System.out.println("ouch!" + username + ":" + Health);
    return Health;
   }  

   int GetHealth(){
        return Health;
   }
    int DigDirtBlocks(){
        DirtBlocks = DirtBlocks + 1;
        return DirtBlocks;
}
    }    