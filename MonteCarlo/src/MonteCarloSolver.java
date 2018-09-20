
public class MonteCarloSolver {
	public int tries;
	public double inner;
	public double out;
	public double PI;
	
	
	
	public MonteCarloSolver(int tentativas){
		this.tries = tentativas;
		this.inner = 0;
		this.out = 0;
		solve();
		calculatePI();
	}
	
	public void solve(){
		for (int i=0; i <= tries; i++){
	
		double x = Math.random();
		double y = Math.random();
		double hipo = x*x + y*y;
		if(hipo < 1)
			inner++;
		else 
			out++;
		}
	}
		
	
	public double calculatePI(){
		PI = (inner/(out + inner))*4;
		return PI;
		
	}

}
