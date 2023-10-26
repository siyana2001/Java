
package NewProj;

public class BankMain {
	public static void main(String args[]) {
		BankDetail bk = new BankDetail();
		bk.setAcntname("Hajral Siyana");
		bk.setAcntnumber(80147979);
		bk.setBranchname("kodambakkam");
		bk.setIfscno(78879);
		System.out.println("Account name: "+bk.getAcntname());
		System.out.println("Account Number: " +bk.getAcntnumber());
		System.out.println("Branch: " +bk.getBranchname());
		System.out.println("IFSC Number:"+ bk.getIfscno());
		
	}

}
