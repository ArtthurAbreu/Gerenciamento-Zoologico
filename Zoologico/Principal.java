package Zoologico;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		GerenciadorAnimal A = new GerenciadorAnimal();
		GerenciadorFuncionarios F = new GerenciadorFuncionarios();
		Scanner sc = new Scanner(System.in);
		int T1 = 0;
		int TA = 0;
		int TA2 = 0;
		int TAVV = 0;
		int TAINF = 0;
		int TF = 0;
		int TF2 = 0;
		int TFCS = 0;

		do {
			try {
				T1 = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE:\n1-ANIMAIS\n2-FUNCINARIOS\n3-SAIR DO PROGRAMA",
						"MENU", JOptionPane.INFORMATION_MESSAGE));
				switch (T1) {
					case 1:
						TA = Integer.parseInt(JOptionPane.showInputDialog(null,
								"DIGITE:\n1-ADICIONAR ANIMAL\n2-REMOVER ANIMAL\n3-IMPRIMIR ANIMAL \n4-IMPRIMIR TODOS ANIMAIS\n5-INFORMAÇÕES DE ANIMAIS\n6-VISITA AO VETERINÁRIO\n7-ANÁLISE DA GESTAÇÃO - MAMÍFEROS",
								"MENU ANIMAL", JOptionPane.INFORMATION_MESSAGE));
						switch (TA) {
							case 1:
								TA2 = Integer.parseInt(
										JOptionPane.showInputDialog(null, "DIGITE:\n1-ANFÍBIOS\n2-AVES\n3-MAMÍFEROS \n4-PEIXES \n5-RÉPTEIS",
												"ANIMAL", JOptionPane.INFORMATION_MESSAGE));
								switch (TA2) {
									case 1:
										A.AddAnimal(new Anfibios(
												Double.parseDouble(JOptionPane.showInputDialog(null, "INFORME O PESO DO ANFÍBIO: ", "ANFÍBIOS",
														JOptionPane.INFORMATION_MESSAGE)),
												Integer
														.parseInt(JOptionPane.showInputDialog(null, "INFORME A QUANTIDADE DE MEMBROS DO ANFÍBIO: ",
																"ANFÍBIOS", JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A IDADE DO ANFÍBIO: ", "ANFÍBIOS",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "NOME DO ANFÍBIO:", "ANFÍBIOS",
														JOptionPane.INFORMATION_MESSAGE),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME O NÚMERO DA JAULA DO ANFÍBIO: ", "ANFÍBIOS", JOptionPane.INFORMATION_MESSAGE)), 2),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME O ID DO ANFÍBIO: ", "ANFÍBIOS",
														JOptionPane.INFORMATION_MESSAGE))));

										break;

									case 2:
										A.AddAnimal(new Aves(
												Double.parseDouble(JOptionPane.showInputDialog(null, "INFORME O PESO DA AVE: ", "AVES",
														JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A QUANTIDADE DE MEMBROS DA AVE: ",
														"AVES", JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A IDADE DA AVE: ", "AVES",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "NOME DA AVE: ", "AVES", JOptionPane.INFORMATION_MESSAGE),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME O NÚMERO DA JAULA DA AVE: ", "AVES", JOptionPane.INFORMATION_MESSAGE)), 3),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME O ID DA AVE: ", "AVES",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "COR DAS PENAS DA AVE: ", "AVES",
														JOptionPane.INFORMATION_MESSAGE)));
										break;
									case 3:
										A.AddAnimal(new Mamifero(
												Double.parseDouble(JOptionPane.showInputDialog(null, "INFORME O PESO DO MAMÍFERO:: ",
														"MAMÍFEROS", JOptionPane.INFORMATION_MESSAGE)),
												Integer
														.parseInt(JOptionPane.showInputDialog(null, "INFORME A QUANTIDADE DE MEMBROS DO MAMÍFERO: ",
																"MAMÍFEROS", JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A IDADE DO MAMÍFERO: ", "MAMÍFEROS",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "NOME DO MAMÍFERO: ", "MAMÍFEROS",
														JOptionPane.INFORMATION_MESSAGE),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME O NÚMERO DA JAULA DO MAMÍFERO: ", "MAMÍFEROS", JOptionPane.INFORMATION_MESSAGE)),
														4),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME O ID DO MAMÍFERO: ", "MAMÍFEROS",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "COR DOS PELOS DO MAMÍFERO: ", "MAMÍFEROS",
														JOptionPane.INFORMATION_MESSAGE),
												Integer.parseInt(JOptionPane.showInputDialog(null, "TEMPO DE GESTAÇÃO: ", "MAMÍFEROS",
														JOptionPane.INFORMATION_MESSAGE))));
										break;
									case 4:
										A.AddAnimal(new Peixes(
												Double.parseDouble(JOptionPane.showInputDialog(null, "INFORME O PESO DO PEIXE: ", "PEIXE",
														JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A QUANTIDADE DE MEMBROS DO PEIXE: ",
														"PEIXE", JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A IDADE DO PEIXE: ", "PEIXE",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "NOME DO PEIXE: ", "PEIXE", JOptionPane.INFORMATION_MESSAGE),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME O NÚMERO DO AQUARIO DO PEIXE: ", "PEIXE", JOptionPane.INFORMATION_MESSAGE)), 5),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME O ID DO PEIXE: ", "PEIXE",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "COR DAS ESCAMAS DO PEIXE: ", "PEIXE",
														JOptionPane.INFORMATION_MESSAGE)));
										break;
									case 5:
										A.AddAnimal(new Repteis(
												Double.parseDouble(JOptionPane.showInputDialog(null, "INFORME O PESO DO RÉPTIL: ", "RÉPTEIS",
														JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME A QUANTIDADE DE MEMBROS DO RÉPTIL: ", "RÉPTEIS", JOptionPane.INFORMATION_MESSAGE)),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A IDADE DO RÉPTIL: ", "RÉPTEIS",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "NOME DO RÉPTIL: ", "RÉPTEIS",
														JOptionPane.INFORMATION_MESSAGE),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null,
														"INFORME O NÚMERO DA JAULA DO RÉPTIL: ", "RÉPTEIS", JOptionPane.INFORMATION_MESSAGE)), 6),
												Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME O ID DO RÉPTIL: ", "RÉPTEIS",
														JOptionPane.INFORMATION_MESSAGE)),
												JOptionPane.showInputDialog(null, "COR DAS ESCAMAS: ", "RÉPTEIS",
														JOptionPane.INFORMATION_MESSAGE)));
										break;
									default:
										JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
												JOptionPane.ERROR_MESSAGE);
										break;
								}
								break;

							case 2:
								A.remover(Integer.parseInt(JOptionPane.showInputDialog(null, "ID DO ANIMAL QUE DESEJA REMOVER: ",
										"REMOVER ANIMAL", JOptionPane.INFORMATION_MESSAGE)));
								break;
							case 3:
								A.imprimir(Integer.parseInt(JOptionPane.showInputDialog(null, "ID DO ANIMAL QUE DESEJA IMPRIMIR: ",
										"IMPRIMIR ANIMAL", JOptionPane.INFORMATION_MESSAGE)));
								break;
							case 4:
								A.imprimirTodos();
								break;
							case 5:
								TAINF = Integer.parseInt(JOptionPane.showInputDialog(null,
										"INFORME A CLASSE DO ANIMAL:\n1-ANFÍBIOS\n2-AVES\n3-MAMÍFEROS \n4-PEIXES \n5-RÉPTEIS", "ANIMAL",
										JOptionPane.INFORMATION_MESSAGE));
								int IDINF = Integer.parseInt(JOptionPane.showInputDialog(null, "ID DO ANIMAL:", "INFORMAÇÃO DO ANIMAL",
										JOptionPane.INFORMATION_MESSAGE));
								switch (TAINF) {
									case 1:
										Anfibios AINF = (Anfibios) A.buscarAnimal(IDINF);
										AINF.InfoAnimais();
										break;
									case 2:
										Aves AvINF = (Aves) A.buscarAnimal(IDINF);
										AvINF.InfoAnimais();
										break;
									case 3:
										Mamifero MINF = (Mamifero) A.buscarAnimal(IDINF);
										MINF.InfoAnimais();
										break;
									case 4:
										Peixes PINF = (Peixes) A.buscarAnimal(IDINF);
										PINF.InfoAnimais();
										break;
									case 5:
										Repteis RINF = (Repteis) A.buscarAnimal(IDINF);
										RINF.InfoAnimais();
										break;
									default:
										JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
												JOptionPane.ERROR_MESSAGE);
										break;
								}
								break;
							case 6:
								TAVV = Integer.parseInt(JOptionPane.showInputDialog(null,
										"INFORME A CLASSE DO ANIMAL:\n1-ANFÍBIOS\n2-AVES\n3-MAMÍFEROS \n4-PEIXES \n5-RÉPTEIS", "ANIMAL",
										JOptionPane.INFORMATION_MESSAGE));
								int IDVV = 0;
								Veterinario VVV = new Veterinario();
								if (TAVV < 6) {
									IDVV = Integer.parseInt(JOptionPane.showInputDialog(null, "ID DO ANIMAL:", "VISITA DO VETERINÁRIO",
											JOptionPane.INFORMATION_MESSAGE));
									VVV = (Veterinario) F.buscarFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null,
											"MATRÍCULA DO VETERINÁRIO:", "VISITA DO VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE)));
								}

								switch (TAVV) {
									case 1:
										Anfibios AVV = (Anfibios) A.buscarAnimal(IDVV);
										AVV.VisitaAoVeterinario(VVV, 0, IDVV);
										break;
									case 2:
										Aves AvVV = (Aves) A.buscarAnimal(IDVV);
										AvVV.VisitaAoVeterinario(VVV, 0, IDVV);
										break;
									case 3:
										Mamifero MVV = (Mamifero) A.buscarAnimal(IDVV);
										MVV.VisitaAoVeterinario(VVV, 0, IDVV);
										break;
									case 4:
										Peixes PVV = (Peixes) A.buscarAnimal(IDVV);
										PVV.VisitaAoVeterinario(VVV, 0, IDVV);
										break;
									case 5:
										Repteis RVV = (Repteis) A.buscarAnimal(IDVV);
										RVV.VisitaAoVeterinario(VVV, 0, IDVV);
										break;
									default:
										JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
												JOptionPane.ERROR_MESSAGE);
										break;
								}
								break;
							case 7:
								int IDG = Integer.parseInt(JOptionPane.showInputDialog(null, "ID DO ANIMAL:", "ANÁLISE DA GESTAÇÃO",
										JOptionPane.INFORMATION_MESSAGE));
								Animal aux = A.buscarAnimal(IDG);
								if (aux instanceof Mamifero) {
									Mamifero MG = (Mamifero) A.buscarAnimal(IDG);
									MG.Analisedagestacao(Integer.parseInt(JOptionPane.showInputDialog(null, "TEMPO DE GESTAÇÃO: ",
											"ANÁLISE DA GESTAÇÃO", JOptionPane.INFORMATION_MESSAGE)));
								} else {
									JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! ANIMAL NÃO É UM MAMÍFERO.", "ERRO",
											JOptionPane.ERROR_MESSAGE);
								}
								break;
							default:
								JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
										JOptionPane.ERROR_MESSAGE);
								break;

						}
						break;
					case 2:
						TF = Integer.parseInt(JOptionPane.showInputDialog(null,
								"DIGITE:\n1-ADICIONAR FUNCIONÁRIO\n2-REMOVER FUNCIONÁRIO\n3-IMPRIMIR FUNCIONÁRIO \n4-IMPRIMIR TODOS FUNCIONÁRIOS\n5-CALCULAR SALÁRIO DO FUNCIONÁRIO",
								"MENU FUNCIONÁRIOS", JOptionPane.INFORMATION_MESSAGE));
						switch (TF) {
							case 1:
								TF2 = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE:\n1-GERENTE\n2-VETERINÁRIO\n3-ZELADOR",
										"FUNCIONÁRIOS", JOptionPane.INFORMATION_MESSAGE));
								switch (TF2) {
									case 1:
										F.addFuncionario(new Gerente(
												JOptionPane.showInputDialog(null, "NOME DO GERENTE: ", "GERENTE",
														JOptionPane.INFORMATION_MESSAGE),
												Integer.parseInt(JOptionPane.showInputDialog(null, "MATRÍCULA DO GERENTE: ", "GERENTE",
														JOptionPane.INFORMATION_MESSAGE)),
												Double.parseDouble(JOptionPane.showInputDialog(null, "SALÁRIO BASE DO GERENTE: ", "GERENTE",
														JOptionPane.INFORMATION_MESSAGE)),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A SALA DO GERENTE: ",
														"GERENTE", JOptionPane.INFORMATION_MESSAGE)), 1)));
										break;

									case 2:
										F.addFuncionario(new Veterinario(
												JOptionPane.showInputDialog(null, "NOME DO VETERINÁRIO: ", "VETERINÁRIO",
														JOptionPane.INFORMATION_MESSAGE),
												Integer.parseInt(JOptionPane.showInputDialog(null, "MATRÍCULA DO VETERINÁRIO: ", "VETERINÁRIO",
														JOptionPane.INFORMATION_MESSAGE)),
												Double.parseDouble(JOptionPane.showInputDialog(null, "SALÁRIO BASE DO VETERINÁRIO: ",
														"VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE)),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A SALA DO VETERINÁRIO: ",
														"VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE)), 1),
												250,
												Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTIDADE DE ANIMAIS ATENDIDOS: ",
														"VETERINÁRIO", JOptionPane.INFORMATION_MESSAGE))));
										break;
									case 3:
										F.addFuncionario(new Zelador(
												JOptionPane.showInputDialog(null, "NOME DO ZELADOR: ", "ZELADOR",
														JOptionPane.INFORMATION_MESSAGE),
												Integer.parseInt(JOptionPane.showInputDialog(null, "MATRÍCULA DO ZELADOR: ", "ZELADOR",
														JOptionPane.INFORMATION_MESSAGE)),
												Double.parseDouble(JOptionPane.showInputDialog(null, "SALÁRIO BASE DO ZELADOR: ", "ZELADOR",
														JOptionPane.INFORMATION_MESSAGE)),
												new Local2(Integer.parseInt(JOptionPane.showInputDialog(null, "INFORME A SALA DO ZELADOR: ",
														"ZELADOR", JOptionPane.INFORMATION_MESSAGE)), 1)));
										break;
									default:
										JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
												JOptionPane.ERROR_MESSAGE);
										break;
								}
								break;
							case 2:
								F.remover(
										Integer.parseInt(JOptionPane.showInputDialog(null, "MATRÍCULA DO FUNCIONÁRIO QUE DESEJA REMOVER: ",
												"REMOVER FUNCIONÁRIO", JOptionPane.INFORMATION_MESSAGE)));
								break;
							case 3:
								F.imprimir(
										Integer.parseInt(JOptionPane.showInputDialog(null, "MATRÍCULA DO FUNCIONÁRIO QUE DESEJA IMPRIMIR: ",
												"IMPRIMIR FUNCINÁRIO", JOptionPane.INFORMATION_MESSAGE)));
								break;
							case 4:
								F.imprimirTodos();
								break;
							case 5:
								TFCS = Integer
										.parseInt(JOptionPane.showInputDialog(null, "DIGITE:\n1-GERENTE\n2-VETERINÁRIO\n3-ZELADOR",
												"ESCOLHA O TIPO DO FUNCIONÁRIOS", JOptionPane.INFORMATION_MESSAGE));
								int MCS = 0;
								if (TFCS < 4) {
									MCS = Integer.parseInt(JOptionPane.showInputDialog(null, "MATRICULA DO FUNCIONÁRIO:",
											"CALCULAR SALÁRIO DO FUNCIONÁRIO", JOptionPane.INFORMATION_MESSAGE));
								}
								switch (TFCS) {
									case 1:
										Gerente GCS = (Gerente) F.buscarFuncionario(MCS);
										GCS.calculaSalario();
										break;
									case 2:
										Veterinario VCS = (Veterinario) F.buscarFuncionario(MCS);
										VCS.calculaSalario();
										break;
									case 3:
										Zelador ZCS = (Zelador) F.buscarFuncionario(MCS);
										ZCS.calculaSalario();
										break;
									default:
										JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
												JOptionPane.ERROR_MESSAGE);
										break;
								}
								break;
							default:
								JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO",
										JOptionPane.ERROR_MESSAGE);
								break;
						}
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!", "", JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! TENTE NOVAMENTE.", "ERRO", JOptionPane.ERROR_MESSAGE);
						break;
				}
			} catch (Exception E) {
				JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
		} while (T1 != 3);
		sc.close();
	}
}