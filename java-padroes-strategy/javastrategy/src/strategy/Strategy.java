package strategy;

public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comportamento comportamento = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(comportamento);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
	}

}
