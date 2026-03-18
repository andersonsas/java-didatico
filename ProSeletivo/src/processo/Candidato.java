package processo;

public class Candidato {
	private String nome;
	private int nInscricao;
	private float notaEnem;
	private Curso curso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnInscricao() {
		return nInscricao;
	}

	public void setnInscricao(int nInscricao) {
		this.nInscricao = nInscricao;
	}

	public float getNotaEnem() {
		return notaEnem;
	}

	public void setNotaEnem(float notaEnem) {
		this.notaEnem = notaEnem;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
