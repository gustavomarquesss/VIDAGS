package com.br.globalsolution2.teste;

import com.br.globalsolution2.classes.Login;
import com.br.globalsolution2.classes.Usuario;
import com.br.globalsolution2.classes.ListaDeConexoes;
import com.br.globalsolution2.classes.ConectividadePessoal;
import com.br.globalsolution2.classes.SensorDeSaude;
import com.br.globalsolution2.classes.MonitoramentoContinuo;
import com.br.globalsolution2.classes.ConectividadeComProfissional;
import com.br.globalsolution2.classes.DoencasPrevenidas;
import com.br.globalsolution2.classes.PontuacaoDeSaude;
import com.br.globalsolution2.classes.Metas;
import com.br.globalsolution2.classes.PlanoDeSaude;
import com.br.globalsolution2.classes.VerificacaoDeSaude;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login login = new Login("murillo12", "fiap1tinr");
        Usuario usuario = new Usuario("Murillo", "11923232838", "123456-7", "3298392382", "Rua Lins de Vasconscelos, 1222", "01/01/2023", "foto.jpg");
        ListaDeConexoes listaDeConexoes = new ListaDeConexoes();
        ConectividadePessoal conectividadePessoal = new ConectividadePessoal(listaDeConexoes);
        SensorDeSaude sensorDeSaude = new SensorDeSaude(45, 36.5, 90.0, 120);
        MonitoramentoContinuo monitoramentoContinuo = new MonitoramentoContinuo(true, "Ativo");
        ConectividadeComProfissional conectividadeComProfissional = new ConectividadeComProfissional(true, "Ativo", "CRM551292");
        DoencasPrevenidas doencasPrevenidas = new DoencasPrevenidas(false, true, false, false, false, true, true);
        PontuacaoDeSaude pontuacaoDeSaude = new PontuacaoDeSaude(5, "Top 10");
        Metas metas = new Metas("10.000 passos por dia", "Correr 5 km por semana", "Lembre-se de se hidratar!");
        PlanoDeSaude PlanoDeSaude = new PlanoDeSaude("15% de desconto", "Acesso a serviços premium", "Parceria com Hospital Notredame");


        VerificacaoDeSaude verificacaoDeSaude = doencasPrevenidas;
        verificacaoDeSaude.verificarSaude();

 
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Acompanhamento em tempo real: " + conectividadeComProfissional.isAcompanhamentoEmTempoReal());
        System.out.println("Estilo de vida: " + conectividadeComProfissional.getEstiloDeVida());
        System.out.println("CRM do profissional: " + conectividadeComProfissional.getCRM());
        System.out.println("Saúde: " + sensorDeSaude.getFrequenciaCardiaca());
        System.out.println("Metas: " + metas.getDesafiosSemanais());
        System.out.println("Plano de saúde: " + PlanoDeSaude.getDescontosGraduados());


        System.out.println("Nível de pontuação de saúde: " + pontuacaoDeSaude.getNivel());

        doencasPrevenidas.verificarSaude();
	}

}
