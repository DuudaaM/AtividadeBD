package atividadeBD;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value  = "T")
public class Tecnico extends Pessoa implements Identificavel {

	private String especializacao;
	private String funcao;
	
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especializacao == null) ? 0 : especializacao.hashCode());
		result = prime * result + ((funcao == null) ? 0 : funcao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnico other = (Tecnico) obj;
		if (especializacao == null) {
			if (other.especializacao != null)
				return false;
		} else if (!especializacao.equals(other.especializacao))
			return false;
		if (funcao == null) {
			if (other.funcao != null)
				return false;
		} else if (!funcao.equals(other.funcao))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tecnico [especializacao=" + especializacao + ", funcao=" + funcao + "]";
	}
	
	
	
}
