package ankush.com;

public class Main {
    public static void main(String[] args) {
      player1 player = new player1("ankush","sword",100);
   //     System.out.println(player.getName());
   //      System.out.println(player.getHealth());
   //     System.out.println(player.getWeapon());

         player.damageByGun1();
        player.damageByGun1();
        player.heal();
        player.damageBYGun2();
        player.damageBYGun2();
        player.heal();

      //  player2 betterPlayer = new player2("Rohan","machin gun",80,false);
        //        betterPlayer.damageByGun1();
    }
}