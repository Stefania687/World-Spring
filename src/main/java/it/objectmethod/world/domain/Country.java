package it.objectmethod.world.domain;

public class Country {
	private String codiceNazione;
	private String nomeNazione;
	private String continente;
	private String regione;
	private String annoIndipendenza;
	private double aspettativaVita;
	private int popolazione;
	private int estensioneGeografica;
	private int gnp;
	private int gnpoId;
	private String nomeAbitanti;
	private String formaGoverno;
	private String capoDiStato;
	private String capitale;
	private String codiceCapitale;

	protected String getRegione() {
		return regione;
	}

	protected void setRegione(String regione) {
		this.regione = regione;
	}

	protected String getAnnoIndipendenza() {
		return annoIndipendenza;
	}

	protected void setAnnoIndipendenza(String annoIndipendenza) {
		this.annoIndipendenza = annoIndipendenza;
	}

	protected double getAspettativaVita() {
		return aspettativaVita;
	}

	protected void setAspettativaVita(double aspettativaVita) {
		this.aspettativaVita = aspettativaVita;
	}

	protected int getGnp() {
		return gnp;
	}

	protected void setGnp(int gnp) {
		this.gnp = gnp;
	}

	protected int getGnpoId() {
		return gnpoId;
	}

	protected void setGnpoId(int gnpoId) {
		this.gnpoId = gnpoId;
	}

	protected String getNomeAbitanti() {
		return nomeAbitanti;
	}

	protected void setNomeAbitanti(String nomeAbitanti) {
		this.nomeAbitanti = nomeAbitanti;
	}

	protected String getFormaGoverno() {
		return formaGoverno;
	}

	protected void setFormaGoverno(String formaGoverno) {
		this.formaGoverno = formaGoverno;
	}

	protected String getCapoDiStato() {
		return capoDiStato;
	}

	protected void setCapoDiStato(String capoDiStato) {
		this.capoDiStato = capoDiStato;
	}

	protected String getCapitale() {
		return capitale;
	}

	protected void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	protected String getCodiceCapitale() {
		return codiceCapitale;
	}

	protected void setCodiceCapitale(String codiceCapitale) {
		this.codiceCapitale = codiceCapitale;
	}

	public String getCodiceNazione() {
		return codiceNazione;
	}

	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}

	public String getNomeNazione() {
		return nomeNazione;
	}

	public void setNomeNazione(String nomeNazione) {
		this.nomeNazione = nomeNazione;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}

	public int getEstensioneGeografica() {
		return estensioneGeografica;
	}

	public void setEstensioneGeografica(int estensioneGeografica) {
		this.estensioneGeografica = estensioneGeografica;
	}

}
