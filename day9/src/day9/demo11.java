package day9;

public class demo11 {

	public static void main(String[] args) {
		int i=1;

		do{

		if(i==5){

		i++; //6

		continue;

		}

		System.out.println(i); //1 2 3 4 6

		i++; //2 3 4 5 7

		}while(i<=10); //3<=10

		// TODO Auto-generated method stub

	}

}
