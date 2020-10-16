package tpa;


public class Tabuada {
    public static void main(String args[]){
        int numMult = 1;
        for(int i = 1; numMult <= 10; i++) {
		int calc = numMult * i;
		System.out.println(numMult + "x" + i +"= "+ calc);
                if(i == 10){
                    numMult++;
                    i = 0;
                };               
	}
    }
}
