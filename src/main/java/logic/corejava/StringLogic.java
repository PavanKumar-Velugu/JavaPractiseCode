package logic.corejava;

public class StringLogic {

	public static void main(String[] args) {
		
		String[] str = {"Flyer","Flye","Flyew"};
		int min=0;
		String result="";
		for(int i=0; i<str.length-1; i++) {
			min = Math.min(str[i].toCharArray().length, str[i+1].toCharArray().length);
		}
		//System.out.println("Minimium Length: "+min);
		for(int j=0; j<min; j++) {
			for(int k=1; k<str.length; k++) {
				boolean res = str[j-j].charAt(j)==str[j+k-j].charAt(j); 
				if(res) {
					if(k==str.length-1)
						result+=str[k].charAt(j);
					continue;
				} else {
					break;
				}
			}
		}

		System.out.println("Matched String: "+result);
		System.out.println("\n---------------------------------------------\n");
		
		

	}

}
