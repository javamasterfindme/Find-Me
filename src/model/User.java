package model;



import model.Civilite;



public class User{
	
	
	private String nom;
    private String pseudo;
    private Civilite civilite;
    private int compatibilite;
    
   public User(Civilite civilite, String nom, String pseudo, int compatibilite) {
		super();
		this.setNom(nom);
		this.setPseudo(pseudo) ;
		this.setCivilite(civilite);
		this.setCompatibilite(compatibilite);
	}
   
	public User()
	{
		
	}
/****************************************/
	public void setNom(String nom) {
		if (nom == null) {
			throw new IllegalArgumentException("le nom ne peut pas �tre null");
		}
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
		
	}
	public String getPseudo(){
		return pseudo;
	}
	
	
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
		
	}
	public Civilite getCivilite(){
		return civilite;
	}
	
	public void setCompatibilite(int compatibilite) {
			this.compatibilite = compatibilite;
		}
	
	public int getCompatibilite(){
		return compatibilite;
	}
	
	
	@Override
	public String toString() {
		return "User [nom=" + nom + ", pseudo=" + pseudo + ", civilite=" + civilite + ", compatibilite=" + compatibilite
				+ "]";
	}

	public static void main(String[] args){
	
		/*User toto = new User(Civilite.HOMME,"Loic","LOLO",70);
		System.out.println(toto);*/
	}

}
