package atividadeBD;



public class Main {


	public static void main(String[] args) {

		for(int i = 0; i < 3000; i++) {
		Aluno aluno = new Aluno();
		aluno.setId(1l);
		aluno.setNome("Ana");
		aluno.setDataNascimento("11/12/2002");
		aluno.setIdade(17);
		aluno.setCurso("Inform�tica");
		DAO<Aluno> dao = new DAO<Aluno>();
		dao.save(aluno);
		
		Professor professor = new Professor();
		professor.setId(1l);
		professor.setNome("Jos�");
		professor.setArea("Computa��o");
		professor.setCurso("Inform�tica");
		professor.setDataNascimento("12/11/1987");
		DAO<Professor> daoo = new DAO<Professor>();
		daoo.save(professor);
		
		Tecnico tecnico = new Tecnico();
		tecnico.setId(1l);
		tecnico.setNome("Jo�o");
		tecnico.setFuncao("Concertar os computadores da escola");
		tecnico.setEspecializacao("Manuten��o");
		tecnico.setIdade(34);
		tecnico.setDataNascimento("01/01/1985");
		DAO<Tecnico> daao = new DAO<Tecnico>();
		daao.save(tecnico);
		
	
		}
}}