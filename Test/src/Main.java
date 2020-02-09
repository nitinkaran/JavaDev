

interface I1{
	void nitin();
}
interface I2 extends I1{
	void karan();
}
class nk implements I2
{

	@Override
	public void nitin() {
		// TODO Auto-generated method stub
		System.out.println(" hello i am nitin");
	}


	@Override
	public void karan() {
		// TODO Auto-generated method stub
		System.out.println(" hello i am karan");
	}
	
}
