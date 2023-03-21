package entidade;

public class Atividadeavaliativa {

	private double pesoUm;
	private double pesoDois;
	private double pesoTres;
	private double notaUm;
	private double notaDois;
	private double notaTres;
	
	
	//metodos Contas
	
      public double calcularMedia(double notaUm, double notaDois, double notaTres, double pesoUm, double pesoDois, double pesoTres) {
    	  double media;
    	  media = (notaUm + pesoUm)*(notaDois + pesoDois)*(notaTres + pesoTres);
    	  return media;

      }
      
      public double final1(double pesoUm, double pesoDois, double pesoTres,double media) {
    	  double final2;
    	  final2=media/pesoUm+pesoDois+pesoTres;
    	  return final2;
      }
      
      


	public double getPesoUm() {
		return pesoUm;
	}


	public void setPesoUm(double pesoUm) {
		this.pesoUm = pesoUm;
	}


	public double getPesoDois() {
		return pesoDois;
	}


	public void setPesoDois(double pesoDois) {
		this.pesoDois = pesoDois;
	}


	public double getPesoTres() {
		return pesoTres;
	}


	public void setPesoTres(double pesoTres) {
		this.pesoTres = pesoTres;
	}


	public double getNotaUm() {
		return notaUm;
	}


	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}


	public double getNotaDois() {
		return notaDois;
	}


	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}


	public double getNotaTres() {
		return notaTres;
	}


	public void setNotaTres(double notaTres) {
		this.notaTres = notaTres;
	}
   
	
}
