/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-21 14:54:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005faluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"index_aluno.css\">\r\n");
      out.write("    <title>Aluno</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"menu\">\r\n");
      out.write("    <h1 class=\"titulo-menu\">Sistema de Gerenciamento</h1>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"principal\">\r\n");
      out.write("        <li><a href=\"index_funcionario.jsp\">Professores</a></li>\r\n");
      out.write("        <br>\r\n");
      out.write("        <li><a href=\"index_aluno.jsp\">Alunos </a></li>\r\n");
      out.write("        <br>\r\n");
      out.write("        <li><a href=\"index_instituicoes.jsp\">Instituições</a> </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"secundaria\">\r\n");
      out.write("        <li> <a href=\"cadastro.html#paralogin\"> Login</a></li>\r\n");
      out.write("        <br>\r\n");
      out.write("        <li> <a href=\"index.jsp#paracadastro\"> Cadastro</a> </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div><h1 class=\"stud\">Aluno</h1></div>\r\n");
      out.write("\r\n");
      out.write("<main>\r\n");
      out.write("    <form class=\"informacao-pessoal\" method=\"post\" action=\"/create-aluno\">\r\n");
      out.write("        <h1 class=\"infos-pess\">INFORMAÇÕES PESSOAIS</h1>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"nome\">Nome Completo:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" name=\"nome\" id=\"nome\" value=\"${param.name}\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"sexo\" class=\"sexo\">Sexo:</label>\r\n");
      out.write("        <label for=\"Feminino\"> <input type=\"radio\" name=\"sexo\" value=\"${param.sexo}\" id=\"radio-feminino\">Feminino</label>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"masculino\"> <input type=\"radio\" name=\"sexo\" value=\"${param.sexo}\" id=\"radio-masculino\">Masculino</label>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <label for=\"dataNascimento\">Data de Nascimento</label>\r\n");
      out.write("        <input type=\"date\" name=\"dataNascimento\" id=\"dataNascimento\" class=\"input-padrao\" value=\"${param.dataNascimento}\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"estadoCivil\">Estado Civil:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"estadoCivil\" name=\"estadoCivil\" value=\"${param.estadoCivil}\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"cpf\">CPF:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"cpf\" id=\"CPF\" name=\"cpf\" value=\"${param.cpf}\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"rg\">RG:</label>\r\n");
      out.write("        <input type=\"rg\" class=\"input-padrao\" id=\"rg\" name=\"rg\" required value=\"${param.rg}\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"orgaoEmissor\">Orgão Emissor:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"orgaoEmissor\" name=\"orgaoEmissor\" value=\"${param.orgaoEmisor}\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"celular\">Celular:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"telefone\" id=\"celular\" name=\"celular\" value=\"${param.celular}\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"email\">Email:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"email\" id=\"email\" name=\"email\" value=\"${param.email}\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"endereco\">Endereco:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"endereco\" name=\"endereco\" value=\"${param.endereco}\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"infos-pess\">INFORMAÇÕES ACADEMICAS</h1>\r\n");
      out.write("        <label for=\"serie\">Série:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"serie\" name=\"serie\" value=\"${param.serie}\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"sala\">Sala:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"sala\" name=\"sala\" value=\"${param.sala}\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"turma\">Turma:</label>\r\n");
      out.write("        <input class=\"input-padrao\" type=\"text\" id=\"turma\" name=\"turma\" value=\"${param.turma}\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <h2 class=\"infos-pess\">OBSERVAÇÕES ACADEMICAS</h2>\r\n");
      out.write("\r\n");
      out.write("        <textarea class=\"area-texto\" name=\"observacao\" id=\"observacao\" cols=\"120\" rows=\"8\" value=\"${param.observacao}\"></textarea>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"hidden\" id=\"idAluno\" name=\"idAluno\" value=\"${param.idAluno}\">\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Cadastrar\" class=\"cads\">\r\n");
      out.write("        <input type=\"submit\" value=\"Cancelar\" class=\"cancel\">\r\n");
      out.write("    </form>\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
