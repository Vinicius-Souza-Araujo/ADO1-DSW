package ado1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/curriculo")
public class HomeController {

    @GetMapping()
    public ModelAndView viewObj(){
        ModelAndView view = new ModelAndView("curriculo");

        view.addObject("nome", "Vinicius Souza");
        view.addObject("tituloSobre", "Desenvolvedor Front End & Back End");
        view.addObject("experiencia", "Experiência");
        view.addObject("formacao", "Formação");
        view.addObject("contato", "Contato");
        view.addObject("infoSobre", "02/07/2003 - Embu das Artes, São Paulo");

        view.addObject("paragrafoExperiencia1", "Desenvolvi uma ampla gama de projetos acadêmicos de escala reduzida, aplicando de maneira eficaz meus conhecimentos em linguagens e tecnologias como HTML, CSS, JavaScript, React, React Native, Java entre outras. Cada projeto demonstrou minha capacidade de criar soluções criativas e funcionais, evidenciando minha expertise na aplicação prática dessas ferramentas.");
        view.addObject("paragrafoExperiencia2", "Você pode conferir");
        view.addObject("clicandoAqui", "clicando aqui");

        view.addObject("tecnologo", "TECNÓLOGO");
        view.addObject("ADS", "Análise e Desenv. de Sistemas");
        view.addObject("senac", "SENAC-SP");
        view.addObject("cursando", "Cursando");

        view.addObject("tecnico", "TÉCNICO");
        view.addObject("DS", "Desenvolvimento de Sistemas");
        view.addObject("senai", "SENAI SUIÇO");
        view.addObject("dataFinalSenai", "07/2021 - 12/2022");

        view.addObject("extensao", "EXTENSÃO E CAP. PROFISSIONAL");
        view.addObject("Academia", "Academia .NET");
        view.addObject("UFN", "UFN / ATOS");
        view.addObject("dataFinalAcademia", "04/2023 - 07/2023");

        view.addObject("bootcamp", "BOOTCAMP");
        view.addObject("AcademiaInfra", "Academia Infraestrutura");
        view.addObject("avanade", "AVANADE");
        view.addObject("dataFinalAcademiaInfra", "06/2023 - 07/2023");

        view.addObject("html", "HTML");
        view.addObject("css", "CSS");
        view.addObject("javascript", "JavaScript");
        view.addObject("reactJs", "ReactJS");
        view.addObject("reactNative", "React Native");
        view.addObject("java", "Java");
        view.addObject("mysql", "MySQL");
        view.addObject("aspNetMVC", "ASP.NET MVC");
        view.addObject("aspNetApi", "API de ASP.NET para Web");
        view.addObject("entityFramework", "Entity Framework");
        view.addObject("sqlServer", "SQL Server");
        view.addObject("nodeJs", "NodeJS");
        view.addObject("fieldServices", "Field Services");
        view.addObject("asset", "Asset");
        view.addObject("mobilidade", "Mobilidade");
        view.addObject("workplace", "Workplace");


        view.addObject("info", "Info");
        view.addObject("email", "vinicius.exemplo9999@gmail.com");
        view.addObject("telefone", "(11) 99999 - 9999");



        view.addObject("linkedin", "Linkedin");
        view.addObject("github", "GitHub");

        view.addObject("paragrafoFooter", "Todos os direitos reservados 2023 ©");



        return view;
    }
}
