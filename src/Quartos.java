public class Quartos {
	private String nomeDoAluno;
	private String emailDoAluno;
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}

	public String getEmailDoAluno() {
		return emailDoAluno;
	}

	public void setEmailDoAluno(String emailDoAluno) {
		this.emailDoAluno = emailDoAluno;
	}

	public Quartos(String nomeDoAluno, String emailDoAluno) {
		
		this.nomeDoAluno = nomeDoAluno;
		this.emailDoAluno = emailDoAluno;
	}
	
}
