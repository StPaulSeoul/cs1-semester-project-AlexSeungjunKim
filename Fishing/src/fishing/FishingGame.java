package fishing;
import java.util.Scanner;
import java.util.Random;
import java.security.SecureRandom;

public class FishingGame {
	static int[][] fishery;
	
	public static void main(String [] ARGS){
		Scanner input = new Scanner(System.in);
		
		int size = 0;
		int counter = 0;
		double implement = 1.025;
		String requestedCoords;
		int[] coords = {0, 0};
		boolean valid = false;
		counter ++;
		
		System.out.printf("Day %d\n",counter);
		System.out.println("You are running low on funds.");
		System.out.println("You tried finding 'normal' jobs, but there were none available.");
		System.out.println("You decided to create a makeshift raft, and set out into the ocean.");
		System.out.println("You have a fishing line tied to a wooden dowel rod as a crude fishing rod.");
		System.out.println("What would you like for the area of the fishery?");
		size = input.nextInt();
		fishery = new int[size][size];
		System.out.printf("You decided to fish in a %dNM x %dNM fishery.", size, size);
		createGrid (size);
		System.out.println();
		selectionGrid();
		outputFishery();
		System.out.println("Provide the coordinates to the area you will fish in. (E.g. 3, 4)");
		input.nextLine();
		requestedCoords = input.nextLine();
		requestedCoords = requestedCoords.replaceAll("\\s+", "");
		String scoords[] = requestedCoords.split(",");
		coords[0] = Integer.parseInt(scoords[0]);
		coords[1] = Integer.parseInt(scoords[1]);
		System.out.printf("You bring your boat to %d, %d.", coords[0], coords[1]);
		}
	public static void createGrid (int size){
		SecureRandom rand = new SecureRandom();
		int max = 100;
		int min = 1;
		for(int x=0; x < size; x++){
			for(int y=0; y< size; y++){
				fishery[x][y] = rand.nextInt((max-min)+1)+min;
			}
		}
	}
	
	public static void outputFishery(){
		for(int x=0; x < fishery.length; x++){
			System.out.printf("%2d |", x);
			for(int y=0; y < fishery.length; y++){
				System.out.printf("   ~ ");
			}
			System.out.println();
		}
	}
	
	public static void selectionGrid(){
		System.out.printf("   |");
		for (int i = 0; i < fishery.length; i++){
			System.out.printf(" %3d ", i);
		}
		System.out.printf("%n----");
		for (int i = 0; i < fishery.length; i++){
			System.out.printf("-----");
		}
		System.out.printf("%n");
	}
	public static void fish(String [] coords, int size, int[][] fishery, double implement){
		
	}
}
