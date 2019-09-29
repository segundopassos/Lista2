package Sistema;

public class Main {
		public static void main(String[] args) {
			Aluno ME=new Aluno();
			Disciplina Programacao=new Disciplina();
			Professor professor=new Professor();
			System.out.println(ME.MeuNome("Juvenal")+" "+ME.matricula(357)+"\nDeseja se cadastrar em:\n"+Programacao.Nome("Programacao ")+Programacao.CargaHoraria(90)+"\n"+professor.DizerNome("Professor Linguiça"));
			//ME.tirarfoto();
			//System.out.println(professor.AprovarOuNao(7));
			}
		}
