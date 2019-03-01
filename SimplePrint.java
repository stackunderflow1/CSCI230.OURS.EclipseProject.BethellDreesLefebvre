/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author ndrees001
 *
 */
public class SimplePrint {

	/**
	 * 
	 */
	private String pName;
	private int pAge;
	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}

	public SimplePrint() {
		// TODO Auto-generated constructor stub
		
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DeAndre Bethell, Nathan Drees, Noah Lefebvre");
		
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}
	}

}
