package assignment1;
public class A1Q3 {

	public static void main(String[] args) {
		int count = 0;
		char ch[]= {'c','a','r','b','o','n'};
		for (int a = 0; a<=(ch.length-1); a++) {
			for (int b = 0; b<=(ch.length-1); b++) {
				for (int c = 0; c<=(ch.length-1); c++) {
					for (int d = 0; d<=(ch.length-1); d++) {
						for (int e = 0; e<=(ch.length-1); e++) {
							for (int f = 0; f<=(ch.length-1); f++) {
								if(a!=b && a!=c && a!=d && a!=e && a!=f && b!=c && b!=d && b!=e && b!=f && c!=d && c!=e && c!=f && d!=e && d!=f && e!=f) {
									System.out.println(ch[a]+" "+ch[b]+" "+ch[c]+ " "+ ch[d]+" "+ch[e]+" "+ch[f]);
									count++;
								}
								
							}
						}
					}
				}
			}
		}
		System.out.println("The no of formations are "+ count);
	}

}
