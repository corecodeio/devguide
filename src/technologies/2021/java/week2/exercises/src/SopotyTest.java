import java.util.Scanner;

public class SpotyTest 
{
    public static void main(String[] args) 
    {
        String songs = "25/8:cancion2:Digital Love:Sunday Best:Eye of the Tiger:Back In Black:Disco Yes:Set Alight:Wild Roses:Starboy";
        Spoty spoty = new Spoty(songs);
        Scanner lectura = new Scanner(System.in);
        int option = 0;
        while (option != 7) 
        {
            System.out.println("1. Actual song\n2. Next\n3. Prev");
            System.out.println("4. Random\n5. Choose a song # \n6. Show songs\n7. Exit");
            System.out.println(">  ");
            option = lectura.nextInt();
            switch(option) 
            {
                case 1: 
                {
                    System.out.println("Actual song: " + spoty.getActualSong());
                    System.out.println();
                    break; 
                }
                case 2: 
                {
                    System.out.println("Next song");
                    spoty.next();
                    System.out.println("Song: " + spoty.getActualSong());
                    System.out.println();					
                    break; 
                }
                case 3: 
                {
                    System.out.println("Previous song");
                    spoty.prev();
                    System.out.println("Song: " + spoty.getActualSong());
                    System.out.println();					
                    break; 
                }		
                case 4: 
                {
                    System.out.println("Random song");
                    spoty.random();
                    System.out.println("Song: " + spoty.getActualSong());
                    System.out.println();					
                    break;	
                }						
                case 5: 
                {
                    System.out.println("Choose a song");
                    System.out.println("Ingrese numero de cancion:");
                    System.out.println(spoty);
                    int n = lectura.nextInt();
                    spoty.playThisSong(n);
                    System.out.println("Song: " + spoty.getActualSong());
                    System.out.println();					
                    break; 
                }
                case 6: 
                {
                    System.out.println("Songs:");
                    System.out.println(spoty);
                    System.out.println();					
                    break;	
                }	
                case 7: 
                {
                    System.out.println("Closing...");
                    System.out.println();					
                    break; 
                }
                default: 
                    System.out.println("Not a valid option");
                    System.out.println();				
            }
        }
    }
}